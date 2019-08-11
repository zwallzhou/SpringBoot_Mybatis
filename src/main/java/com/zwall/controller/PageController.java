package com.zwall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Author Appleyk
 * @Blob https://blog.csdn.net/zwall
 * @Date Created on 下午 12:51 2018-8-31
 */

@Controller
public class PageController {

    @RequestMapping("/")
    public String index(){

        return  "index";
    }
}
