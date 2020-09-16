package com.company;


import java.util.*;

public class Main {
    public static void main(String[] args) {

        int a, b;
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        a = scanner.nextInt();
        System.out.println("Введите ещё число: ");
        b = scanner.nextInt();
        int result = calculator.add(a, b);
        int result2 = calculator.minus(a, b);
        long result3 = calculator.multiply(a, b);
        double result4 = calculator.division(a, b);

        System.out.println("Сумма ваших чисел равна: " + result);
        System.out.println("Разность ваших чисел равна: " + result2);
        System.out.println("Умножение ваших чисел равно: " + result3);
        System.out.println("Деление ваших чисел равно: " + result4);

    }

}