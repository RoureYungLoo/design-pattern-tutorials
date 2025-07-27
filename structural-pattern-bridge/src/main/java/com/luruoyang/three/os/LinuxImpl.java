package com.luruoyang.three.os;

import com.luruoyang.three.ImageImpl;
import com.luruoyang.three.Matrix;

public class LinuxImpl implements ImageImpl {
    @Override
    public void doPaint(Matrix matrix) {
        System.out.println("在Linux中显示图像：");
    }
}
