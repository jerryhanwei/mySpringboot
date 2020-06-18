package com.han.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping("gotoLoginPage")
    public String account()
    {
        return "account";
    }

    @RequestMapping({"/","goMainPage"})
    public String goMainPage()
    {
        return "main";
    }

    @PostMapping(value = "/getLoginInfo")
    public String login(@RequestParam("username")String username,
                        @RequestParam("pwd")String pwd, Map msgMap, HttpServletRequest request)
    {
        if(username.equals("tom"))
        {
            System.out.println("login");
            request.getSession().setAttribute("myuser",username);
            return "redirect:main";
        }
        msgMap.put("mymsg","登录失败!");
        return "account";
    }
}



