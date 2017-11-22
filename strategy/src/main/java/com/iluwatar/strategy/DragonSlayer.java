/**
 * The MIT License
 * Copyright (c) 2014-2016 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.iluwatar.strategy;

/**
 * 
 * DragonSlayer uses different strategies to slay the dragon.
 * 策略控制：调度使用不同的策略对象to slay the dragon
 * 这与delegator的角色很像，delegaotr委托不同的delegate取处理不同的事情。
 *
 * 可能侧重点与理念有所不同吧
 * 参考 https://brucezhang.wordpress.com/2009/05/07/strategy-pattern-and-delegate/
 *
 * 策略模式将方法封装到对象，OO思想严重。强调同一个算法的不同实现。
 * 委托可能更加类似C++函数指针，OP面向过程。它更强调委托。可能委托不同的方法去处理(或委托不同的对象去处理相同的方法也可以：
 * 此时更像策略模式，但是它不强调这样去实现)。
 *
 * 比如计算个税与企业税
 * 策略模式：可能是接口定义一个计算税的方法，然后用两个不同的类去封装个税、企业税的不同算法。(更强调同一个算法策略的不同实现)
 * 委托模式：也可以这样做。但是更好的做法是：delegete类提供个税和企业税两个方法，然后delegator去委托delegete去处理(更强调不同分类功能委托不同对象)。
 */
public class DragonSlayer {

  private DragonSlayingStrategy strategy;

  // 初始化策略
  public DragonSlayer(DragonSlayingStrategy strategy) {
    this.strategy = strategy;
  }

  // 改变策略
  public void changeStrategy(DragonSlayingStrategy strategy) {
    this.strategy = strategy;
  }

  // 执行策略
  public void goToBattle() {
    strategy.execute();
  }
}
