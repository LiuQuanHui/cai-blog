package com.caiheng.blog.dao;

import com.caiheng.blog.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author cai heng
 * @since 2019/5/19 20:24
 */
public interface UserDao {

    /**
     * 登录
     *
     * @param username username
     * @param password password
     * @return User
     */
    User login(@Param("username") String username, @Param("password") String password);
}
