import java.io.*;

import java.util.Scanner;

public class leap 
{
	private static Scanner sc;

	public static void main(String[] args) {
		int l ;
		System.out.println("enter the year");
		sc = new Scanner(System.in);
		l=sc.nextInt();
		if(l%4==0 && l%100!=0 || l%400==0)
	     {
	       System.out.println("leap year");
	       }
	       else
	       {
	         
	         System.out.println("not leap year");
	       }
	         }
	}
