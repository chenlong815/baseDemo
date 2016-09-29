package com.jweb.jdbc;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * Created by chenlong on 2016/9/29.
 */
public class JdbcTest {

    public static void main(String[] args){
        String sqlStr="select * from base_demo_user";
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;

        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://123.206.69.50/baseDemo?useUnicode=true&characterEncoding=utf8","root","cl155213");
            statement=connection.createStatement();
            resultSet=statement.executeQuery(sqlStr);

            while (resultSet.next()){
                System.out.print(resultSet.getInt("id")+"  ");
                System.out.print(resultSet.getString("userName")+"  ");
                System.out.print(resultSet.getString("passWord")+"  ");
                System.out.println(resultSet.getInt("permission")+"  ");
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                connection.close();
            }catch (Exception e1)
            {
                e1.printStackTrace();
            }
            try {
                statement.close();
            }catch (Exception e2)
            {
                e2.printStackTrace();
            }
            try {
                resultSet.close();
            }catch (Exception e3)
            {
                e3.printStackTrace();
            }
        }
    }
}
