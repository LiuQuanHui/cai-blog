package com.caiheng.blog.service;

import com.caiheng.blog.response.ServerResponse;

/**
 * @author cai heng
 * @since 2019/5/19 20:35
 */
public interface UserService {

    ServerResponse login(String username, String password);
}
