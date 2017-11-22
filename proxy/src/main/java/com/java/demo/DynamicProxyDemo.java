package com.java.demo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created java-design-patterns on 2017/11/22.
 *
 * 1.定义委托类与公共接口
 * 2.动态生成委托类的代理类
 * 3.生成代理对象（当然也会生成代理类），需要为他指定：
 * (1)委托对象
 * (2)实现的一系列接口
 * (3)调用处理器类的实例。
 * 因此可以看出一个代理对象对应一个委托对象，对应一个调用处理器实例InnovationHandler。
 *
 * Java 实现动态代理主要涉及以下几个类：
 * java.lang.reflect.Proxy: 这是生成代理类的主类，通过 Proxy 类生成的代理类都继承了 Proxy 类，
 * 即 DynamicProxyClass extends Proxy。
 * java.lang.reflect.InvocationHandler: 这里称他为"调用处理器"，他是一个接口，
 * 我们动态生成的代理类需要完成的具体内容需要自己定义一个类，而这个类必须实现 InvocationHandler 接口。
 *
 * @author michael limao@konka.com
 */
public class DynamicProxyDemo {

    public static void main(String args[]){
        RealSubject1 realSubject = new RealSubject1();
        // 将要委托的对象传递给代理处理器。
        ProxyHandler proxyHandler = new ProxyHandler(realSubject);
        // 通过代理处理器 解析得到代理类型;创建通道代理，需要传递一个代理处理器对象。
        Subject1 proxySubject = (Subject1)java.lang.reflect.Proxy.newProxyInstance(
                RealSubject1.class.getClassLoader(),
                RealSubject1.class.getInterfaces(), proxyHandler);
        // 利用代理对象，发送消息请求request();
        proxySubject.request();
    }
}

interface Subject1{
    void request();
}

// 代理类对象与原对象实现相同的接口
// 委托类：原对象：委托对象
class RealSubject1 implements Subject1{
    public void request(){
        System.out.println("request");
    }
}

class ProxyHandler implements InvocationHandler{

    private Subject1 subject;

    ProxyHandler(Subject1 subject1) {
        this.subject = subject1;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====before====");//定义预处理的工作，当然你也可以根据 method 的不同进行不同的预处理工作
        // 代理最终调用的还是subject(RealSubject1委托类)对象的方法
        Object result = method.invoke(subject, args);
        System.out.println("====after====");
        return result;
    }
}