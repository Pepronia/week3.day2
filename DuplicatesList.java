package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class DuplicatesList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> lst = new ArrayList<String>();
        lst.add("A");
        lst.add("B");
        lst.add("A");
        lst.add("D");
        lst.add("E");
        lst.add("A");
        lst.add("F");
        lst.add("G");
        lst.add("E");
        
        for (int i = 0; i < lst.size(); i++) {
			 for(int j = i +1 ; j < lst.size() ; j++)
			 {
				 if(lst.get(i).equals(lst.get(j)))
				 {
					 System.out.println(lst.get(i));
				 }
			 }
        	
		}
		
	}

}
