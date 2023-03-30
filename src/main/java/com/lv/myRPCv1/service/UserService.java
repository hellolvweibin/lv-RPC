/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/26 14:58
 */

package com.lv.myRPCv1.service;

import com.lv.myRPCv1.common.User;

/**
 * @author levi_bee
 * 服务端提供的接口
 */
public interface UserService {
    /**
     * 客户端通过这个方法调用服务端的实现类
     */
    User getUserById(Integer id);
}
