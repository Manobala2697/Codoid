package org.test;

public class StringReverse {

	public static void main(String[] args) {
		String a="welcome";
		String b="";
		for(int i=a.length()-1,j=0;i>=0;i--,j++) {
		b=b+a.charAt(i);
		}
		System.out.println(b);
	}
}
