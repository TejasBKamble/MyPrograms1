package IMP_Programs_1;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String ");
		
		String str=sc.next();
		
		sc.close();
		
		String  ss="";
		for(int i=str.length()-1;i>=0;i--)
		{
		  ss=ss+str.charAt(i);

			
		}
		
		  
		  System.out.println("Reverse String is = "+ss);

	}

}
