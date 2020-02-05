package com.company; // базовый namespace - лучше задавать доменном-компании-наоборот

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a = 5;
        int b = 7;
        int c = 2, d = 3;
        System.out.println("Переменная а равна " + a + "\nПеременная b равна " + b
                + "\nСумма a и b равна " + (a + b));

        System.out.println("Теперь выводим возвращаемое значение метода sum: " + test(20,30));

    }

    static int test (int a, int b)
    {
        return a + b;
    }
}
