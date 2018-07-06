package com.example.demo01.enums;

/**
 * @description: 统一状态码跟提示信息
 * @author: Ann
 * @date: 2018/6/23
 */
public enum ResultEmun {
    UNKNOW_ERROR(-1, "未知错误"),
    SUCCESS(0, "成功"),

    ;

    /**
     * 状态码
     */
    private int code;

    /**
     * 提示信息
     */
    private String msg;

    ResultEmun(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
