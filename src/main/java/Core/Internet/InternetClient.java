package Core.Internet;

import Type.ProxyType;
import okhttp3.OkHttpClient;

import java.net.Proxy;

public interface InternetClient {
    OkHttpClient newProxy(Proxy.Type type, ProxyType proxyType);

    OkHttpClient newClient();
}
