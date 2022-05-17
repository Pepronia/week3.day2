package week3.day2;

import java.util.ArrayList;

public class Intesection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] intArray = new int[]{3,2,11,4,6,7};
		int[] intArray2 = new int[] {1,2,8,4,9,7};
		
		for (int i = 0; i < intArray.length; i++) {
			for (int j = 0; j < intArray2.length; j++) {
				if(intArray[i]== intArray2[j])
				{
					System.out.println("Matching arrays are" + " " +intArray[i]+ " "+intArray2[j]);
				}
			}
			
		}
		
		
		
	}

}
