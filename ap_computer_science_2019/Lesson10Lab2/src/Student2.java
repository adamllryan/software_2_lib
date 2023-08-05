/* Adam Ryan
 * Moga
 Halloween
 Student Class
 */


public class Student2 {
	private String name;
	private int[] tests;
	public Student2() {
		name = "";
		tests = new int[3];
		for (int i:tests) {
			tests[i] = 0;
		}
	}
	public Student2(String nm, int t1, int t2, int t3) {
		name = nm;
		tests = new int[3];
		tests[0] = t1;
		tests[1] = t2;
		tests[2] = t3;
	}
	public Student2(Student2 s) {
		name = s.name;
		tests = new int[3];
		tests[0] = s.tests[0];
		tests[1] = s.tests[1];
		tests[2] = s.tests[2];
	}
	public void setName(String nm) {
		name = nm;
	}
	public String getName() {
		return name;
	}
	public void setScore(int i, int score) {
		if (i==1) tests[0]=score;
		if (i==2) tests[1]=score;
		if (i==3) tests[2]=score;
	}
	public int getScore (int i){
		
		if (i == 1) return tests[0];
		else if (i == 2) return tests[1];
		else return tests[2];
		}
	public int getAverage() {
		int average;
		average = (int) Math.round((tests[0] + tests[1] + tests[2]) / 3.0);
		return average;
	}
	public int getHighScore(){
		int highScore;
		highScore = tests[0];
		if (tests[1] > highScore) highScore = tests[1];
		if (tests[2] > highScore) highScore = tests[2];
		return highScore;
		}
	public String validateData() {
		String errors = "";
		if (name.equals("") || name == null) 
			errors += "Student lacks a name\n";
		if (tests[0] < 0 || tests[0] >100 ) 
			errors += "tests[0] is not within range\n";
		if (tests[1] < 0 || tests[1] >100) 
			errors += "tests[1] is not within range\n";
		if (tests[2] < 0 || tests[2] >100) 
			errors += "tests[2] is not within range\n";
		//if (tests[0] > 0 && tests[0] <100 && tests[1] > 0 && tests[1] <100 &&tests[2] > 0 && tests[2] <100 && name != "") return null;
		return errors;
	}
	public String validate() {
		return validateData();
	}
	public String toString(){
		
		String str;
		str = "Name: " + name + "\n" + 
		"Test 1: " + tests[0] + "\n" +
		"Test 2: " + tests[1] + "\n" +
		"Test 3: " + tests[2] + "\n" +
		"Average: " + getAverage();
		return str;
		}
	}

