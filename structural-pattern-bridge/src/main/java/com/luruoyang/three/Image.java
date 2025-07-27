package com.luruoyang.three;


public abstract class Image {
    protected ImageImpl impl;

    public void setImageImpl(ImageImpl impl) {
        this.impl = impl;
    }

    public abstract void parseFile(String fileName);
}
