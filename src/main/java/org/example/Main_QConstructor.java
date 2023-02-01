package org.example;

public class Main_QConstructor {

    String FirstName;
    String LastName;
    String MiddleName;
    int age;
    public Main_QConstructor(String FirstName, String LastName, String MiddleName, int age){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.LastName = MiddleName;
        this.age = age;

    }

    public static void main(String[] args) {
        Main_QConstructor mainQConstructor = new Main_QConstructor("Clever", "Peter", "Ovoh",50);
        System.out.println(mainQConstructor.FirstName);
        System.out.println(mainQConstructor.LastName);
        System.out.println(mainQConstructor.MiddleName);
        System.out.println(mainQConstructor.age);
    }
}
