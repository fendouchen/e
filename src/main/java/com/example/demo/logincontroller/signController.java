package com.example.demo.logincontroller;

import com.example.demo.LoginJpa.LoginJpa;
import com.example.demo.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description Description
 * @Author Coder
 * @Date Created in 2020/1/1
 */
@Controller
public class signController {

    @Autowired
    private LoginJpa loginJpa;

    @RequestMapping(value = "/login" , method = RequestMethod.GET)
    public String SignLogin(){
        return "index";
    }
    @ResponseBody
    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public List<UserEntity> findAll(){
        return  loginJpa.findAll();
    }

}
