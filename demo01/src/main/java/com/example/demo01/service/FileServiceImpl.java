package com.example.demo01.service;

import com.example.demo01.domain.ResultEntity;
import com.example.demo01.util.FileUtil;
import com.example.demo01.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @description:
 * @author: Ann
 * @date: 2018/6/27
 */
@Service
public class FileServiceImpl implements FileService {

    /**
     * 文件上传路径
     */
    @Value("${project.imagesPath}")
    private String logoPath;

    /** 日志 **/
    private Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 上传文件
     * @return
     */
    @Override
    public ResultEntity uploadFile(MultipartFile file) {
        // 获取文件名
        String fileName = file.getOriginalFilename();
        logger.info("[FileServiceImpl-uploadFile-fileName]获取文件的名称：{}", fileName);
        // 获取文件的后缀名
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        logger.info("[FileServiceImpl-uploadFile-suffixName]获取文件的后缀名：{}", suffixName);
        // 上传到服务器的文件名称
        String serverFileName = UUID.randomUUID() + suffixName;
        logger.info("[FileServiceImpl-uploadFile-serverFileName]获取上传到服务器的文件名称：{}", serverFileName);
        try {
            String repFileName = FileUtil.uploadFile(file, logoPath, serverFileName);
            logger.info("[FileServiceImpl-uploadFile-repFileName]返回到前端的文件路径：{}", repFileName);
            ResultEntity resultEntity = ResultUtil.success();
            resultEntity.setData(repFileName);
            return resultEntity;
        } catch (IOException e) {
            logger.info("[FileServiceImpl-uploadFile-repFileName]返回到前端的文件路径：{}", e.getMessage());
            return null;
        }
    }
}
