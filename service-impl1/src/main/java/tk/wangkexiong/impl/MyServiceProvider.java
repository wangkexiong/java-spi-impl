package tk.wangkexiong.impl;

import tk.wangkexiong.api.IMyService;
import tk.wangkexiong.api.IMyServiceProvider;

public class MyServiceProvider implements IMyServiceProvider {
  @Override
  public IMyService getService() {
    return new MyService();
  }
}
