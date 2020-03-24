package com.tmxf.lms.service;

import com.tmxf.lms.domain.User;
import com.tmxf.lms.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author TMXIAOPAI
 * @date 2020/3/19 - 17:04
 * @package_name com.tmxf.Service
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User findByName(String username) {
        System.out.println("service层中出现的用户名"+username);
        User u=userMapper.findByName(username);
        return u;
    }

    public User findById(int id) {
        User u=userMapper.findById(id);
        return u;
    }
}
