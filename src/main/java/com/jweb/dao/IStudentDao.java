package com.jweb.dao;

import com.jweb.model.stuInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by chenlong on 2016/8/23.
 */
@Repository
public interface IStudentDao {
    public List<stuInfo> getStudentInfo();
}
