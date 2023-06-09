/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/27 11:07
 */


package com.lv.myRPCIteration.client;

import com.lv.myRPCIteration.common.RPCRequest;
import com.lv.myRPCIteration.common.RPCResponse;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @author levi_bee
 * 底层的通信
 * 这里负责底层与服务端的通信，发送的Request，接受的是Response对象
 * 客户端发起一次请求调用，Socket建立连接，发起请求Request，得到响应Response
 * 这里的request是封装好的（上层进行封装），不同的service需要进行不同的封装， 客户端只知道Service接口，需要一层动态代理根据反射封装不同的Service
 */
public class IOClient {
    public static RPCResponse sendRequest(String host, int port, RPCRequest request){
        try {
            Socket socket = new Socket(host, port);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());

            System.out.println(request);
            objectOutputStream.writeObject(request);
            objectOutputStream.flush();
            RPCResponse response = (RPCResponse) objectInputStream.readObject();
            return  response;


        }catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
