package com.company.labConsole4_2;

import java.lang.reflect.Array;
import java.util.concurrent.ThreadLocalRandom;

public class A implements AInterface{
    int a,b;
    int[] m = new int[12];

    @Override
    public void method_1() {
        int min = 10;
        int max = 25;
        int a = ThreadLocalRandom.current().nextInt(min, max + 1);
        int b = ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    @Override
    public int method_2() {
        return a;
    }

    @Override
    public int method_3() {
        return b;
    }

    @Override
    public void method_4() {
        int min = -10;
        int max = 60;
        int a = ThreadLocalRandom.current().nextInt(min, max + 1);
        for (int i = 0; i < m.length; i++){
            m[i] = ThreadLocalRandom.current().nextInt(min, max + 1);
        }
    }

    @Override
    public void method_5() {
        for (int i = 0; i < m.length; i++){
            if(m[i]%2==0){
                System.out.println(m[i]);
            }
        }
    }

    @Override
    public void method_6() {
        int sum = 0;
        for (int i = 0; i < m.length; i++){
            if(m[i]>0){
                sum = sum + m[i];
            }
        }
        System.out.println(sum);
    }

    @Override
    public void method_7() {
        int min = 60;
        for (int i = 0; i < m.length; i++){
            if(m[i]>0){
                if(m[i]<60){
                    min = m[i];
                }
            }
        }
        System.out.println("MINIMUM is : "+min);
    }
}
