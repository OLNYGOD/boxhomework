package com.Box;

import com.Bill.Box;

import java.util.Scanner;

public class BoxTester {
    public static void main(String[] args) {
        Boxgeenerate box3 = new Boxgeenerate("box3", 24f, 14f ,13);
        Boxgeenerate box5 = new Boxgeenerate("box5", 39.5f, 27.5f ,23);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter object's length:");
        float length = scanner.nextFloat();
        System.out.println("Please enter object's width:");
        float width = scanner.nextFloat();
        System.out.println("Please enter object's height:");
        float height = scanner.nextInt();
        if (box3.validate(length,width, (int) height)){
            System.out.println(box3.name);
        }else if (box5.validate(length,width, (int) height)){
            System.out.println(box5.name);
        }
    }
}
