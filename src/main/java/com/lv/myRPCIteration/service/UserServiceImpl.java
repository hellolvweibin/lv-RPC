/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/26 15:00
 */


package com.lv.myRPCIteration.service;

import com.lv.myRPCIteration.common.User;
/**
 * @author levi_bee
 * 服务端需要实现Service接口的功能
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUserByUserId(Integer id) {
        // 模拟从数据库中取用户的行为
        User user = User.builder().id(id).userName("lvRPC").sex(true).build();
        System.out.println("客户端查询了"+id+"用户");
        return user;
    }

    @Override
    public Integer insertUserId(User user) {
        System.out.println("插入数据成功："+user);
        return 1;
    }
}

