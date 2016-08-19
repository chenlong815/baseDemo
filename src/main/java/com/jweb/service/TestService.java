package com.jweb.service;

import com.jweb.dao.ITestDao;
import com.jweb.model.Base_demo_user;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/8/2.
 */
@Service
public class TestService {
    @Resource
    ITestDao iTestDao;
    public List<Base_demo_user> getTestUser(){
        try{
            return iTestDao.getTestUser();
        }catch (Exception e){
            System.out.println("数据操作错误:"+e);
            return null;
        }
    }
}
