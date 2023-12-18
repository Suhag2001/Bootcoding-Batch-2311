package org.example.data_type;

class ForEachLoop {
    public static void main(String args[]) {


        int arr[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


        for (int num : arr) {
            System.out.println(num);
        }


        String names[] = {"ram", "shyam", "upanshu", "swapnil"};

        for (String name : names) {
            System.out.println(name);
        }


    }
}