package com.company;

public class Main {
    public static void main(String[] args) {
        // write your code here
        System.out.println(method(20, 13));
        System.out.println(method(15, 7));
        System.out.println(method(28, 6));
        System.out.println(method(19, 8));
        System.out.println(method(22, 9));
    }

    public static String method(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти погулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти погулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти погулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}