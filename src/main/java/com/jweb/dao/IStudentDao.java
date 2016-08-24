package com.jweb.dao;

import com.jweb.model.StuInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenlong on 2016/8/23.
 */
@Repository
public interface IStudentDao {
    public List<StuInfo> getStudentInfo();
    public void addStudentInfo(@Param("stuInfo") StuInfo stuInfo);
    public StuInfo getOneStudent(@Param("id") int id);
    public void updateStudentInfo(@Param("stuInfo") StuInfo stuInfo);
    public void deleteStudent(@Param("id") int id);
}
