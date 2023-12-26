package org.example.array;

public class Array1 {
    public static void main(String[] args) {

        //declaration of an array

        int[]  arr = {1, 2 , 3,2,3,4,56} ;

        int[] arr2 = new int[5];  //instance of array

        int[] arr3 = new int[]{1,2,3,4,5} ; //Annonoumous array


        //index   0 to less than size of an array
//        System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[-2]); //thow ArrayOutofboundException

//        arr2[0] =5 ;
//        arr2[1] =7 ;
//        arr2[2] =9 ;
//        arr2[3] = 20;
//        System.out.println(arr2[0]);
//        System.out.println(arr2[1]);
//        System.out.println(arr2[2]);
//        System.out.println(arr2[3]);


        arr[3] =20 ;
//        System.out.println(arr[3]);

//        arr3[5] =50 ;//ArrayIndexOutOfBoundsException
//        System.out.println(arr3[5]);

        String[] names = {null,"upanshu","ankush dada , he is very good person !","pranay","yash"};
        //length

        System.out.println(names.length);

        //iteration of array
//        for (int i = 0 ;i<=names.length-1 ; i++){
//            System.out.println(names[i]);
//        }

//        for(int i = names.length-1 ; i>=0; i--){
//            System.out.println(names[i]);
//        }
//

//        for (int i = 0 ;i<=names.length-1 ; i++){
//            if(names[i] == "pranay"){
//                continue;
//            }
//            System.out.println(names[i]);
//        }

        for (int i = 0 ;i<=names.length-1 ; i++){
            System.out.println(names[i]);
            if(names[i] == "pranay"){
                break;
            }
        }
    }
}
