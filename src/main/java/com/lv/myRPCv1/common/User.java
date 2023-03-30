/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/26 14:49
 */


package com.lv.myRPCv1.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author levi_bee
 * 客户端和服务端都需要通用实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {
    /**
     *  服务端和客户端都有
     */
    private Integer id;
    private String userName;
    private Boolean sex;
}
