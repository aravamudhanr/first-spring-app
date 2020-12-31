package org.raghav.tutorials;

import org.raghav.tutorials.impl.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        String shapeName = args[0];
        int input1 = Integer.parseInt(args[1]);
        int input2 = Integer.parseInt(args[2]);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Shape shape = (Shape) context.getBean(shapeName.toLowerCase());
        System.out.println("Area of the " + shapeName.toUpperCase()
                + " for input1=" + input1 + " and input2=" + input2 + " is=" + shape.computeArea(input1, input2));
    }
}
