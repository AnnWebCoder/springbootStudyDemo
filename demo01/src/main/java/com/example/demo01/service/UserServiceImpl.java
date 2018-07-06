package com.example.demo01.service;

import com.example.demo01.dao.UserDao;
import com.example.demo01.domain.Role;
import com.example.demo01.domain.User;
import com.example.demo01.domain.rep.PageRep;
import com.example.demo01.domain.rep.UserRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 用户接口实现
 * @author: Ann
 * @date: 2018/6/24
 */
@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserDao userDao;

    @Transactional
    @Override
    public User saveOrUpdateUser(User user) {
        return userDao.save(user);
    }

    @Transactional
    @Override
    public User registerUser(User user) {
        return userDao.save(user);
    }

    @Override
    public void removeUser(User user) {
        userDao.delete(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDao.findById(id).get();
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        return userDao.findByUser(s);
    }

    @Override
    public PageRep page(int pageNum, int pageSize) {
        List<User> users;
        UserRep userRep;
        PageRep pageRep = new PageRep();
        List<UserRep> userRepsList = new ArrayList<>();
        Page<User> all = userDao.findAll(PageRequest.of(pageNum, pageSize));
        pageRep.setCurrentNum(all.getNumber());
        pageRep.setTotal(all.getTotalPages());
        users = all.getContent();
        for (int i = 0; i < users.size(); i++ ) {
            userRep = new UserRep();
            userRep.setRoles((List<Role>) users.get(i).getAuthorities());
            userRep.setId(users.get(i).getId());
            userRep.setUsername(users.get(i).getUsername());
            userRepsList.add(userRep);
        }
        pageRep.setUsers(userRepsList);
        return pageRep;
    }
}
