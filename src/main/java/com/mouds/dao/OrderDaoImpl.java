package com.mouds.dao;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImpl implements OrderDao {
    public void add() {
        System.out.println("into add1 .............");
    }
}
