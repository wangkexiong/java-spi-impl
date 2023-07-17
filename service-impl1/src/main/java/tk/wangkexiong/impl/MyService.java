package tk.wangkexiong.impl;

import tk.wangkexiong.api.IMyService;


public class MyService implements IMyService {
  @Override
  public void doJob() {
    System.out.println("MyServiceImpl1");
  }
}
