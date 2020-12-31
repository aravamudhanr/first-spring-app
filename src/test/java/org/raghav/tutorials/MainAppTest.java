package org.raghav.tutorials;

import org.junit.Assert;
import org.junit.Test;
import org.raghav.tutorials.impl.Shape;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAppTest {
    @Test
    public void TestMain() {
        String shapeName = "rectangle";
        int input1 = 10;
        int input2 = 5;
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Shape shape = (Shape) context.getBean(shapeName.toLowerCase());
        Assert.assertEquals(50.0, shape.computeArea(input1, input2), 0);
    }
}
