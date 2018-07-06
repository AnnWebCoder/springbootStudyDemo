package com.example.demo01.handle;

import com.example.demo01.domain.ResultEntity;
import com.example.demo01.exception.NormalException;
import com.example.demo01.util.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 定义一个捕获异常
 * @author: Ann
 * @date: 2018/6/23
 */
@ControllerAdvice
public class ExceptionHandle {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResultEntity handle(Exception e) {
        if (e instanceof NormalException) {
            NormalException normalException = (NormalException) e;
            return ResultUtil.error(normalException.getCode(), normalException.getMessage());
        }
        return ResultUtil.error(-1, "未知错误");
    }
}
