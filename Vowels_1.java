package IMP_Programs_1;

import java.util.Scanner;

public class Vowels_1 {
	public static void main(String[] args) 
	{		
		int a=0,e=0,i=0,o=0,u=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Entre a String");
		
		String str=sc.nextLine();
		sc.close();
		
		String input=str.toLowerCase();

		for(int  j=0;j<input.length();j++)
		{
			char cc=input.charAt(j);
			
			if(cc=='a'||cc=='e'||cc=='i'||cc=='o'||cc=='u') 
			{
				switch (cc)
				{
				
				case 'a':
					a++;
					break;
				case 'e':
					e++;
					break;
				case 'i':
					a++;
					break;
				case 'o':
					o++;
					break;
				case 'u':
					u++;
					break;
				
				}
			}
		}	
		System.out.println("a"+" = "+ a +" Time's");
		System.out.println("e"+" = "+ e +" Time's");
		System.out.println("i"+" = "+ i +" Time's");
		System.out.println("o"+" = "+ o +" Time's");
		System.out.println("u"+" = "+ u +" Time's");
	}

}
