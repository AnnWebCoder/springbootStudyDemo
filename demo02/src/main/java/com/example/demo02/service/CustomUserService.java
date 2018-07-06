package com.example.demo02.service;

import com.example.demo02.dao.SysUserRepository;
import com.example.demo02.domain.SysUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import javax.annotation.Resource;

/**
 * @description:
 * @author: Ann
 * @date: 2018/7/1
 */
public class CustomUserService implements UserDetailsService {

    @Resource
    private SysUserRepository sysUserRepository;

    //重写获得用户
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUser user = sysUserRepository.findByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("用户不存在");
        }
        return user;
    }

}
