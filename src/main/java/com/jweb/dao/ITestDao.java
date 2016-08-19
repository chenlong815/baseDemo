package com.jweb.dao;

import com.jweb.model.Base_demo_user;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestDao {
    public Base_demo_user getTestUser();
}
