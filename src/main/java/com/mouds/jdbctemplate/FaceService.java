package com.mouds.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FaceService {
    @Autowired
    private FaceDao faceDao;

    public int insertUsers(Users users){
        int i = faceDao.insertUsers(users);
        return i;
    }
}
