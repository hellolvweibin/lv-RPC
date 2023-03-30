/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/26 15:17
 */


package com.lv.myRPCv1.server;

import com.lv.myRPCv1.common.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author levi_bee
 * 服务端以BIO(同步阻塞)的方式监听Socket，如有数据，调用对应服务的实现类执行任务，将结果返回给客户端
 */
public class RPCServer {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        try {
            ServerSocket serverSocket = new ServerSocket(8899);
            System.out.println("服务端启动了....");
            // BIO的方式监听Socket
            while(true){
                Socket accept = serverSocket.accept();
                //开启一个线程处理
                new Thread(()->{
                    try {
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(accept.getOutputStream());
                        ObjectInputStream objectInputStream = new ObjectInputStream(accept.getInputStream());
                        //读取从客户端传来的id
                        Integer id = objectInputStream.readInt();
                        User userById = userService.getUserById(id);
                        //写入User返回给客户端
                        objectOutputStream.writeObject(userById);
                        objectOutputStream.flush();
                    }catch (IOException e){
                        e.printStackTrace();
                        System.out.println("从IO中读取数据失败");
                    }
                }).start();
            }
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("服务器启动失败");
        }
    }
}
