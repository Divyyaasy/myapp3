package com.example1;

import com.example1.App3;

public class App3 {

    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        App3 app = new App3();

        int result = app.add(2, 4);
        System.out.println("2 + 4 = " + result);
        System.out.println("Application executed successfully!");
    }
}
