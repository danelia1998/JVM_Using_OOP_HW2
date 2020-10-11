package com.company.labConsole4_1;

import java.util.Random;
import java.util.Scanner;

public class B implements BInterface{
    int a=33;
    double b = 9.7;
    String s = "#";


    @Override
    public void Method_1() {
        System.out.println(s);
    }

    @Override
    public void Method_2() {
        System.out.println(a);
    }

    @Override
    public void Method_3() {
        System.out.println(b);
    }

    @Override
    public void Method_4() {
        System.out.println(a-b);
    }

    @Override
    public double Method_5() {
        return  a/b;
    }

    @Override
    public void Method_6() {
        Random rand = new Random();
        a = rand.nextInt(1000);
        b = rand.nextInt(1000)+0.2;
    }

    @Override
    public void Method_7() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter an integer");
        a = keyboard.nextInt();
    }

    @Override
    public void Method_8() {
        Random rand = new Random();
        b = rand.nextInt(1000)+11;
    }
}
