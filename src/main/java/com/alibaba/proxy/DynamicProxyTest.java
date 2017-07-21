package com.alibaba.proxy;

public class DynamicProxyTest{
  public static void main(String[] args) {
    UserService UserService = new UserServiceImpl();
    MyInvocationHandler invocationHandler = new MyInvocationHandler(UserService);

    UserService proxy = (UserService)invocationHandler.getProxy();
    proxy.add();
  }

}
