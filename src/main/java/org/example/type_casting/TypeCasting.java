package org.example.type_casting;

class TypeCasting{
public static void main(String args[]){

//Implicit and explicit

short s = 10;
byte b = (byte)s;
int i = b;
long l= i ;
float f = l ;
double d = f;
d = 2222.333;
System.out.println(d);
int  i2 = (int)d; //2222
System.out.println(i2);
System.out.println(s);
System.out.println(b);

System.out.println(d+i2);

byte i3 = 64 ;
char c = '@';
char c2 = (char)i3;


System.out.println(c2);
System.out.println((char)i3+c);//higher + lower 10 + 64 = 74


System.out.println((char)(i3+c)); //74 = j
System.out.println((char)(128));
System.out.println((char)(63));
}

}