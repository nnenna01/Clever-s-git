package org.example;

import java.util.ArrayList;

public class MainClass18LambdaExpression {
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("England");
        countries.add("Poland");
        countries.add("Ireland");
        countries.add("America");
        countries.add("Nigeria");
        countries.add("Ghana");
        countries.forEach((s) -> {
            System.out.println(s);
        });
    }
}