package org.example.type_casting;

class IntegerToString{
	
	
public static void main(String args[]){
  int num = 1234;
  float  f= 23.444f;
  
  String str = Integer.toString(num);  //wrapper classes
  String str2 = String.valueOf(num);
  String str3 = ""+num;
  String str4 = String.format("%d",num);
  
  String str5 = Float.toString(f);

  
 System.out.println(str); System.out.println(str2 + " "+str2.length());
 System.out.println(str3+ " "+str3.length());
 System.out.println(str4+ " "+str4.length());
 System.out.println(str5+ " "+str5.length());
 System.out.println(num);
 System.out.println(str.charAt(0));
 
 for(int i = 0 ; i<str.length(); i++){
	System.out.println(str.charAt(i)); 
 }
}

}