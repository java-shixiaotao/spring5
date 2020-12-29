package com.mouds.beanList;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BeanListDemo {
    private Array String[];
    private List<String> list;
    private Map<String,String> map;
    private Set<String> set;
    private List<Coures> couresList;


    @Override
    public java.lang.String toString() {
        return "BeanListDemo{" +
                "String=" + Arrays.toString(String) +
                ", list=" + list +
                ", map=" + map +
                ", set=" + set +
                ", couresList=" + couresList +
                '}';
    }

    public void setString(Array[] string) {
        String = string;
    }

    public void setList(List<java.lang.String> list) {
        this.list = list;
    }

    public void setMap(Map<java.lang.String, java.lang.String> map) {
        this.map = map;
    }

    public void setSet(Set<java.lang.String> set) {
        this.set = set;
    }

    public void setCouresList(List<Coures> couresList) {
        this.couresList = couresList;
    }
}
