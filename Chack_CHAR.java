package IMP_Programs_1;

import java.util.Scanner;

public class Chack_CHAR {

	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a String ");
		String str=sc.next();
		
		System.out.println("Enter a Character ");
		char ch=sc.next().charAt(0);
		
		boolean found=false;
		
	for(int i=0;i<str.length();i++)
	{
		if(str.charAt(i)==ch) {
			System.out.println(ch+" Found in "+i+" Position");
			found =true;
			break;
		}
	}
	
	if(!found) {
		System.out.println(ch+" NOT Found ");
	}
	
    sc.close();
	}

}
