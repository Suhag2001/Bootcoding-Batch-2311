package org.example.variable;


public class Variables{
	
	int c = 40;  
	static int d = 40 ;
	public void run(){
	int e  = 40;
	 System.out.println("local"+e);
	  System.out.println("instance"+c);
	  System.out.println("static"+d);
	  e++;
	   System.out.println("local"+e);
	  c++;
	  d++;
	}
 public static void main(String args[]){
      int a = 20;
	  System.out.println(a);
	  Variables v = new Variables();
	  v.run();
	  v.run();
 }
}