package com.caiheng.blog.service.impl;

import com.caiheng.blog.common.Const;
import com.caiheng.blog.dao.UserDao;
import com.caiheng.blog.entity.User;
import com.caiheng.blog.response.ResponseCode;
import com.caiheng.blog.response.ServerResponse;
import com.caiheng.blog.service.UserService;
import com.caiheng.blog.util.DesensitizeUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.crypto.Des;

/**
 * @author cai heng
 * @since 2019/5/19 20:38
 */
@Service
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public ServerResponse login(String username, String password) {
        if (StringUtils.isBlank(username) || StringUtils.isBlank(password)) {
            return ServerResponse.createByErrorMessage(ResponseCode.ILLEGAL_ARGUMENT.getMsg());
        }
        User user = userDao.login(username, password);
        if (user == null) {
            return ServerResponse.createByErrorMessage("用户名或密码错误");
        }
        user.setEmail(DesensitizeUtil.email(user.getEmail()));
        user.setPassword(DesensitizeUtil.password(user.getPassword()));
        return ServerResponse.createBySuccess("登录成功", user);
    }
}
