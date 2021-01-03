package com.mouds.transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public void handleSal(){
        accountDao.add();
        accountDao.sub();
    }

}
