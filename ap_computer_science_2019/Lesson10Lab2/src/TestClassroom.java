/*
 * Adam Ryan
 * Mrs Moga
 * 03/04/20
 * Test ClassRoom
 */



import java.util.*;

public class TestClassroom {

	public static void main(String[] args) {
		Scanner r = new Scanner(System.in);
		Random rand = new Random();
		int exit = 0;
		ClassRoom myClass = new ClassRoom();
		int test1 = 0, test2 = 0, test3 = 0;
		for (int i = 1; i<20; i++) {
			test1 = (int)(Math.random() * 100+1);
			test2 = (int)(Math.random() * 100+1);
			test3 = (int)(Math.random() * 100+1);
			myClass.manuallyAdd("Student"+i+rand.nextInt(50), test1, test2, test3);
		}
		while (exit == 0) {
			System.out.println("==Menu===========================");
			System.out.println("| [1.] Add Student              |");
			System.out.println("| [2.] Remove Student           |");
			System.out.println("| [3.] Print Class Roster       |");
			System.out.println("| [4.] Print Student Info       |");
			System.out.println("| [5.] Print Student Count      |");
			System.out.println("| [6.] Print Individual Student |");
			System.out.println("| [7.] Print Top Student        |");
			System.out.println("| [8.] Print Class Average      |");
			System.out.println("| [9.] Exit                     |");
			System.out.println("=================================");
			
			try {
				System.out.println("Input a number 1-9: ");
				int input = r.nextInt();
				if (input == 1) {
					System.out.println("Input Student Name: ");
					r.nextLine();
					String nm = r.nextLine();
					System.out.println("Input Student Test1: ");
					int t1 = r.nextInt();
					System.out.println("Input Student Test2: ");
					int t2 = r.nextInt();
					System.out.println("Input Student Test3: ");
					int t3 = r.nextInt();
					System.out.println(myClass.manuallyAdd(nm,t1,t2,t3));
				} else if (input == 2) {
					System.out.println("Input Student Name for Removal: ");
					r.nextLine();
					System.out.println(myClass.removeStudent(r.nextLine()));
				} else if (input == 3) {
					System.out.println(myClass.printRoster());
				} else if (input == 4) {
					System.out.println(myClass.printAll());
				} else if (input == 5) {
					System.out.println(myClass.printNum());
				} else if (input == 6) {
					r.nextLine();
					System.out.println("Enter Student Name: ");
					String nm = r.nextLine();
					System.out.println(myClass.printStudent(nm));
				} else if (input == 7) {
					System.out.println(myClass.getBestTestScore());
				} else if (input == 8) {
					System.out.println("The average is: "+myClass.getClassAverage());
				} else if (input == 9) {
					exit = -1;
					System.out.println("Exited");
				}
				
				
				
			} catch(Exception e) {
				System.out.println("Encountered the error " + e + ", please try again. \n");
				r.nextLine();
			}
			
			
		}
		r.close();

	}

}
/*
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
5
19
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
3
Student13
Student243
Student335
Student45
Student546
Student648
Student724
Student837
Student927
Student1034
Student1135
Student1239
Student1322
Student1428
Student151
Student1630
Student1732
Student1841
Student191

==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
4
Name: Student13
Test 1: 30
Test 2: 33
Test 3: 36
Average: 33
Name: Student243
Test 1: 59
Test 2: 10
Test 3: 26
Average: 32
Name: Student335
Test 1: 100
Test 2: 25
Test 3: 11
Average: 45
Name: Student45
Test 1: 62
Test 2: 24
Test 3: 45
Average: 44
Name: Student546
Test 1: 82
Test 2: 4
Test 3: 18
Average: 35
Name: Student648
Test 1: 92
Test 2: 40
Test 3: 93
Average: 75
Name: Student724
Test 1: 5
Test 2: 76
Test 3: 67
Average: 49
Name: Student837
Test 1: 71
Test 2: 60
Test 3: 92
Average: 74
Name: Student927
Test 1: 64
Test 2: 72
Test 3: 37
Average: 58
Name: Student1034
Test 1: 14
Test 2: 86
Test 3: 42
Average: 47
Name: Student1135
Test 1: 48
Test 2: 58
Test 3: 48
Average: 51
Name: Student1239
Test 1: 51
Test 2: 11
Test 3: 67
Average: 43
Name: Student1322
Test 1: 47
Test 2: 97
Test 3: 8
Average: 51
Name: Student1428
Test 1: 83
Test 2: 23
Test 3: 42
Average: 49
Name: Student151
Test 1: 66
Test 2: 4
Test 3: 1
Average: 24
Name: Student1630
Test 1: 73
Test 2: 76
Test 3: 85
Average: 78
Name: Student1732
Test 1: 6
Test 2: 64
Test 3: 89
Average: 53
Name: Student1841
Test 1: 33
Test 2: 90
Test 3: 14
Average: 46
Name: Student191
Test 1: 61
Test 2: 68
Test 3: 75
Average: 68

==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
7
Name: Student335
Test 1: 100
Test 2: 25
Test 3: 11
Average: 45

==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
6
Enter Student Name: 
Student1322
Name: Student1322
Test 1: 47
Test 2: 97
Test 3: 8
Average: 51

==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
6
Enter Student Name: 
Adam
Student not found
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
1
Input Student Name: 
John
Input Student Test1: 
100
Input Student Test2: 
98
Input Student Test3: 
97
Added Student Successfully
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
Jack
Encountered the error java.util.InputMismatchException, please try again. 

==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
1
Input Student Name: 
Jack
Input Student Test1: 
100
Input Student Test2: 
100
Input Student Test3: 
100
Added Student Successfully
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
1
Input Student Name: 
Suzie
Input Student Test1: 
98
Input Student Test2: 
97
Input Student Test3: 
99
Added Student Successfully
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
5
22
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
1
Input Student Name: 
Sue
Input Student Test1: 
87
Input Student Test2: 
88
Input Student Test3: 
95
Added Student Successfully
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
3
Student13
Student243
Student335
Student45
Student546
Student648
Student724
Student837
Student927
Student1034
Student1135
Student1239
Student1322
Student1428
Student151
Student1630
Student1732
Student1841
Student191
John
Jack
Suzie
Sue

==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
5
23
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
2
Input Student Name for Removal: 
John
Removed
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
3
Student13
Student243
Student335
Student45
Student546
Student648
Student724
Student837
Student927
Student1034
Student1135
Student1239
Student1322
Student1428
Student151
Student1630
Student1732
Student1841
Student191
Jack
Suzie
Sue

==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
1
Input Student Name: 
123
Input Student Test1: 
123
Input Student Test2: 
123
Input Student Test3: 
123
Failed to add student
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
1
Input Student Name: 
John
Input Student Test1: 
100
Input Student Test2: 
99
Input Student Test3: 
98
Added Student Successfully
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
2
Input Student Name for Removal: 
John
Removed
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
5
22
==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
3
Student13
Student243
Student335
Student45
Student546
Student648
Student724
Student837
Student927
Student1034
Student1135
Student1239
Student1322
Student1428
Student151
Student1630
Student1732
Student1841
Student191
Jack
Suzie
Sue

==Menu===========================
| [1.] Add Student              |
| [2.] Remove Student           |
| [3.] Print Class Roster       |
| [4.] Print Student Info       |
| [5.] Print Student Count      |
| [6.] Print Individual Student |
| [7.] Print Top Student        |
| [8.] Print Class Average      |
| [9.] Exit                     |
=================================
Input a number 1-9: 
9
Exited
*/