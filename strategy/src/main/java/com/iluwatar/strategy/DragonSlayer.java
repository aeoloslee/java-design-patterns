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
