package com.company.labConsole4_1;

import java.util.Scanner;

public class C implements CInterface{

    int  a=10, b=9;
    String s="#", h="@";


    @Override
    public void method_1() {
        System.out.println(a);
        System.out.println(b);
    }

    @Override
    public void method_2() {
        System.out.println(s);
        System.out.println(h);
    }

    @Override
    public void method_3() {
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }

    @Override
    public void method_4() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer for a");
        a = keyboard.nextInt();
    }

    @Override
    public void method_5() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer for b");
        b = keyboard.nextInt();
    }

    @Override
    public void method_6() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an symbol for s");
        s = keyboard.next();
        System.out.println("enter an symbol for h");
        h = keyboard.next();
    }
}
