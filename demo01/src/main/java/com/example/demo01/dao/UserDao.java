package com.example.demo01.dao;

import com.example.demo01.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: Ann
 * @date: 2018/6/24
 */
public interface UserDao extends JpaRepository<User, Long> {

    /**
     * 根据账号查询用户是否存在
     * @param user
     * @return
     */
    User findByUser(String user);
}
