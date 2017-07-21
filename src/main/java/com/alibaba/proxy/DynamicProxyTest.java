package com.alibaba.proxy;

import net.sf.cglib.proxy.Enhancer;

public class DynamicProxyTest{
  public static void main(String[] args) {
    UserService UserService = new UserServiceImpl();
    MyInvocationHandler invocationHandler = new MyInvocationHandler(UserService);

    UserService proxy = (UserService) invocationHandler.getProxy();
    proxy.add();
    proxy.delete();

    Enhancer enhancer = new Enhancer();
    enhancer.setCallback(new MyMethodIntercepter());
    enhancer.setSuperclass(UserServiceImpl.class);
    UserService cgLibProxy = (UserService) enhancer.create();
    cgLibProxy.add();
  }

}
