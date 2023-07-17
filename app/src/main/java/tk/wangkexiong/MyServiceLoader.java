package tk.wangkexiong;

import tk.wangkexiong.api.IMyServiceProvider;

import java.nio.file.ProviderNotFoundException;
import java.util.ServiceLoader;

public class MyServiceLoader {

  public static IMyServiceProvider provider() {
    ServiceLoader<IMyServiceProvider> loader = ServiceLoader.load(IMyServiceProvider.class);

    for (IMyServiceProvider provider : loader) {
      return provider;
    }

    throw new ProviderNotFoundException("provider not found");
  }
}
