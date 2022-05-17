package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicatesUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Character> list2 = new ArrayList<Character>(Arrays.asList('A','B','C','A','E','A'));
		list2.add('F');
		list2.add('C');
		System.out.println("The Duplicate values are");
		
		for (int i = 0; i < list2.size(); i++) {
			Character c = list2.get(i);
			list2.set(i, 'X');
			if(list2.contains(c))
			{
				System.out.println(c + ", ");
			}
			
		}
	
        
	}

	
}
