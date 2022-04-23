package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double one = x2 - x1;
        double two = y2 - y1;
        double three = Math.pow(one, 2);
        double four = Math.pow(two, 2);
        double five = three + four;
        double six = Math.sqrt(five);
        return six;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        double result2 = Point.distance(1, 3, 4, 6);
        System.out.println("result2 (1,3) to (4,6) " + result2);
        double result3 = Point.distance(9, 4, 3, 2);
        System.out.println("result3 (9,4) to (3,2) " + result3);
    }
}
