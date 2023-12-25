package org.example.method;

public class MathMethods {

    public static void main(String[] args) {

       int a =  Math.abs(-10);
        System.out.println(a);

        double d = 22.9;
        System.out.println(Math.ceil(d));  // 1 to 9 = current + 1
        System.out.println(Math.round(d));  //1 to 4 = current value or 5 to 9 = current +1
        System.out.println(Math.floor(d));  // 1 to 9 = current value

    int max = Math.max(555, 666);
    int min = Math.min(555, 666);

        System.out.println(max);
        System.out.println(min);

     double pow = Math.pow(5,10);
        System.out.println(pow);


      double random =   Math.random() * 100;
       double  num=   Math.round(random) ;
        System.out.println(random);
        System.out.println(num);

      double sqrt=  Math.sqrt(8965);
        System.out.println(sqrt);
    }
}
