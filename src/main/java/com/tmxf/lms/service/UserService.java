package com.tmxf.lms.service;

import com.tmxf.lms.entity.User;

import java.util.List;

/**
 * The interface User service.
 *
 * @author TMXIAOPAI
 * @date 2020 /3/31 - 23:11
 * @package_name com.tmxf.lms.service
 */
public interface UserService {
    /**
     * 查询所有用户信息
     *
     * @return list
     */
    List<User> findAll();

    /**
     * 根据用户编号查询用户信息
     *
     * @param userNum the user num
     * @return user
     */
    User findUserLoginInfoByUserNum(Integer userNum);

    /**
     * 新建用户
     *
     * @param user the user
     * @return int
     */
    int insertUser(User user);

    /**
     * 更新用户信息
     *
     * @param user the user
     * @return int
     */
    int updateUserBuPrimaryKey(User user);

    /**
     * 删除用户
     *
     * @param userId the user id
     * @return int
     */
    int deleteUser(Integer userId);

    /**
     * 密码加密
     *
     * @param password the password
     * @param userNum  the user num
     * @return string
     */
    String encodingPassword(String password, Integer userNum);

    /**
     * Update login time int.
     *
     * @param userNum the user num
     * @return the int
     */
    int updateLoginTime(Integer userNum);

    List<User> queryByUser(User user);

}
