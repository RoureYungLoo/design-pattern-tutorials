package com.luruoyang.exercise;

public class GIFLoaderFactory implements ImgLoaderFactory {
    @Override
    public ImgLoader createLoader() {
        System.out.println("create GIF loader");
        return new GIFLoader();
    }
}
