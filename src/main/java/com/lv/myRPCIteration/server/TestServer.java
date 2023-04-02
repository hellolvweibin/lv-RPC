/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/27 14:38
 */


package com.lv.myRPCIteration.server;

import com.lv.myRPCIteration.service.BlogService;
import com.lv.myRPCIteration.service.BlogServiceImpl;
import com.lv.myRPCIteration.service.UserService;
import com.lv.myRPCIteration.service.UserServiceImpl;

/**
 * @author levi_bee
 */
public class TestServer {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        BlogService blogService = new BlogServiceImpl();

        ServiceProvider serviceProvider = new ServiceProvider();
        serviceProvider.provideServiceInterface(userService);
        serviceProvider.provideServiceInterface(blogService);

        RPCServer RPCServer = new NettyRPCServer(serviceProvider);
        RPCServer.start(8899);
    }
}