package week3.day1;

import java.util.Arrays;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String  test = "test";
		char[] charArray1 = test.toCharArray();
		//Arrays.sort(charArray1);
		System.out.println(charArray1);
		for(int i=0;i<charArray1.length;i++)
		{
		 
			if(i%2!=0)
			{
				charArray1[i] = Character.toUpperCase(charArray1[i]);
				 System.out.println(charArray1[i]);
			}
			
		}
		
	
		
	}

}
