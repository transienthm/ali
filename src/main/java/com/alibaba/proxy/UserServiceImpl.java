package com.alibaba.proxy;

public class UserServiceImpl implements UserService{

  @Override
  public void add(){
    System.out.println("-------------add----------------");
  }

  public void delete() {
    System.out.println("--------------delete--------------");
  }
}
