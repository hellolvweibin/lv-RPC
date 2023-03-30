/*
 *@Project ：lv-RPC
 *@Author  ：Levi_Bee
 *@Date    ：2023/3/27 14:29
 */


package com.lv.myRPCIteration.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author levi_bee
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Blog implements Serializable {
    private Integer id;
    private Integer useId;
    private String title;
}
