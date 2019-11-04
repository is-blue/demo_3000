package com.baidu.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponse<T> implements Serializable {

    /**
     * 业务码：0（成功），1（失败）
     */
    private Integer code;
    /**
     * 业务描述，提示信息
     */
    private String message;

    /**
     * 返回的数据
     */
    private T data;

    public CommonResponse(Integer code, String message){
        this.code=code;
        this.message=message;
    }










}
