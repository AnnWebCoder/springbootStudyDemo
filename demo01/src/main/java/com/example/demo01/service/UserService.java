package com.example.demo01.service;

import com.example.demo01.domain.User;
import com.example.demo01.domain.rep.PageRep;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @description: 用户接口，定义一些用户操作接口
 * @author: Ann
 * @date: 2018/6/24
 */
public interface UserService {

    /**
     * 新增、修改用户
     * @param user
     * @return
     */
    User saveOrUpdateUser(User user);

    /**
     * 注册用户
     * @param user
     * @return
     */
    User registerUser(User user);

    /**
     * 删除用户
     * @param user
     * @return
     */
    void removeUser(User user);

    /**
     * 根据id获取用户
     * @param id
     * @return
     */
    User getUserById(Long id);

    /**
     * 分页查询
     * @param pageSize
     * @param pageNum
     * @return
     */
    public PageRep page(int pageNum, int pageSize);
}
