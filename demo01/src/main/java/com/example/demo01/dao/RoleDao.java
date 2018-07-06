package com.example.demo01.dao;

import com.example.demo01.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @description:
 * @author: Ann
 * @date: 2018/6/24
 */
public interface RoleDao extends JpaRepository<Role, Long> {
}
