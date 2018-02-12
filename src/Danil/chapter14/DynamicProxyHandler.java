package Danil.chapter14;

import java.lang.reflect.InvocationHandler;
import java.util.*;
import java.lang.reflect.*;

public class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;
    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("**** proxy: " + proxy.getClass() + ", method: " + method + ", args: " + args);
        if(args != null)
            for(Object arg : args)
                System.out.println("  " + args);
        return method.invoke(proxied, args);
    }
}
