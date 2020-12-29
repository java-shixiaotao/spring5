package com.mouds.utils;

/**
 * 通过使用set方法使用
 */
public class Book {
    private String name;
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void book111(){
        System.out.println("name = " + name + "author = " + author );
    }
}
