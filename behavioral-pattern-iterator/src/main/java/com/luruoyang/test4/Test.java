package com.luruoyang.test4;

import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {

    List<Object> objectList = new ArrayList<>();
    objectList.add("zhangsan");
    objectList.add("lisi");
    objectList.add("wangwu");

    ProductList productList = new ProductList(objectList);
    AbstractIterator iterator = productList.createIterator();

    /* 正向遍历 */
    while (!iterator.isLast()) {
      System.out.print(iterator.getNextItem() + ", ");
      iterator.next();
    }

    /* 逆向遍历 */
    while (!iterator.isFirst()) {
      System.out.print(iterator.getPreviousItem() + ", ");
      iterator.previous();
    }

  }

}
