package com.jweb.service;

import com.jweb.dao.IStudentDao;
import com.jweb.model.StuInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by chenlong on 2016/8/23.
 */
@Service
public class StudentService {
    @Resource
    IStudentDao iStudentDao;

    public List<StuInfo> getStudentInfo(){
        try{
            return iStudentDao.getStudentInfo();
        }catch (Exception e){
            System.out.println("数据操作错误:"+e);
            return null;
        }
    }

    public boolean addStudentInfo(StuInfo stuInfo){
        try{
            iStudentDao.addStudentInfo(stuInfo);
            return true;
        }catch (Exception e){
            System.out.println("数据操作错误:"+e);
            return false;
        }
    }

    public StuInfo getOneStudent(int id){
        try{
            return iStudentDao.getOneStudent(id);
        }catch (Exception e){
            System.out.println("数据操作错误:"+e);
            return null;
        }
    }

    public boolean updateStudentInfo(StuInfo stuInfo){
        try{
            iStudentDao.updateStudentInfo(stuInfo);
            return true;
        }catch (Exception e){
            System.out.println("数据操作错误:"+e);
            return false;
        }
    }

    public boolean deleteStudent(int id){
        try{
            iStudentDao.deleteStudent(id);
            return true;
        }catch (Exception e){
            System.out.println("数据操作错误:"+e);
            return false;
        }
    }
}
