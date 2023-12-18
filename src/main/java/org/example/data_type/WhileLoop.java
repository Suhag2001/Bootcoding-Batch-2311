package org.example.data_type;

class WhileLoop {

    public static void main(String args[]) {


//while(condition){  // code 
//}

        int i = 1;
        while (i <= 10) {
            System.out.println(i + "JAVA");
            i++;
        }

//check the given number is palindrome or not

        int a = 121;
        int num = a;
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;

            rev = rev * 10 + rem;

            num /= 10;
        }

        if (a == rev) {
            System.out.println("given number is a palindrome");
        } else {
            System.out.println("given number is not a palindrome number");
        }


    }
}