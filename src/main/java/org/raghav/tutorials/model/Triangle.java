package org.raghav.tutorials.model;

import org.raghav.tutorials.impl.Shape;

public class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawn Triangle");
    }

    @Override
    public double computeArea(int base, int height) {
        return 0.5 * base * height;
    }
}
