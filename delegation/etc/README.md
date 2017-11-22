从委托的示例代码中看到了抽象工厂实现的影子。而最大的区别怕是抽象工厂的目的委托不同的具体工厂对象去创建不同的具体产品对象，
而委托是将对象的请求委托给其他具体不同实现的对象处理。


The delegation design pattern allows an object to delegate one or more tasks to a helper object.
Two classes are used to achieve this; the delegate and delegator, both which realise a common interface.
 A method (or methods) on the interface represent the functionality to be delegated.
 A call to the delegator calls the matching function on the delegate.
 委托设计模式允许一个对象委托一个或多个任务给helper辅助对象去处理。需要两种类来实现委托模式。
 1.delegate 被委托者
 2.delegator 委托者

 它们都实现了一个共同的接口。

While this seemingly just abstracts away some of the functionality into another class,
the real power of this pattern comes when there are multiple delegates. The delegator
typically has a method for each delegate that will convert the delegator to use that delegate.
It is useful for understanding to compare the delegation pattern to inheritance.
Both are powerful reuse techniques with a few of key differences; inheritance is directly
supported by today’s object-oriented programming languages and enables the use of polymorphism,
whereas the delegation pattern allows the delegate to be changed at run-time.

优点：
Clearly separates the different sets of functionality 很清晰的将一些功能进行隔离开【功能分类】不同的功能实现委托
给不同的类去处理。实现类之间彼此隔离。
Run-time flexibility 运行时，动态切换，很灵活。

缺点Drawbacks
Not as trivial as implementing inheritance 不想实现继承那样重要。

::注意：怎么越看越像策略模式啊：：

// 实例代码
public class Delegator implements DelegationInterface {
    private DelegationInterface delegate;

    public String f() {
        if (delegate == null) {
            return null;
        }
        return delegate.f();
    }
    // toA和toB可以体现运行时切换委托对象，Run-time flexibility；更换delegate的具体类型。
    public void toA() { delegate = new DelegateA(); }
    public void toB() { delegate = new DelegateB(); }
}

interface DelegationInterface {
    String f();
}

public class DelegateA implements DelegationInterface {
    // 同样的方法，不同的实现。
    public String f() {
        return "Delegate A";
    }
}

public class DelegateB implements DelegationInterface {
    // 同样的方法，不同的实现。
    public String f() {
        return "Delegate B";
    }
}

#使用案例Usage examples

There are countless examples that exist, anything where an object may behave in
at least two different ways are ideal candidates.在这些情况下：一个对象的某种行为可能有至少两种不同的方式时，都可以使用
委托模式。
An employee can be paid as full-time, part-time or casual
A document can be printed to a black and white printer, a colour printer or the screen
A game world can be displayed using a first-person view or a third-person view
