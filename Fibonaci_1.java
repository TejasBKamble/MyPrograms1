package IMP_Programs_1;

public class Fibonaci_1 {

	public static void main(String[] args) {
		// 1 1 2 3 5 8 13...
		
		int n1=1,n2=1,n3=0;
		
		System.out.print(n1);
		System.out.print(" "+n2);
		
		for(int i=2;i<10;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			
			n1=n2;
			n2=n3;
		}

	}

}
