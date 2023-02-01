package org.example;

public class MainE {
//    public static int max(int x, int y) {
//        if (x > y)
//            return x;
//        else return y;
//    }
//
//    public static void main(String[] args) {
//        // Creating an object
//        MainE  mainE =   new MainE();
//        System.out.println(MainE.max(  100,  20));

    public static int max(int A, int B) {
        if (A > B)
            return A;
        else return B;
    }

private int additionMethod(int A, int B){
        return (A+B);
}

    private int subtractionMethod(int A, int B){
        return (A-B);
    }
    private int divisionMethod(int A, int B){
        return (A/B);
    }
    private int multiplicationMethod(int A, int B){
        return (A*B);
    }


    public static void main(String[] args) {
        MainE mainE = new MainE();
        System.out.println(MainE.max(100, 300));
        System.out.println(mainE.additionMethod(10, 20));
        System.out.println(mainE.subtractionMethod(10,20));
        System.out.println(mainE.divisionMethod(10, 20));
        System.out.println(mainE.multiplicationMethod(10, 20));

    }




}
