package com.jweb.controller;

import com.jweb.model.StuInfo;
import com.jweb.service.StudentService;
import org.springframework.stereotype.Controller;
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
    @RequestMapping(value = "StudentInfo.do",method = RequestMethod.GET)
    public void getStudentInfo(HttpServletRequest request, HttpServletResponse response){
        List<StuInfo> list=studentService.getStudentInfo();
        if(list==null){

        }
        if(list.size()<1){

        }

        HttpSession session=request.getSession();
        session.setAttribute("stuInfo",list);

        String opId=request.getParameter("opId");
        try {
        if (opId.equals("query")){
            response.sendRedirect("studentManSys/stuInfo_show.jsp");
        }else if(opId.equals("update")){
            response.sendRedirect("studentManSys/stuInfo_update.jsp");
        }else if(opId.equals("delete")){
            response.sendRedirect("studentManSys/stuInfo_delete.jsp");
        }}catch (Exception e){
            e.printStackTrace();
        }
    }

    @ResponseBody
    @RequestMapping(value = "updateStudentInfo.do",method = RequestMethod.GET)
    public void updateStudentInfo(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));
        StuInfo stuInfo=studentService.getOneStudent(id);
        if(stuInfo==null){

        }

        HttpSession session=request.getSession();
        session.setAttribute("stuInfo",stuInfo);
        try {
            response.sendRedirect("studentManSys/stuInfo_update_one.jsp");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @ResponseBody
    @RequestMapping(value = "updateCommit.do",method = RequestMethod.POST)
    public void updateCommit(HttpServletRequest request, HttpServletResponse response) {
        int id=Integer.parseInt(request.getParameter("id"));

        String nicheng=request.getParameter("nicheng");
        String truename=request.getParameter("truename");
        byte xb=Byte.parseByte(request.getParameter("xb"));
        String csrq=request.getParameter("csrq");
        String zy=request.getParameter("zy");
        System.out.println(zy);
        //String kc=request.getParameter("kc");
        String kcs[]=request.getParameterValues("kc");
        String xqs[]=request.getParameterValues("xq");
        String bz=request.getParameter("bz");
        StuInfo stu=new StuInfo();

        stu.setId(id);
        stu.setNicheng(nicheng);
        stu.setTruename(truename);
        stu.setXb(xb);

        if(csrq.equals("")){
            stu.setCsrq(null);
        }else{
            stu.setCsrq(csrq);
        }

        stu.setZy(zy);
        if(kcs!=null)
            stu.setKc(kcs);
        if(xqs!=null)
            stu.setXq(xqs);
        stu.setBz(bz);

        boolean ifSuccess=studentService.updateStudentInfo(stu);
        try{
            if(ifSuccess){
                response.sendRedirect("studentManSys/stuInfo_update_one_success.jsp");
            }else{
                response.sendRedirect("studentManSys/stuInfo_update_one.jsp");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @ResponseBody
    @RequestMapping(value = "addStudentInfo.do",method = RequestMethod.POST)
    public void addStudentInfo(HttpServletRequest request, HttpServletResponse response){
        String nicheng=request.getParameter("nicheng");
        String truename=request.getParameter("truename");
        byte xb=Byte.parseByte(request.getParameter("xb"));
        String csrq=request.getParameter("csrq");
        String zy=request.getParameter("zy");
        System.out.println(zy);
        //String kc=request.getParameter("kc");
        String kcs[]=request.getParameterValues("kc");
        String xqs[]=request.getParameterValues("xq");
        String bz=request.getParameter("bz");
        StuInfo stu=new StuInfo();
        stu.setNicheng(nicheng);
        stu.setTruename(truename);

        stu.setCsrq(csrq);
        if(csrq.equals(""))
            stu.setCsrq(null);
        if(kcs!=null)
            stu.setKc(kcs);
        if(xqs!=null)
            stu.setXq(xqs);
        stu.setBz(bz);
        stu.setZy(zy);
        stu.setXb(xb);

        boolean ifSuccess=studentService.addStudentInfo(stu);
        try {
            if (ifSuccess){
                response.sendRedirect("studentManSys/stuInfo_add_success.jsp");
            }else{
                response.sendRedirect("studentManSys/stuInfo_add.jsp");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @ResponseBody
    @RequestMapping(value = "deleteStudent.do",method = RequestMethod.GET)
    public void deleteStudent(HttpServletRequest request, HttpServletResponse response){
        int id=Integer.parseInt(request.getParameter("id"));

        boolean ifSuccess=studentService.deleteStudent(id);
        try{
            if(ifSuccess){
                response.sendRedirect("studentManSys/stuInfo_delete_success.jsp");
            }else {
                response.sendRedirect("studentManSys/stuInfo_delete.jsp");
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
