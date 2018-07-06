package com.example.demo01.service;

import com.example.demo01.dao.RoleDao;
import com.example.demo01.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Ann
 * @date: 2018/6/24
 */
@Service
public class AuthorityServiceImple implements AuthorityService {

    @Autowired
    private RoleDao roleDao;

    @Override
    public Role getAuthorityById(Long id) {
        return roleDao.findById(id).get();
    }
}
