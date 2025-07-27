package com.luruoyang.exercise;

import com.luruoyang.exercise.exception.UnSupportedShapeException;
import com.luruoyang.exercise.shape.Circle;
import com.luruoyang.exercise.shape.Rectangle;
import com.luruoyang.exercise.shape.Shape;
import com.luruoyang.exercise.shape.Triangle;

public class ShapeFactory {
    public static Shape getShape(String args) throws UnSupportedShapeException {
        Shape shape = null;
        switch (args) {
            case "c":
                shape = new Circle();
                break;
            case "r":
                shape = new Rectangle();
                break;
            case "t":
                shape = new Triangle();
                break;
            default:
                throw new UnSupportedShapeException("unsupported shape: " + args);
        }
        return shape;
    }
}
