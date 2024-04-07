package MyProgramS;

import java.util.Scanner;

public class Vowels_Simple {

	public static void main(String[] args)
	{
		int a=0,e=0,i=0,o=0,u=0;
		Scanner scanner = new Scanner(System.in);
		  
		  System.out.println("Please enter a sentence:");
		  
		  String sentence = scanner.nextLine();
		  
		  scanner.close();
		  
		  String input = sentence.toLowerCase();
		  
		  for (int j = 0; j < input.length(); j++) {

			  char c = input.charAt(j);

		    if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		    {		      
		      switch (c) 
		      {
		        case 'a':
		         a++;
		          break;
		        case 'e':
		         e++;
		          break;
		        case 'i':
		          i++;
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
		  System.out.println("a ="+a+"Time's");
		  System.out.println("e ="+e+"Time's");
		  System.out.println("i ="+i+"Time's");
		  System.out.println("o ="+o+"Time's");
		  System.out.println("u ="+u+"Time's");
  }
}
