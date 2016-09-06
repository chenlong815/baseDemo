package com.jbase.stu003_socket;

import java.io.*;
import java.net.*;

public class SocketClient {
    public static void main(String args[]) {
        try{
            Socket socket=new Socket("127.0.0.1",4700);
            //向本机的4700端口发出客户请求

            BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
            //由系统标准输入设备构造BufferedReader对象
            PrintWriter os=new PrintWriter(socket.getOutputStream());

//            os.write("my name is ChenLong");

            //由Socket对象得到输出流，并构造PrintWriter对象
            BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //由Socket对象得到输入流，并构造相应的BufferedReader对象
            String readLine;
            readLine=sin.readLine(); //从系统标准输入读入一字符串

            while(!readLine.equals("bye")){
                os.println(readLine);
                //将从系统标准输入读入的字符串输出到Server
                os.flush();
                //刷新输出流，使Server马上收到该字符串
                System.out.println("Client:"+readLine);
                //在系统标准输出上打印读入的字符串
                System.out.println("Server:"+is.readLine());
                //从Server读入一字符串，并打印到标准输出上
                readLine=sin.readLine(); //从系统标准输入读入一字符串
            } //继续循环

            os.close(); //关闭Socket输出流
            is.close(); //关闭Socket输入流
            socket.close(); //关闭Socket
        }catch(Exception e) {
            System.out.println("Error"+e); //出错，则打印出错信息
        }
    }
}
