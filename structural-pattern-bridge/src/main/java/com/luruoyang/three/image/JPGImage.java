package com.luruoyang.three.image;


import com.luruoyang.three.Image;
import com.luruoyang.three.Matrix;


public class JPGImage extends Image {


    @Override
    public void parseFile(String fileName) {
        Matrix matrix = new Matrix();
        impl.doPaint(matrix);
        System.out.println(fileName+"格式为JPG");
    }
}
