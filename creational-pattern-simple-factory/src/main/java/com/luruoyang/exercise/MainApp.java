package com.luruoyang.exercise;

import com.luruoyang.exercise.exception.UnSupportedShapeException;
import com.luruoyang.exercise.shape.Shape;

public class MainApp {
    public static void main(String[] args) {
        Shape shape = null;
        try {
            shape = ShapeFactory.getShape("r");
        } catch (UnSupportedShapeException e) {
            e.printStackTrace();
        }
        shape.draw();
        shape.erase();
    }
}
