package org.example.scanner_system_class;
import java.util.Scanner;

public class ScannerAndSystem {

    static void substraction(){
       Scanner sc = new Scanner(System.in);
        System.out.println("enter a first number : ");
        int a = sc.nextInt();
        System.out.println("enter a second number : ");
        int b = sc.nextInt();
        System.out.println("substraction : "+(a-b));
    }
    public static void main(String[] args) {


        System.out.println("java");
       System.err.println("Error occured !");


  Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number :");
//         int a = sc.nextInt();
//        System.out.println("Enter a second number : ");
//        int b = sc.nextInt();
//        System.out.println("sum of given numbers : "+(a + b));

//        System.out.println("enter your name : ");
//        String name = sc.nextLine();
//        System.out.println("Enter your gender :");
//        char gender = sc.next().charAt(0);
//
//        System.out.println("are you right !");
//        boolean  bool = sc.nextBoolean();
//
//
//        System.out.println("your name is : "+name );
//        System.out.println("gender is  :"+gender);
//        System.out.println("confirmation :"+bool);

        substraction();
    }
}
