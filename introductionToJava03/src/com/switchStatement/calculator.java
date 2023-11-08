package com.switchStatement;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        char operator;
        Double number1, number2, result;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, or /");
        operator = input.next().charAt(0);

        // ask users to enter numbers
        number1 = input.nextDouble();
        number2 = input.nextDouble();

        // performs addition between numbers
        // performs subtraction between numbers
        // performs multiplication between numbers
        // performs division between numbers
        switch (operator) {
            case '+' -> {
                result = number1 + number2;
                System.out.println(result);
            }
            case '-' -> {
                result = number1 - number2;
                System.out.println(result);
            }
            case '*' -> {
                result = number1 * number2;
                System.out.println(result);
            }
            case '/' -> {
                result = number1 / number2;
                System.out.println(result);
            }
            default -> System.out.println("Invalid operator!");
        }
    }
}
