package com.company.labConsole4_3;


public class Main {
    public static void main(String[] args) {
        A fromAClass = new A();
        fromAClass.method_1(10,26);
        fromAClass.method_2(25);
        fromAClass.method_3(25);



        int arr[] = {1, 5, 2, 1, 3, 2, 1};
        int n = arr.length;

        System.out.println(fromAClass.method_4(arr,n));
    }
}
