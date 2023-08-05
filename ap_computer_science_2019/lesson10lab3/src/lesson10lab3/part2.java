package lesson10lab3;

public class part2 {

	public static void main(String[] args) {
		String schools = "Evamere,Ellsworth_Hill,McDowell,East_Woods,Hudson_Middle_School,Hudson_High_School";
		int count = 0;
		for (int i = 0; i<schools.length()-1;i++) {
			if (schools.substring(i,i+1).equals(",")) count += 1;
		}
		String[] arr = new String[count+1];
		int i = 0;
		while (schools.indexOf(',') != -1) {
			arr[i] = schools.substring(0,schools.indexOf(','));
			schools = schools.substring(schools.indexOf(',')+1,schools.length());
			i++;
		}
		arr[i] = schools.substring(0,schools.length());
		for (String s : arr) System.out.println(s);
	}

}
