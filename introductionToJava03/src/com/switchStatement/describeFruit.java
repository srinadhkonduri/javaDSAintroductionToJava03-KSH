package com.switchStatement;

import java.util.Scanner;

public class describeFruit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

        switch (fruit) {
            case "mango" -> System.out.println("king");
            case "apple" -> System.out.println("red fruit");
            case "grape" -> System.out.println("small fruit");
            case "pineapple" -> System.out.println("salty fruit");
            default -> System.out.println("invalid ");
        }
    }
}
