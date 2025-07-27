package com.luruoyang.test1;



public class Client {
    public static void main(String[] args) {

        Adaptee adaptee = new Adaptee();
        Adapter adapter = new Adapter(adaptee);
        adapter.request();
    }
}
