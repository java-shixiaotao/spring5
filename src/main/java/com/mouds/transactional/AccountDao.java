package com.mouds.transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void add(){
        String sql = "update account set salary = salary - ? where name= ?";
        jdbcTemplate.update(sql,100,"王");
    }


    public void sub(){
        String sql = "update account set salary = salary + ? where name= ?";
        int i = 10/0;
        jdbcTemplate.update(sql,100,"史");
    }
}
