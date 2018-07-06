package com.example.demo01.domain;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

/**
 * @description:
 * @author: Ann
 * @date: 2018/6/23
 */
@Entity
@Table(name = "t_roles")
public class Role implements GrantedAuthority {

    /**
     * 主键id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "r_id")
    private Long id;

    /**
     * 权限名称
     */
    @Column(name = "r_name")
    private String roleName;

    @Override
    public String getAuthority() {
        return roleName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
