package org.example.array;

public class Array2 {

    public static void printArray(int[] array){
   int sum = 0;
        for(int i = 0 ; i < array.length ; i++){
          sum += array[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {

//        int[] array = {1,2,3,4,5,6,7,8};

//        Array2.printArray(new int[] {1,2,3,4,5,6,7});

        int[] array2 = {1,2,3,4,5,6,7,8};
        System.out.println(array2[array2.length-2]);
    }
}
