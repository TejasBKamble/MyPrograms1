package MyProgramS;

public class SecondLargest_Simple {

	public static void main(String[] args) {
		
		int Largest=0,SecondLargest=0;
		
		int arr [] ={33,44,2,4,5,66,55,11,77};
		
		for(int num : arr)
		{
			if(num > Largest)
			{
				SecondLargest = Largest;
				Largest =num;
			}
			else if(num > SecondLargest && num != Largest ) 
			{
				SecondLargest = num;
			}
		}
		
		System.out.println("Largest ="+Largest);
		System.out.println("SecondLargest ="+SecondLargest);
		

	}

}
