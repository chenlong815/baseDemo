package com.jweb.controller;

import com.jweb.common.StateMsg;
import com.jweb.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 测试
 * Created by chenlong on 2016/5/11.
 */
@Controller
public class TestController {
    @Resource
    TestService testService;

    @ResponseBody
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(ModelMap map){
        String jsonStr;
        String msg;
        msg=testService.testService();
        map.addAttribute("test",msg);
        jsonStr= StateMsg.toJson(1, map);
        return jsonStr;
    }

    @ResponseBody
    @RequestMapping(value = "view",method = RequestMethod.GET)
    public String page(ModelMap map){

        return "/login";
    }
}
