package com.jbase.stu001_interface;/**
 * Created by chenlong on 2016/6/30.
 */
interface IDetail{
    public String detail();
}

class Teacher implements IDetail {
    private String name;
    private int age;
    private String type;
    public Teacher(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
    // 返回教师详细信息
    public String detail() {
        return "姓名：" + name + ",年龄：" + age + "，教师类型：" + type;
    }
}

class Printer {
    public void print(String s) {
        System.out.println(s);
    }
}

class MedicalInspection implements IDetail{
    Printer printer = new Printer();
    // 返回体检中心信息
    public String detail() {
        return "这里是滨州市体检中心，欢迎您的到来！";
    }

    // 打印detail信息
    public void printDetail(IDetail d) {
        printer.print(d.detail());
    }
}

public class SDInterface {
    public static void main(String[] args) {
        MedicalInspection mi=new MedicalInspection();
        mi.printDetail(mi);// 打印中心信息

        IDetail t = new Teacher("李四", 33, "Java");
        mi.printDetail(t);// 打印教师信息

    }
}
