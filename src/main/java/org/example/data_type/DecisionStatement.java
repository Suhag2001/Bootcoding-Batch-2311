package org.example.data_type;

class DecisionStatement {
    public static void main(String args[]) {

        //if( condintion){
        //}else{}

        int age = 20;

        if (age >= 18 && age <= 30) {
            System.out.println("Allow for Party");
        } else if (age > 18) {
            System.out.println("You are child now , not allow");
        } else {
            System.out.println("You are too old");
        }


// switch(Expression){
//	 case 1:  //code 
        //break
//	 case 2: //code
        //break
//	 default: //code 
// }


        int day = 0;

        switch (5) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("You have a wrong day number");
        }


    }
}