package com.java.demo;

/**
 * Created java-design-patterns on 2017/11/22.
 *
 * @author michael limao@konka.com
 */
public class ProxyDemo {
    public static void main(String args[]){
        RealSubject subject = new RealSubject();
        // 让Proxy来做RealSubject的代理。
        Proxy p = new Proxy(subject);
        p.request();
    }
}

interface Subject{
    void request();
}

// 代理类对象与原对象实现相同的接口
// 委托类：原对象：委托对象
class RealSubject implements Subject{
    public void request(){
        System.out.println("request");
    }
}

// 代理类：代理对象
class Proxy implements Subject{
    private Subject subject;
    public Proxy(Subject subject){
        this.subject = subject;
    }

    public void request(){
        // 在原始操作上附加控制代码或添加新功能
        // TODO:可以做到在不改变原始对象操作的基础上，附加新的功能。
        // 但是代售点只能买票，不能退票，而火车站能买票也能退票，因此代理对象支持的操作可能和委托对象的操作有所不同。
        // 因此代理与委托对象不能说一定是相同的操作。有时候并不仅仅是委托delegation、或转发消息。
        System.out.println("PreProcess");
        subject.request();
        System.out.println("PostProcess");
    }
}