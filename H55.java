package GUVI;

import java.util.Scanner;

public class H55 {//b6

	public static void main(String[] args) {
		System.out.println("ENTER THE YEAR: ");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(n%4==0){
			System.out.println("LEAP YEAR");
	}
		else{
			System.out.println("NOT A LEAP YEAR");
		}
	}

}
