package com.qingcheng.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qingcheng.pojo.system.LoginLog;
import com.qingcheng.service.system.LoginLogService;
import com.qingcheng.utils.WebUtil;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author zhangyan
 * @version 1.0
 * @date 2019/7/17 16:24
 */


public class AuthenticationSuccessHandlerImpl implements AuthenticationSuccessHandler {

    @Reference
    private LoginLogService loginLogService;


    @Override
    public void onAuthenticationSuccess(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Authentication authentication) throws IOException, ServletException {
        String name = authentication.getName();
        String remoteAddr = httpServletRequest.getRemoteAddr();
        LoginLog loginLog= new LoginLog();
        loginLog.setLoginName(name);
        loginLog.setLoginTime(new Date());
        loginLog.setIp(remoteAddr);
        String cityByIP = WebUtil.getCityByIP(remoteAddr);

        String browserName = WebUtil.getBrowserName(httpServletRequest.getHeader("user-agent"));
        loginLog.setBrowserName(browserName);
        loginLog.setLocation(cityByIP);
        loginLogService.add(loginLog);
        httpServletRequest.getRequestDispatcher("/main.html").forward(httpServletRequest,
                httpServletResponse);
    }


}
