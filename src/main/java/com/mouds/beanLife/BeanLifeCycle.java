package com.mouds.beanLife;

public class BeanLifeCycle  {
    private String name;

    public BeanLifeCycle() {
        System.out.println("第一步，调用无参构造来创建bean对象");
    }

    public void setName(String name) {
        System.out.println("第二步，调用set方法，来给属性赋值");
        this.name = name;
    }

    /**
     * bean的初始化方法
     */
    public void initMethod(){
        System.out.println("第四步，调用初始化方法");
    }

    /**
     * bena的销毁方法
     */
    public void detroyMehtod(){
        System.out.println("第七步，调用销毁方法");
    }

    @Override
    public String toString() {
        return "BeanLifeCycle{" +
                "name='" + name + '\'' +
                '}';
    }
}
