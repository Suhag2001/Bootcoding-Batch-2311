package org.example.scanner_system_class;

import java.util.Scanner;

public class SumAssign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number :");
        int num = sc.nextInt();
        //123
        int sum =0 ;
        while (num>0){
            int rem = num%10;
            sum += rem;  //sum = sum +rem ;
            num /= 10; //num  = num /10 ;
        }
        System.out.println("sum of give number is :"+sum);

        System.out.println(num);

        System.out.println("sum of give number :"+ sum);
    }
}
