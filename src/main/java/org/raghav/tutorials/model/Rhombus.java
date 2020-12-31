package org.raghav.tutorials.model;

import org.raghav.tutorials.impl.Shape;

public class Rhombus implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawn Rhombus");
    }

    @Override
    public double computeArea(int diagonal1, int diagonal2) {
        return 0.5 * diagonal1 * diagonal2;
    }
}
