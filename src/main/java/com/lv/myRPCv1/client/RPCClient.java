/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/26 15:06
 */


package com.lv.myRPCv1.client;

import com.lv.myRPCv1.common.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Random;

/**
 * @author levi_bee
 * 客户端建立Socket连接，传输ID给服务器，得到返回的User对象
 */
public class RPCClient {
    public static void main(String[] args) {
        try {
            //建立Socket 连接
            Socket socket = new Socket("127.0.0.1", 8899);
            //构造输出流和输入流
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
            //传给服务器id
            objectOutputStream.writeInt(new Random().nextInt());
            objectOutputStream.flush();
            //服务器查询数据，返回对应的对象
            User user = (User) objectInputStream.readObject();
            System.out.println("服务端返回的User:" + user);


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("客户端启动失败");
        }
    }
}
