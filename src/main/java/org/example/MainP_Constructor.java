package org.example;

public class MainP_Constructor {

    int modelYear;
    String modelName;
    public MainP_Constructor(int year, String name){
        modelName = name;
        modelYear = year;

    }

    public static void main(String[] args) {
        MainP_Constructor mainPConstructor = new MainP_Constructor(2022, "BMW");
        System.out.println(mainPConstructor.modelName);
        System.out.println(mainPConstructor.modelYear);
    }
}
