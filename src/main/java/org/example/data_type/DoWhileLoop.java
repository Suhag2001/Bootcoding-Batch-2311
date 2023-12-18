package org.example.data_type;

class DoWhileLoop {
    public static void main(String args[]) {
        byte b = 10;
        do {
            System.out.println(b);
            b++;
        } while (b < 5);

        do {
            System.out.println(b);
            b++;  //20
        } while (b < 20);

        while (b <= 25) {
            System.out.println(b);
            b++;
        }
        System.out.println(b);


    }
}