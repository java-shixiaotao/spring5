package com.mouds.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FaceDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    //插入
    public int insertUsers(Users users) {
        String sql = "insert into users(id,name,password,email,birthday) values(?,?,?,?,?)";
        Object[] args = {users.getId(),users.getName(),users.getPassword(),users.getEmail(),users.getBirthday()};
        int update = jdbcTemplate.update(sql, args);
        return update;
    }
    //返回个数
    public int getCount() {
        String sql = "select count(*) from users";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        return integer;
    }
    //批量插入
    public int[] batchInsert(List<Object[]> batchArgs){
        String sql = "insert into users(id,name,password,email,birthday) values(?,?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, batchArgs);
    }
    //返回对象
    public Users getUsers(int id){
        String sql = "select * from Users where id = ? ";
        Users users = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Users>(Users.class), id);
        return users;
    }
}
