package com.mouds.jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class FaceService {
    @Autowired
    private FaceDao faceDao;

    public int insertUsers(Users users){
        int i = faceDao.insertUsers(users);
        return i;
    }

    public int getCount(){
        return  faceDao.getCount();
    }

    public int[] batchInsert(List<Object[]> batchArgs){
        return faceDao.batchInsert( batchArgs);
    }

    public Users getUsers(int id){
        return faceDao.getUsers(id);
    }
}
