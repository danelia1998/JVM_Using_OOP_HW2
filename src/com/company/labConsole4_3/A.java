package com.company.labConsole4_3;

import java.util.Arrays;

public class A implements AInterface{

    int a, b;


    @Override
    public void method_1(int a,int b) {
        int max = a;
        int min = b;
        int numerate = 0;
        if(max < b){
            max = b;
            min = a;
        }
        for (int i = 0; i < max - min - 1; i++){
            System.out.println(min+numerate+1);
            numerate++;
        }
    }

    @Override
    public void method_2(int a) {
        for (int i=1;i<=a;i++)
            if (a%i==0)
                System.out.print(i+" ");
    }

    @Override
    public void method_3(int b) {
        int check = 0;
        int i;
        for (i=1;i<=b;i++)
            if (b%i==0)
                System.out.println(i);
                for(int e = 1; e < i; e ++)
                    if(i%e == 0)
                        check++;
                 if (check == 0){
                     System.out.println("Number is : "+i);
                 }else {
                     check = 0;
                 }
    }

    @Override
    public int method_4(int arr[], int n) {
// Sort the array
        Arrays.sort(arr);

        // find the max frequency using linear
        // traversal
        int max_count = 1, res = arr[0];
        int curr_count = 1;

        for (int i = 1; i < n; i++)
        {
            if (arr[i] == arr[i - 1])
                curr_count++;
            else
            {
                if (curr_count > max_count)
                {
                    max_count = curr_count;
                    res = arr[i - 1];
                }
                curr_count = 1;
            }
        }

        // If last element is most frequent
        if (curr_count > max_count)
        {
            max_count = curr_count;
            res = arr[n - 1];
        }
        System.out.println("The most frequently number is :"+res);
        return res;
    }
}
