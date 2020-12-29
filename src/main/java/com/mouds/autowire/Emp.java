package com.mouds.autowire;

public class Emp {
    private Dept dept;

    public Emp() {
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }
}
