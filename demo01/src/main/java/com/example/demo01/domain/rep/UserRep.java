package com.example.demo01.domain.rep;

import com.example.demo01.domain.Role;

import java.util.List;

/**
 * @description:
 * @author: Ann
 * @date: 2018/6/26
 */
public class UserRep {

    private Long id;

    private String username;

    private List<Role> roles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
