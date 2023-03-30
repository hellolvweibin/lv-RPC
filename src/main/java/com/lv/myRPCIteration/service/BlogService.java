/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/27 14:30
 */

package com.lv.myRPCIteration.service;

import com.lv.myRPCIteration.common.Blog;

/**
 * @author levi_bee
 */
public interface BlogService {
    /**
     * 根据id 查询Blog
     */
    Blog getBlogById(Integer id);
}
