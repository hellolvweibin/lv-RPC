/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/27 09:48
 */


package com.lv.myRPCIteration.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author levi_bee
 * 定义一个通用的Request 对象
 */
@Data
@Builder
@AllArgsConstructor
public class RPCRequest implements Serializable {
    // 服务类名，客户端只知道接口名，在服务端中用接口名指向实现类
    private String interfaceName;
    // 方法名
    private String methodName;
    // 参数列表
    private Object[] params;
    // 参数类型
    private Class<?>[] paramsTypes;
}
