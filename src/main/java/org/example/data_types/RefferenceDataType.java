package org.example.data_types;

class Car{
String name;
float price;
String model;
}




public class RefferenceDataType{
public static void main(String args[]){

String name ;  //declaration
name = "Bootcodig";   //intialization
System.out.println(name);

int arr[] = {1,2,3,4,5};
System.out.println(arr[0]);

Car car  = new Car();
car.name = "Honda";
car.price= 224444.55f;
car.model = "Honda23";

System.out.println(car.name+"\n "+car.price+" \n"+car.model);

}
}