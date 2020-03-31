package com.example.demo.controller;

import com.example.demo.dao.mysql.UserBeanMapper;
import com.example.demo.dao.oracle.NkParameterBeanMapper;
import com.example.demo.model.mysql.UserBean;
import com.example.demo.model.mysql.UserBeanExample;
import com.example.demo.model.oracle.NkParameterBean;
import com.example.demo.model.oracle.NkParameterBeanExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * demo-com.example.demo.controller
 *
 * @author zhangrk
 * @date 2020/3/30
 */
@Controller
@RequestMapping("/")
public class TestController {

    @Autowired
    private UserBeanMapper userBeanMapper;

    @Autowired
    private NkParameterBeanMapper nkParameterBeanMapper;

    @GetMapping("test")
    public String test(HttpServletRequest request) {
        UserBeanExample example = new UserBeanExample();
        example.createCriteria();

        List<UserBean> userBeans = userBeanMapper.selectByExample(example);
        System.out.println();
        return "index.html";
    }

    @GetMapping("test2")
    public String test2(HttpServletRequest request) {
        NkParameterBeanExample example = new NkParameterBeanExample();
        example.createCriteria();

        List<NkParameterBean> nkParameterBeans = nkParameterBeanMapper.selectByExample(example);

        System.out.println();
        return "index.html";
    }
}