package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.Customer;
import com.tmxf.lms.entity.User;
import com.tmxf.lms.mapper.UserMapper;
import com.tmxf.lms.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author TMXIAOPAI
 * @date 2020/3/31 - 23:20
 * @package_name com.tmxf.lms.service.Impl
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findNote();
    }

    @Override
    public User findUserLoginInfoByUserNum(Integer userNum) {
        return userMapper.findByUserNum(userNum);
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }
}
