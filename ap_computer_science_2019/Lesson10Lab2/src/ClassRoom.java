/*
 * Adam Ryan
 * Mrs Moga
 * 03/04/20
 * ClassRoom
 */
public class ClassRoom {
	private Student2[] myClassRoom;
	private int sizeL;
	private final int LIMIT = 20;
	public ClassRoom() {
		myClassRoom = new Student2[LIMIT];
		sizeL=0;	
	}
	
	public String manuallyAdd(String nm, int t1, int t2, int t3) {
		Student2 test = new Student2(nm, t1,t2,t3);
		
		if (test.validate() == "") {
			if (sizeL>=20) increaseClassSize();
				myClassRoom[sizeL] = test;
				sizeL++;
				
			return "Added Student Successfully";  
		}
			else return "Failed to add student";
	}
	
	public String removeStudent(String nm) {
		boolean test = false;
		int index = -1;
		for (int i = 0; i<sizeL; i++) {
			if (myClassRoom[i].getName().equals(nm)) {
				test = true;
				index = i;
				
			}
		}
		if (test == true) {
			for (int i = index; i<sizeL-1; i++) {
				myClassRoom[i] = myClassRoom[i+1];	
			}
			sizeL--;
			return "Removed";
		} else return "Not removed";
	}
	
	private void increaseClassSize() {
		int numTemp = sizeL + 2;
		Student2[] temp = new Student2[numTemp];
		for (int i = 0; i<myClassRoom.length; i++) {
			temp[i] = myClassRoom[i];
		}
		myClassRoom = temp;
	}
	
	public String printRoster() {
		String str = "";
		for (int i=0; i<sizeL;i++) {
			str += myClassRoom[i].getName() + "\n";
		}
		return str;
	}
	
	public String printAll() {
		String str = "";
		for (int i=0; i<sizeL;i++) {
			str += myClassRoom[i].toString() + "\n";
		}
		return str;
	}
	public String printStudent(String nm) {
		String str = "";
		for (int i=0; i<sizeL;i++) {
			if (myClassRoom[i].getName().equals(nm)) {
			str = myClassRoom[i].toString() + "\n";
			}
		}
		if (str == "") str = "Student not found";
		return str;
	}
	
	public String getBestTestScore() {
		String str = "";
		int hs = 0;
		int index = 0;
		for (int i=0; i<sizeL;i++) {
			if (myClassRoom[i].getHighScore() > hs) {
				hs = myClassRoom[i].getHighScore();
				index = i;
			}
		}
		str = myClassRoom[index].toString() + "\n";
		return str;
	}
	
	public int getClassAverage() {
		int avg = 0;
		for (int i=0; i<sizeL;i++) {
				
				avg += myClassRoom[i].getAverage();
				
			
		}
		avg /= sizeL;
		return avg;
	}
	
	public int printNum() {
		return sizeL;
	}
}