package org.raghav.tutorials.model;

import org.raghav.tutorials.impl.Shape;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawn Rectangle");
    }

    @Override
    public double computeArea(int length, int breadth) {
        return length * breadth;
    }
}
