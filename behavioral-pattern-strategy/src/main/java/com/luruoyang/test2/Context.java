package com.luruoyang.test2;

/*环境类: 需要使用算法的类*/
public class Context {

  /* 持有抽象策略类的引用 */
  private AbstractStrategy strategy;

  public void setStrategy(AbstractStrategy strategy) {
    this.strategy = strategy;
  }

  /* 调用抽象策略实现类的方法 */
  void algorithm() {
    strategy.algorithm();
  }
}
