/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/27 14:45
 */

package com.lv.myRPCIteration.server;

/**
 * @author levi_bee
 * 开放封闭原则，抽象成接口
 */
public interface RPCServer {
    void start (int port);
    void stop();
}
