package org.example.data_type;

class JumpStatement {
    public static void main(String args[]) {


        for (int i = 1; i <= 1000; i++) {

            if ((i >= 500 && i < 600) || (i > 600 && i <= 700)) {
                continue;

            }
            System.out.println(i);
        }

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


//****
//****
//****
//****

//*
//**
//***
//****

//


    }
}