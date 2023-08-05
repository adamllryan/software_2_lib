/*Adam Ryan
 * Moga 3
 * Freshman log
 */
public class Freshman {
	private String lastName, firstName, campusPhone;
	private int classYear;
	
	public Freshman() {
		lastName = "";
		firstName = "";
		campusPhone = "";
		classYear = 0;
	}
	public void setLastName(String dataLastName) {
		lastName = dataLastName;
		
	}
	public void setFirstName(String dataFirstName) {
		firstName = dataFirstName;
		
	}
	public void setCampusPhone(String dataCampusPhone) {
		campusPhone = dataCampusPhone;
	
	}
	public void setClassYear(int dataClassYear) {
		classYear = dataClassYear;
	
	}
	public String getLastName() {
		return lastName;
	
	}
	public String getFirstName() {
		return firstName;
	
	}
	public String getCampusPhone() {
		return campusPhone;

	}
	public int getClassYear() {
		return classYear;
	
	}
	public String toString() {
		String str;
		str=lastName + ", " + firstName + ". \nPhoneData: " + campusPhone + "\nYear: " + classYear;
		return str;
	}
	}



