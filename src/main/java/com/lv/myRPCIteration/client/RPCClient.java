/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/27 11:29
 */


package com.lv.myRPCIteration.client;

import com.lv.myRPCIteration.common.RPCRequest;
import com.lv.myRPCIteration.common.RPCResponse;

/**
 * @author levi_bee
 * 客户端访问不同的接口
 */
public interface RPCClient {
    RPCResponse sendRequest(RPCRequest request);
}
