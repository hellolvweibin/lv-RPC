/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/27 09:44
 */

package com.lv.myRPCIteration.service;

import com.lv.myRPCIteration.common.User;

/**
 * @author levi_bee
 */
public interface UserService {
    /**
     * 客户端通过这个方法调用服务端的实现类
     */
    User getUserByUserId(Integer id);
    /**
     * 增加插入用户id功能
     */
    Integer insertUserId(User user);
}
