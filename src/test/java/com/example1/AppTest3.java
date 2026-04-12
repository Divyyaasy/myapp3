package com.example1;

import org.junit.Assert;
import org.junit.Test;

public class AppTest3 {

    @Test
    public void testAdd1() {
        App3 app = new App3();
        int result = app.add(2, 3);

        System.out.println("Running test: 2 + 3 = " + result);

        Assert.assertEquals(5, result);
    }
}
