package com.example.demo01.util;

import com.example.demo01.domain.ResultEntity;

/**
 * @description: 返回给前端的结果的工具类
 * @author: Ann
 * @date: 2018/6/22
 */
public class ResultUtil {

    /**
     * 成功
     * @param o
     * @return
     */
    public static ResultEntity success(Object o) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(0);
        resultEntity.setMsg("成功");
        resultEntity.setData(o);
        return resultEntity;
    }

    public static ResultEntity success() {
        return success(null);
    }

    /**
     * 失败
     * @param code
     * @param msg
     * @return
     */
    public static ResultEntity error(int code, String msg) {
        ResultEntity resultEntity = new ResultEntity();
        resultEntity.setCode(code);
        resultEntity.setMsg(msg);
        return resultEntity;
    }
}
