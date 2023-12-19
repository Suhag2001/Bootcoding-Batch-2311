
package org.example.cma;

public class CommandLineArg {
    public static void main(String[] args) {

        System.out.println(args.length);
        System.out.println(args[0]);
        System.out.println(args[1]);

        int a = Integer.parseInt(args[0]);
        int b  = Integer.valueOf(args[1]);
        int c = a+b;
        //System.out.println("sum of : "+c);
        System.out.println("sum of : "+(a+b));

        System.out.println(args[2]);
        System.out.println(args[3]);

    }
}
