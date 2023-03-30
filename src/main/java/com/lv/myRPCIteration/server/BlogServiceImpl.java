/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/27 14:32
 */


package com.lv.myRPCIteration.server;

import com.lv.myRPCIteration.common.Blog;
import com.lv.myRPCIteration.service.BlogService;

/**
 * @author levi_bee
 */
public class BlogServiceImpl implements BlogService {
    @Override
    public Blog getBlogById(Integer id) {
        Blog blog = Blog.builder().id(id).title("我的博客").useId(22).build();
        System.out.println("客户端查询了：" + id + "博客");
        return blog;
    }
}
