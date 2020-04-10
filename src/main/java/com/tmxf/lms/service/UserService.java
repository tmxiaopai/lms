package com.tmxf.lms.service;

import com.tmxf.lms.entity.User;

import java.util.List;

/**
 * @author TMXIAOPAI
 * @date 2020/3/31 - 23:11
 * @package_name com.tmxf.lms.service
 */
public interface UserService {
    /**
     * 查询所有用户信息
     *
     * @return
     */
    List<User> findAll();

    /**
     * 根据用户编号查询用户信息
     *
     * @param userNum
     * @return
     */
    User findUserLoginInfoByUserNum(Integer userNum);

    /**
     * 插入用户信息
     *
     * @param user
     */
    int insertUser(User user);

    /**
     * 根据工号查找用户ID
     *
     * @param userNum
     * @return
     */
    int findUserIdByUserNum(Integer userNum);

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    int updateUserBuPrimaryKey(User user);

    int deleteUser(Integer userId);

}
