package com.luruoyang.one.unix;

import com.luruoyang.one.GIFImage;

public class GIFUnixImpl extends GIFImage {
    public void show(){
        parse();
        System.out.println("unix show gif");
    }
}
