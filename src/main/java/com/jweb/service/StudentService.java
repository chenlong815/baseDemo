package com.jweb.service;

import com.jweb.dao.IStudentDao;
import com.jweb.model.stuInfo;
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

    public List<stuInfo> getStudentInfo(){
        try{
            return iStudentDao.getStudentInfo();
        }catch (Exception e){
            System.out.println("数据操作错误:"+e);
            return null;
        }
    }
}
