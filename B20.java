package GUVI;

import java.util.Scanner;

public class B20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("ENTER THE MULTIPLICATION TABLE");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int temp=0;
int i=0;
for(i=1;i<=10;i++){
		temp=a*i;
		System.out.println(a+""+"*"+i+"="+temp);
}
}
}
