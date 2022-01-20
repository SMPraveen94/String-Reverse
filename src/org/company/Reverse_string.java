package org.company;

public class Reverse_string {
	
	private static void string_reverse() {
		int s=12345;
		//String s="12345";
		/*String rev="";
		for(int i=s.length();i>))
*/
		/*StringBuffer sb= new StringBuffer();
		sb.append(s);
		StringBuffer reverse = sb.reverse();
		System.err.println(reverse);*/
		StringBuilder sb= new StringBuilder(String.valueOf(s));
		System.out.println(sb.reverse());
		
		}

	public static void main(String[] args) {
		string_reverse() ;

	}

}
