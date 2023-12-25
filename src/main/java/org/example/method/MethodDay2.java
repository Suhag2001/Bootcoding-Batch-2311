package org.example.method;

public class MethodDay2 {

    public void method1(){
        System.out.println("This is from method 1");
        MethodDay2 methodDay2 = new MethodDay2();
        methodDay2.method2();
    }

    public void method2(){
        System.out.println("THis is from method 2");
    }
// method overloading
    public  void method2(int b ){
        System.out.println();
    }
    public  void method2(int a,int b){
        System.out.println();
    }


    public static  int number(){
        System.out.println("i am from number method");
        return 50;
    }
    public static void main(String[] args){

//        System.out.println("this from main method 1");
//        MethodDay2 m = new MethodDay2();
////        method1();
//        m.method1();
//        System.out.println("this from main method 2");
//        m.method2();
        System.out.println(number());;

    }

}
