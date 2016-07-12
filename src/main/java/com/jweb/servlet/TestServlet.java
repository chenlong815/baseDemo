package com.jweb.servlet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class TestServlet extends HttpServlet{
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
//        String userName=req.getParameter("userName");
//        String passWord=req.getParameter("passWord");
//        System.out.println(userName+":"+passWord);
//
//    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        String userName=req.getParameter("userName");
        String passWord=req.getParameter("passWord");
        System.out.println("用户名："+userName);
        System.out.println("密码："+passWord);

//        请求重定向//可以跳转到其他Url
//        resp.sendRedirect(req.getContextPath()+"/view/login.jsp");

//        请求转发//无法跳转到其他项目
        RequestDispatcher rd=req.getRequestDispatcher("/view/login.jsp");
        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
