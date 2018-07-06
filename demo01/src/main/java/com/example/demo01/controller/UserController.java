package com.example.demo01.controller;

import com.example.demo01.dao.UserDao;
import com.example.demo01.domain.ResultEntity;
import com.example.demo01.domain.Role;
import com.example.demo01.domain.User;
import com.example.demo01.service.AuthorityService;
import com.example.demo01.service.FileService;
import com.example.demo01.service.UserService;
import com.example.demo01.service.UserServiceImpl;
import com.example.demo01.util.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: Ann
 * @date: 2018/6/22
 */
@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    private final static Logger logger = LoggerFactory.getLogger(IndexController.class);

    private static final Long ROLE_USER_AUTHORITY_ID = 2L;
    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private AuthorityService authorityService;

    @Autowired
    private FileService fileService;

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public ResultEntity<String> test() {
        return ResultUtil.success("胜多负少的啦");
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResultEntity<String> register(User user) {
        List<Role> roles = new ArrayList<>();
        roles.add(authorityService.getAuthorityById(ROLE_USER_AUTHORITY_ID));
        user.setAuthorities(roles);
        return ResultUtil.success(userService.registerUser(user));
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public ResultEntity<String> save(User user, Long roleId) {
        List<Role> roles = new ArrayList<>();
        roles.add(authorityService.getAuthorityById(roleId));
        user.setAuthorities(roles);
        return ResultUtil.success(userService.saveOrUpdateUser(user));
    }

    @RequestMapping(value = "/page", method = RequestMethod.POST)
    public ResultEntity<String> page(int pageNum, int pageSize) {
        return ResultUtil.success(userService.page(pageNum, pageSize));
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public ResultEntity<String> upload(@RequestParam("file") MultipartFile file) {
        return fileService.uploadFile(file);
    }

    @RequestMapping(value = "/abc", method = RequestMethod.POST)
    public String login(@RequestBody User user, HttpServletRequest request) {

        logger.info("[UserController-login]接受到的参数：{}", user);

        boolean flag = true;

        String result = "登录成功";

//        UserDetails userDetails = userService.loadUserByUsername(user.getUsername());

        User byUser = userDao.findByUser(user.getUsername());

        if (byUser == null) {
            flag = false;
            result = "用户不存在";
        } else if (!byUser.getPassword().equals(user.getPassword())) {
            flag = false;
            result = "密码不正确";
        }

        if (flag) {
            /** 写入sessiom **/
            request.getSession().setAttribute("_session_user", byUser);
        }
        return result;
    }

}
