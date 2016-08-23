package com.jweb.servlet;

import com.jweb.model.userTable;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet{
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
        String userName=req.getParameter("userName");
        String passWord=req.getParameter("passWord");
        System.out.println("用户名："+userName);
        System.out.println("密码："+passWord);

        userTable user = new userTable();
        user.setUsername(userName);
        user.setPassword(passWord);

        try {
                HttpSession session=req.getSession();
                session.setAttribute("user", user);
                resp.sendRedirect("studentManSys/main.jsp");
            } catch (IOException e) {

            e.printStackTrace();
        }

//        请求重定向//可以跳转到其他Url
//        resp.sendRedirect(req.getContextPath()+"/view/loginInfo.jsp");

//        请求转发//无法跳转到其他项目
//        RequestDispatcher rd=req.getRequestDispatcher("/studentManSys/main.jsp");
//        rd.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
