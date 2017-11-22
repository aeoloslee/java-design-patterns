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
package com.iluwatar.decorator;

/**
 * TrollDecorator is a decorator for {@link Troll} objects. The calls to the {@link Troll} interface
 * are intercepted and decorated. Finally the calls are delegated to the decorated {@link Troll}
 * object.
 * 1级包装器 基础包装器(高层)，用来嵌入其他包装器子对象的，并不提供具体的附加功能。
 */
public class TrollDecorator implements Troll {

  // TrollDecorator所包装的对象类型是Troll，该类型的具体类型是可以是任意Troll的子类型。
  private Troll decorated;

  public TrollDecorator(Troll decorated) {
    this.decorated = decorated;
  }

  @Override
  public void attack() {
    decorated.attack();
  }

  @Override
  public int getAttackPower() {
    return decorated.getAttackPower();
  }

  @Override
  public void fleeBattle() {
    decorated.fleeBattle();
  }
}
