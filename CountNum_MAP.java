package IMP_Programs_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountNum_MAP {

	public static void main(String[] args) {

		int [] arr= {2,4,5,6,4,5,6,2,2,2,67,8,7,6,2};
		
		HashMap<Integer,Integer>Hmap=new HashMap<Integer,Integer>();
		
		for(int i:arr)
		{
			Hmap.put(i,Hmap.getOrDefault(i,0)+1);
		}
		
		for(Entry<Integer,Integer> entery:Hmap.entrySet() )
		{
			System.out.println(entery.getKey()+" = "+ entery.getValue() +" Times");
		}

	}

}
