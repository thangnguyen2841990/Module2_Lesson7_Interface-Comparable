package com.codegym;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.6);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle("blue", false, 3.5);
        System.out.println("Pre - sorted");
        for (ComparableCircle circle:circles) {
            System.out.println(circle);
        }
        Arrays.sort(circles);
        for (ComparableCircle circle1: circles) {
            System.out.println(circle1);
        }

    }
}
