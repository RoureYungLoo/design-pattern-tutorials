package com.luruoyang.exercise;

public class JPGLoaderFactory implements ImgLoaderFactory{
    @Override
    public ImgLoader createLoader() {
        System.out.println("create JPG loader");
        return new JPGLoader();
    }
}
