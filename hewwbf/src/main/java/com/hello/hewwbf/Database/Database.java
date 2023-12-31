package com.hello.hewwbf.Database;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hello.hewwbf.Model.UserData;

public interface Database extends JpaRepository<UserData,Integer>{


    @Query(value="select * from users",nativeQuery = true)
    public List<UserData> getAll();

    public UserData findByUserId(int userId);

    @Query(value = "select * from users where user_name=?1", nativeQuery = true)
    public UserData findByUsername(String username);
}
