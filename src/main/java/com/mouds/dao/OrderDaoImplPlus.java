package com.mouds.dao;

import org.springframework.stereotype.Repository;

@Repository
public class OrderDaoImplPlus implements OrderDao {
    public void add() {
        System.out.println("into OrderDaoImplPlus ....");
    }
}
