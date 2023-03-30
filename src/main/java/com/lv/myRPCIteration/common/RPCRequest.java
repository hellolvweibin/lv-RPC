/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/27 09:48
 */


package com.lv.myRPCIteration.common;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author levi_bee
 * 定义一个通用的Request 对象
 */
@Data
@Builder
public class RPCRequest implements Serializable {
    /**
     * 连接名称
     */
    private String interfaceName;
    /**
     * 方法名
     */
    private String methodName;
    /**
     * 参数集合
     */
    private Object[] params;
    /**
     * 参数类型
     */
    private Class<?>[] paramsTypes;


}
