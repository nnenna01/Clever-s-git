package org.example;

public class Main19Class {



    public static class InnerClass {



        public int maxMethod(int X, int Y) {

            if (X > Y)
                return X;
            else
                return Y;
        }
    }
    public static void main(String[] args){
        InnerClass main19Class= new InnerClass();
        System.out.println(main19Class.maxMethod(20,40));


    }
}