package com.luruoyang.one.unix;

import com.luruoyang.one.BMPImage;

public class BMPUnixImpl extends BMPImage {
    public void show(){
        parse();
        System.out.println("unix show bmp");
    }
}
