package com.caiheng.blog.controller;

import com.caiheng.blog.common.Const;
import com.caiheng.blog.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author cai heng
 * @since 2019/5/19 20:17
 */
@Controller
public class AbstractController {

    /**
     * 统一定义日志
     */
    private Logger log = LoggerFactory.getLogger(this.getClass());


    /**
     * 获取当前登录session中用户 不校验是否为空
     *
     * @param request request
     * @return user
     */
    private User getCurrentUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        return (User) session.getAttribute(Const.CURRENT_USER);
    }

}
