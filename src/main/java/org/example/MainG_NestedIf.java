package org.example;

import com.google.gson.internal.bind.util.ISO8601Utils;

public class MainG_NestedIf {
    public static void main(String[] args) {
        int dayOfTheWeek = 1;
        if (dayOfTheWeek == 1) {
           System.out.println("Sunday");
       } else if (dayOfTheWeek == 2) {
            System.out.println("Monday");

        } else if (dayOfTheWeek == 3) {
           System.out.println("Tuesday");

        } else if (dayOfTheWeek == 4) {
            System.out.println("Wednesday");


       } else if (dayOfTheWeek == 5) {
            System.out.println("Thursday");


        } else if (dayOfTheWeek == 6) {
            System.out.println("Friday");

       } else if (dayOfTheWeek == 7) {
            System.out.println("Saturday");
        } else
           System.out.println("Saturday");
       System.out.println("Pleas Enter value between 1 and 7");
   }




    }



