package com.jweb.controller;

import com.jweb.model.stuInfo;
import com.jweb.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class StudentController {
    @Resource
    StudentService studentService;

    @ResponseBody
    @RequestMapping(value = "getStudentInfo.do",method = RequestMethod.GET)
    public void getStudentInfo(HttpServletRequest request, HttpServletResponse response){

        List<stuInfo> list=studentService.getStudentInfo();
        if(list==null){

        }
        if(list.size()<1){

        }
        HttpSession session=request.getSession();
        session.setAttribute("stuInfo",list);
        try {
            response.sendRedirect("studentManSys/stuInfo_show.jsp");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
