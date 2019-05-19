package com.caiheng.blog.controller;

import com.caiheng.blog.response.ServerResponse;
import com.caiheng.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author cai heng
 * @since 2019/5/19 20:15
 */
@Controller
public class UserController extends AbstractController {

    @Autowired
    private UserService userService;

    @RequestMapping("/user/login")
    @ResponseBody
    public ServerResponse login(String username, String password) {
        return userService.login(username, password);
    }
    @RequestMapping("/home")
    public String home() {
    	return "login";
    }
    public String show() {
    	return "";
    }
}
