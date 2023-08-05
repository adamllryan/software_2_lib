/* Adam Ryan
 * Moga
 Halloween
 Student Class Test
 */
package testprogram;
	public class TestStudent{
		public static void main (String[] args){
		Student s1, s2, s3;
		
		s1 = new Student(); 
		s1.setName("Bill"); 
		s1.setScore(1,84); 
		s1.setScore(2,861); 
		s1.setScore(3,88); 
		
		String result = s1.validateData();
		System.out.println("Here is student s1\n" + s1);
		if (result != null) System.out.println("\nErrors with Student 1: \n"+result);
		
		s2 = new Student(s1); 
		s2.setName("");
		
		result = s2.validateData();
		System.out.println("Here is student s2\n" + s2);
		if (result != null) System.out.println("\nErrors with Student 2: \n"+result);
		
		s3 = new Student("Timothy", 123, 55, -1);
		
		result = s3.validateData();
		System.out.println("Here is student s3\n" + s3);
		if (result != null) System.out.println("\nErrors with Student 3: \n"+result);
		}
		}
/*
Here is student s1
Name: Bill
Test 1: 84
Test 2: 861
Test 3: 88
Average: 344

Errors with Student 1: 
Test2 is not within range

Here is student s2
Name: 
Test 1: 84
Test 2: 861
Test 3: 88
Average: 344

Errors with Student 2: 
Student lacks a name
Test2 is not within range

Here is student s3
Name: Timothy
Test 1: 123
Test 2: 55
Test 3: -1
Average: 59

Errors with Student 3: 
Test1 is not within range
Test3 is not within range


*/
