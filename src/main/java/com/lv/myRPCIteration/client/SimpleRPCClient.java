/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/27 16:31
 */


package com.lv.myRPCIteration.client;

import com.lv.myRPCIteration.common.RPCRequest;
import com.lv.myRPCIteration.common.RPCResponse;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author levi_bee
 * 使用java BIO的方式
 */
@AllArgsConstructor
public class SimpleRPCClient implements RPCClient {
    private String host;
    private int port;

    /**
     * 客户端发起一次请求调用，Socket建立连接，发起请求Request，得到响应Response
     * 这里的request是封装好的，不同的service需要进行不同的封装， 客户端只知道Service接口，需要一层动态代理根据反射封装不同的Service
     */
    @Override
    public RPCResponse sendRequest(RPCRequest request) {

            //发起一次Socket请求
            try {
                Socket socket = new Socket(host, port);
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                System.out.println(request);

                oos.writeObject(request);
                oos.flush();
                RPCResponse rpcResponse = (RPCResponse) ois.readObject();
                return rpcResponse;
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                return null;
            }

    }
}
