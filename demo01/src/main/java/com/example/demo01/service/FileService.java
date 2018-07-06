package com.example.demo01.service;

import com.example.demo01.domain.ResultEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * @description:
 * @author: Ann
 * @date: 2018/6/27
 */
public interface FileService {

    /**
     * 上传文件
     * @return
     */
    ResultEntity uploadFile(MultipartFile file);
}
