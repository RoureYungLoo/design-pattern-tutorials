package com.luruoyang.level2;

import com.luruoyang.level2.simplify.Product;

public class App {
    public static void main(String[] args) {
//        Product product = Factory.getProduct("B");
//        product.methodSame();
//        product.methodDiff();

        /* 简化版本 */
        Product product = Product.getProduct("A");
        product.methodCommon();
        product.methodDiff();
    }
}
