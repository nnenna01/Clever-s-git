package org.example;

public class MainM_Enum {
    enum  PhoneType{
        SAMSUNG,
        IPHONE,
        HTC,
        NOKIA,
        HAWAII,
        INFINIX,
        TECHNO;

    }

    public static void main(String[] args) {
        System.out.println(PhoneType.IPHONE);
        System.out.println(PhoneType.SAMSUNG);
    }
}
