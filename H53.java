package GUVI;

import java.util.Scanner;

public class H53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
String a=s.next();
int i=0;
String first=a.substring(0,1);
for(i=1;i<a.length();i++){
	char last =a.charAt(i);
	System.out.println(first+last);
	}
}
	}


