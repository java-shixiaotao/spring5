package com.mouds.service;

import com.mouds.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService {

    /*@Autowired
    @Qualifier(value = "orderDaoImplPlus")*/
    @Resource(name = "orderDaoImplPlus")
    private OrderDao orderDao;

    @Value(value = "111111222222222222")
    private Long i;

    public void add(){
        System.out.println("into OrderService.........." + i);
        orderDao.add();
    }
}
