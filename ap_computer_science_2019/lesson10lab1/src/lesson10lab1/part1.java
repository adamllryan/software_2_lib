package lesson10lab1;

public class part1 {
	public static void main(String[] args) {
		int[] myArr = new int[10];
		for (int i=0; i<10; i++) {
			myArr[i] = (int)(Math.random()*50+1);
		}
		for (int i=0; i<myArr.length; i++) {
			System.out.println("myArr[" + i + "] = " + myArr[i]);
		}
		
	}
}
/*myArr[0] = 16
myArr[1] = 43
myArr[2] = 43
myArr[3] = 21
myArr[4] = 39
myArr[5] = 21
myArr[6] = 39
myArr[7] = 6
myArr[8] = 12
myArr[9] = 44
*/