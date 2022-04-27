package ru.job4j.calculator;


import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double rustAndMisha(double first, double second) {
        return rust(first, second) - misha(first, second);
    }

    public static double sasha(double first, double second) {
        return sum(first, second) + multiply(first, second) + rust(first, second) + misha(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + rustAndMisha(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + sasha(10, 20));
    }
}




