package com.lv.myRPCIteration.register;

import java.net.InetSocketAddress;

/**
 * @Project ：lv-RPC
 * @Author ：Levi_Bee
 * @Date ：2023/3/30 15:39
 * @description ：服务注册接口，两大基本功能 1. 注册： 保存服务和地址，2. 查询：根据服务名查询地址
 */

public interface ServiceRegister {
    /**
     * InetSocketAddress此类实现 IP 套接字地址（IP 地址 + 端口号），它也可以是一对（主机名 + 端口号），在这种情况下，将尝试解析主机名。
     */
    void register(String serviceName, InetSocketAddress socketAddress);
    InetSocketAddress serviceDiscovery(String serviceName);
}
