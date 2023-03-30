/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/27 09:50
 */


package com.lv.myRPCIteration.common;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @author levi_bee
 * 定义一个通用的返回消息格式
 */
@Data
@Builder
public class RPCResponse implements Serializable {
    // 状态信息
    private int code;
    private String message;
    // 具体数据
    private Object data;

    public static RPCResponse success(Object data) {
        return RPCResponse.builder().code(200).message("成功！").data(data).build();
    }
    public static RPCResponse fail() {
        return RPCResponse.builder().code(500).message("服务器发生错误").build();
    }
}
