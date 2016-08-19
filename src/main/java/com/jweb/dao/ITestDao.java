package com.jweb.dao;

import com.jweb.model.Base_demo_user;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITestDao {
    public List<Base_demo_user> getTestUser();
}
