package com.example.demo02.dao;

import com.example.demo02.domain.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: Ann
 * @date: 2018/7/1
 */
public interface SysUserRepository extends JpaRepository<SysUser, Long> {

    /**
     * 根据用户名查用户
     * @param username
     * @return
     */
    SysUser findByUsername(String username);
}