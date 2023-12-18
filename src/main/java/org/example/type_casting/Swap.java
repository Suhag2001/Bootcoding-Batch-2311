package org.example.type_casting;
//swap two varibles 

class Swap{

public static void main(String args[]){

int a = 5;
int b = 11;


int c = a ;
b = a;


a = a+b; //a  = 15
b= a-b;  //b = a-b = 15-10 = 5
a = a-b;// a = a-b  = 15-5 = 10


System.out.println("a  :  " +a);
System.out.println("b  :  "+b);



//output: a=10, b =5;


}

}