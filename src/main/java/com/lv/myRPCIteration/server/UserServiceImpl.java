/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/26 15:00
 */


package com.lv.myRPCIteration.server;

import com.lv.myRPCv1.common.User;
import com.lv.myRPCIteration.service.UserService;

import java.util.Random;
import java.util.UUID;

/**
 * @author levi_bee
 * 服务端需要实现Service接口的功能
 */
public class UserServiceImpl implements UserService {

    @Override
    public User getUserById(Integer id) {
        System.out.println("客户端查询了" + id + "的用户");
        Random random = new Random();
        //@Builder 注解实现的构造方法
        return User.builder().userName(UUID.randomUUID().toString()).id(id).sex(random.nextBoolean()).build();
    }

    @Override
    public Integer insertUserId(User user) {
        System.out.println("插入数据成功：" + user);
        return 1;
    }
}
