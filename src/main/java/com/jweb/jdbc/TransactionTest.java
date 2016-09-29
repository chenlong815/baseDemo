package com.jweb.jdbc;

import java.sql.*;

/**
 * Created by chenlong on 2016/9/29.
 */

//jdbc事务的处理
public class TransactionTest {
    public static Connection getConnection(){
        Connection connection=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection("jdbc:mysql://123.206.69.50/baseDemo?useUnicode=true&characterEncoding=utf8","root","cl155213");

        }catch (Exception e){
            e.printStackTrace();
        }
        return connection;
    }

    public static void insertUser(Connection connection) throws SQLException{
        String sqlStr="insert into base_demo_user VALUES (0,'chenlong2','123456',2)";
        System.out.println(sqlStr);
        Statement statement=connection.createStatement();
        statement.executeUpdate(sqlStr);

    }

    public static void insertAddress(Connection connection) throws SQLException{
        String sqlStr="insert into base_demo_address VALUES (1,'武汉')";
        System.out.println(sqlStr);
        Statement statement=connection.createStatement();
        statement.executeUpdate(sqlStr);

    }

    public static void main(String[] args){
        Connection connection=null;
        try {
            connection=getConnection();
            connection.setAutoCommit(false);

            insertUser(connection);
            insertAddress(connection);

            //提交事务
            connection.commit();
        }catch (Exception e1){
            System.out.println("捕获到SQL异常");
            e1.printStackTrace();

            try {
                //回滚事务
                //注：有的数据库引擎支持回滚，有的数据库引擎不支持回滚
                connection.rollback();
                System.out.println("事务回滚成功");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }finally {
            if(connection!=null){
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
