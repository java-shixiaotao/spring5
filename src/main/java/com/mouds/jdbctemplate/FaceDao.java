package com.mouds.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FaceDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;


    public int insertUsers(Users users) {
        String sql = "insert into users(id,name,password,email,birthday) values(?,?,?,?,?)";
        Object[] args = {users.getId(),users.getName(),users.getPassword(),users.getEmail(),users.getBirthday()};
        int update = jdbcTemplate.update(sql, args);
        return update;
    }
}
