package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(1);
		l.add(3);
		l.add(1);
		l.add(4);
		l.add(5);
		l.add(6);
		
		int count = 1;
		for (int i = 1; i < l.size(); i++) {
			if(l.get(i)== 1)
			{
				count++;
				
			}
		
		}
		System.out.println(count);
	}

}
