package week3.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String text1 ="stops";
		String text2 ="potss";
		String str=  "welcome to chennai";
		int count =0;
		
		int length1 = text1.length();
		System.out.println(length1);
		 int length2 = text2.length();
		 System.out.println(length2);
		 if(length1 == length2)
		 {
			 System.out.println("Length is equal");
		 }
		 else
		 {
			 System.out.println("Lenght is not equal");
		 }
		 
		  //char[] arr1 = text1.toCharArray();
		  //char[] arr2 = text2.toCharArray();
		 //Array.sort(arr1);
		// Array.sort(arr2);
		 
		//if(Arrays.equals(arr1, arr2))
		//{
			//System.out.println("ANAGRAM");
			
		//}
		//else
		//{
		//	System.out.println("Not a Anagram");
		//}
		//}
		 char[] charArray1 = str.toCharArray();
		 int len =str.length();
		 for(int i =0;i<len;i++)
		 {
			 if(charArray1[i] == 'e')
			 {
				 count++;
			 }
		 }
		 System.out.println(count);
		 
		 }
		 
	  
	 
	
		 
	}


