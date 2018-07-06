package com.example.demo01.service;

import com.example.demo01.domain.Role;

/**
 * @description: Authority权限接口
 * @author: Ann
 * @date: 2018/6/24
 */
public interface AuthorityService {

    /**
     * 根据id查询权限role
     * @param id
     * @return
     */
    Role getAuthorityById(Long id);
}
