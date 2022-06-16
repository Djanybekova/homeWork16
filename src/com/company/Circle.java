package com.company;

import java.util.Scanner;

public class Circle {
    Scanner scanner = new Scanner(System.in);
    static final double  PI=3.14f;
    private static int radius;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(){
    }

    static void  area(){
        double area = PI * (radius * radius);
        System.out.println("Area: "+area);
    }

    static void circumference(){
        double circumference =  PI * 2 * radius;
        System.out.println("Circum ference: "+circumference);
    }
}
