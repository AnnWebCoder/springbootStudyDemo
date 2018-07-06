package com.example.demo01.exception;

import com.example.demo01.enums.ResultEmun;

/**
 * @description:
 * @author: Ann
 * @date: 2018/6/23
 */
public class NormalException extends RuntimeException {

    private int code;

    public NormalException(ResultEmun resultEmun) {
        super(resultEmun.getMsg());
        this.code = resultEmun.getCode();
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
