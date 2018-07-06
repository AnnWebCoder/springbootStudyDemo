package com.example.demo01.domain;

/**
 * @description: 规范统一返回给前端信息的实体类
 * @author: Ann
 * @date: 2018/6/22
 */
public class ResultEntity<T> {

    /**
     * 返回的状态码
     */
    private int code;

    /**
     * 返回的提示信息
     */
    private String msg;

    /**
     * 返回的内容
     */
    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
