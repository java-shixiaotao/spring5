package com.mouds.proxy;




import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        UserDao userDa0 = (UserDao)Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new InvocationHandlerProxy(userDaoImpl));
        System.out.println(userDa0.update("test"));
    }
}

class InvocationHandlerProxy implements InvocationHandler {

    private Object object;
    public InvocationHandlerProxy(Object object){
        this.object = object;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

       if(method.getName().equals("add") ) {
           System.out.println("进入了add的方法之前进行增强处理。。。。。。。。。。");
       }
       if (method.getName().equals("update")){
           System.out.println("进入了update的方法之前进行增强处理。。。。。。。。。。");
       }
        Object invoke = method.invoke(object, args);
        System.out.println(Arrays.toString(args) + "11111111111111");
        if(method.getName().equals("add") ) {
            System.out.println("进入了add的方法之后进行增强处理~~~~~~~~~~~~~~~~~~~");
        }
        if (method.getName().equals("update")){
            System.out.println("进入了update的方法之后进行增强处理~~~~~~~~~~~");
        }
        return invoke;
    }
}