package com.example.demo01.util;

import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:
 * @author: Ann
 * @date: 2018/6/27
 */
public class FileUtil {

    /**
     * 上传文件工具类
     * @param file 前端传过来的文件
     * @param filePath 文件存放的路径
     * @param filename 文件的名称
     * @throws IOException
     */
    public static String uploadFile(MultipartFile file, String filePath, String filename) throws IOException {

        // 如果目录不存在，自动创建文件夹
        File dir = new File(filePath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        //服务器端保存的文件对象
        File serverFile = new File(filePath + filename);
        if (!file.isEmpty()) {
            try {
                byte[] bytes = file.getBytes();
                BufferedOutputStream buffStream =
                        new BufferedOutputStream(new FileOutputStream(serverFile));
                buffStream.write(bytes);
                buffStream.close();
                return serverFile.getName();
            } catch (Exception e) {
                return "You failed to upload + " + e.getMessage();
            }
        } else {
            return "Unable to upload. File is empty.";
        }
//        file.transferTo(serverFile);
//        return serverFile.getName();
    }
}
