package org.example.method;

import java.util.Scanner;

public class MethodDay1 {

//    retrun_type method_name(){
//        //code
//    }
       static void printName(){
        System.out.println("Bootcodig");
       System.out.println(1+2);
    }

    static int addition(){
       return 10+20;
    }
    static int substraction(int a, int b){
       return a-b;
    }
    public static void main(String[] args) {
        System.out.println("this code from main method");
//        printName();
//       int sum = addition();
//        System.out.println(sum);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number :");
        int a = sc.nextInt();
        System.out.println("enter a second number :");
        int b=sc.nextInt();
        int sub =substraction(a,b);
        System.out.println(sub);
        int sub2 = substraction(50,40);
        System.out.println(sub2);

        System.out.println("this is second line ");


    }
}
