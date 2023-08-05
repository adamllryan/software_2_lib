package lesson10lab1;

public class part2tester {

	public static void main(String[] args) {
		int[] a = new int[10];
		part2.fillRandom(a);
		System.out.println("This is the array");
		System.out.println(part2.aToString(a));
		System.out.println("This is the copied array");
		System.out.println(part2.aToString(part2.copyInt(a)));
		System.out.println("This is the sub array");
		
		System.out.println(part2.aToString(part2.subArray(2,6,a)));
		System.out.println("This is searching for 15");
		System.out.println(part2.searchArr(15,a));
	}

}
