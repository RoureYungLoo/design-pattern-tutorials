package com.luruoyang.three.os;

import com.luruoyang.three.ImageImpl;
import com.luruoyang.three.Matrix;

public class WindowsImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在Windows中显示图像：");
    }
}
