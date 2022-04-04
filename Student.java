package week3.day1;

public class Student extends College{
	
	public void studentName()
	{
		
		System.out.println("Preethi");
	}
	public void studentDept()
	{
		System.out.println("Computer science Department");
	}
	public void studentId()
	{
		System.out.println("VI0023");
	}

	public static void main(String[] args) 
	{
		College objCollege =new College();
		objCollege.collegeName();
		objCollege.collegeCode();
		objCollege.collegeRank();
	}

}
