package com.alibaba.proxy;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by wangbin on 2017/7/21.
 */
public class MyMethodIntercepter implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cgLib:before");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("cgLib:after");
        return result;
    }
}
