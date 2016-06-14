package com.base.controller;/**
 * Created by chenlong on 2016/5/11.
 */

import com.base.common.StateMsg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 测试
 * Created by chenlong on 2016/5/11.
 */
@Controller
public class TestController {
    @ResponseBody
    @RequestMapping(value = "test",method = RequestMethod.GET)
    public String test(ModelMap map){
        String jsonStr;
        map.addAttribute("test","test by ChenLong");
        jsonStr= StateMsg.toJson(1, map);
        return jsonStr;
    }

    @ResponseBody
    @RequestMapping(value = "view",method = RequestMethod.GET)
    public String page(ModelMap map){

        return "/login";
    }
}
