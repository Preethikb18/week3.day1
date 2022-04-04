package week3.day1;


public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";	
		int count =0;
		String[] charArray1 = text.split("");
		for (int i = 0; i < charArray1.length; i++) {
		       // d) Initialize another loop to check whether the word is there in the array
					for (int j = 0; j < i; j++) {
						if (charArray1[i].equalsIgnoreCase((charArray1[j]))) {
							count++;
							break;	
						}
						if(count==0) { // This means duplicate available
							
							
							System.out.println(charArray1[i]);
							
						} else 
						{
							count =0;
						}
					}

				}
		//System.out.println();
		
		 
	}

}
