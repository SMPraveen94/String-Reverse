package org.company;

public class Reverse_Number {
private static  void numRev() {
	
	int a=10,b=20;
	int c;
	/*c=a;
	a=b;
	b=c;
	System.out.println(a +" " + b);
*/
	/*a=a+b;
	b=a-b;
	a=a-b;*/
	
	/*a=a*b;
	b=a/b;
	a=a/b;*/
	
    b=(b+a)-(a=b);
	System.out.println(a +" " + b);

}
public static void main(String[] args) {
	numRev();
}
	
}
