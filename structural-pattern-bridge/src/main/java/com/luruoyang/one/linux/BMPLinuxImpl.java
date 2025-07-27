package com.luruoyang.one.linux;

import com.luruoyang.one.BMPImage;

public class BMPLinuxImpl extends BMPImage {
    public void show(){
        parse();
        System.out.println("linux show bmp");
    }
}
