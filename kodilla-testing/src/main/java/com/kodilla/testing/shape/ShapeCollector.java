package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapeList = new ArrayList<>();


    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        if (shapeList.contains(shape)) {
            shapeList.remove(shape);
            return true;
        }

        return false;
    }

    public Shape getFigure (int n) {
        if(n >= 0 && n < shapeList.size()) {
            return shapeList.get(n);
        }

        return null;
    }

    public String showFigures () {
        String result = "No figures in collection";
        if (!shapeList.isEmpty()){
            result = "";
            for(int i = 0; i < shapeList.size(); i++) {
                if(i == shapeList.size() -1) {
                    result += shapeList.get(i).getShapeName();
                } else {
                    result += shapeList.get(i).getShapeName() + ", ";
                }
            }
        }

        return result;
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }
}
