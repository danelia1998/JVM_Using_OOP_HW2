package com.company.ClassWork5;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
//        number_1();
//        number_2();
//        number_3();
//        number_4();
//        number_5();
//        number_6();
    }


    public static void number_1(){
        try {
            File tempDirectory = new File(System.getProperty("user.dir"));
//            File fileWithAbsolutePath = new File(tempDirectory.getAbsolutePath() + "/testFile.txt");
            System.out.println(tempDirectory);
            FileWriter myWriter = new FileWriter(tempDirectory+"\\src\\com\\company\\ClassWork5\\myFiles\\data.txt");
            myWriter.write(String.valueOf(24)+", ");
            myWriter.write(String.valueOf(39)+", ");
            myWriter.write(String.valueOf(-90));
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void number_2(){
        try {
            File tempDirectory = new File(System.getProperty("user.dir"));
//            File fileWithAbsolutePath = new File(tempDirectory.getAbsolutePath() + "/testFile.txt");
            System.out.println(tempDirectory);
            FileWriter myWriter = new FileWriter(tempDirectory+"\\src\\com\\company\\ClassWork5\\myFiles\\data1.txt");

            for(int i = 0; i <=100; i++){
                myWriter.write(String.valueOf(i)+"\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void number_3(){
        try {
            File tempDirectory = new File(System.getProperty("user.dir"));
            System.out.println(tempDirectory);
            for(int e=0; e<30;e++){
                FileWriter myWriter = new FileWriter(tempDirectory+"\\src\\com\\company\\ClassWork5\\myFiles1\\data"+e+".txt");
                myWriter.write("Programmer");
                myWriter.close();
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void number_4(){
        try {
            File tempDirectory = new File(System.getProperty("user.dir"));
            System.out.println(tempDirectory);
            for(int e=0; e<30;e++){
                FileWriter myWriter = new FileWriter(tempDirectory+"\\src\\com\\company\\ClassWork5\\myFiles2\\data"+e+".txt");
                for (int davighale = 1; davighale<31;davighale++){
                    myWriter.write("Programmer"+davighale+"\n");
                }
                myWriter.close();
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void number_5(){
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("enter first integer:");
            int a = keyboard.nextInt();

            System.out.println("enter second integer:");
            int b = keyboard.nextInt();
            int max = a;
            int min = b;
            if(max<min){
                max = b;
                min = a;
            }

            File tempDirectory = new File(System.getProperty("user.dir"));
            System.out.println(tempDirectory);

            FileWriter myWriter = new FileWriter(tempDirectory+"\\src\\com\\company\\ClassWork5\\myFiles\\data2.txt");
            for(int e=0; e<100;e++){
                myWriter.write(String.valueOf(ThreadLocalRandom.current().nextInt(min, max + 1))+"\n");

            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void number_6(){
        try {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("enter first integer:");
            int a = keyboard.nextInt();

            System.out.println("enter second integer:");
            int b = keyboard.nextInt();
            int max = a;
            int min = b;
            if(max<min){
                max = b;
                min = a;
            }

            File tempDirectory = new File(System.getProperty("user.dir"));
            System.out.println(tempDirectory);

            FileWriter myWriter = new FileWriter(tempDirectory+"\\src\\com\\company\\ClassWork5\\myFiles\\data3.txt");
            for(int e=0; e<50;e++){
                myWriter.append(String.valueOf(ThreadLocalRandom.current().nextInt(min, max + 1))+",");

            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void number_7(){
        try {
            File tempDirectory = new File(System.getProperty("user.dir"));
            System.out.println(tempDirectory);
            for(int e=0; e<30;e++){
                FileWriter myWriter = new FileWriter(tempDirectory+"\\src\\com\\company\\ClassWork5\\myFiles1\\data"+e+".txt");
                myWriter.write("Programmer");
                myWriter.close();
            }
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
