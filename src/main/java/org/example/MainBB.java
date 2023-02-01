package org.example;

public class MainBB {
    public static void main(String[] args) {
        // Logical &&
        int a = 20;
        System.out.println(a<30 && a<10);

        // Logical or
        int b = 5;
        System.out.println(b>5 || b>4);

        // Logical Not

        int c = 20;
        System.out.println(!(c<30 && c<10));
    }
}
