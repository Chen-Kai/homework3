package com.kai;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Box3 box3 = new Box3();
        Box5 box5 = new Box5();
        System.out.println("Please input post box length :");
        float length = scanner.nextFloat();
        System.out.println("Please enter the post box width:");
        float width = scanner.nextFloat();
        System.out.println("Please enter the post box high:");
        float height = scanner.nextFloat();

        if (box3.validate(length, width, height)) {
            System.out.println("Please using Box3");
        } else if (box5.validate(length, width, height)) {
            System.out.println("Please using Box5");
        } else {
            System.out.println("Please use a larger Box");
        }
    }
}
