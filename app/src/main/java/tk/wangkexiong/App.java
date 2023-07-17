package tk.wangkexiong;

public class App {
  public static void main (String[] args) {
    MyServiceLoader.provider().getService().doJob();
  }
}
