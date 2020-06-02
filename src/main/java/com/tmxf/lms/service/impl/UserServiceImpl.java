package com.tmxf.lms.service.impl;

import com.tmxf.lms.entity.User;
import com.tmxf.lms.mapper.UserMapper;
import com.tmxf.lms.service.UserService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * The type User service.
 *
 * @author TMXIAOPAI
 * @date 2020 /3/31 - 23:20
 * @package_name com.tmxf.lms.service.Impl
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.selectAll();
    }

    @Override
    public User findUserLoginInfoByUserNum(Integer userNum) {
        return userMapper.findByUserNum(userNum);
    }

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }


    @Override
    public int updateUserBuPrimaryKey(User user) {
        return userMapper.update(user);
    }

    @Override
    public int deleteUser(Integer userId) {
        return userMapper.deleteUser(userId);
    }
    @Override
    public String encodingPassword(String password, Integer userNum) {
        return new SimpleHash("md5",password, ByteSource.Util.bytes(String.valueOf(userNum)),1024).toString();
    }

    @Override
    public int updateLoginTime(Integer userNum) {
        return userMapper.updateLoginTime(userNum,new Date());
    }

    @Override
    public List<User> queryByUser(User user) {
        return userMapper.queryAll(user);
    }

    @Override
    public String findPasswordByUserNum(Integer userNum) {
        return userMapper.findPasswordByUserNum(userNum);
    }

    @Override
    public User findMyInfo(Integer userNum) {
        return userMapper.findMyInfo(userNum);
    }

    @Override
    public void updatePassword(String password, Integer userNum) {
        userMapper.updatePassword(password, userNum);
    }
}
