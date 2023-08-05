package lesson10lab3;

public class part5 {
	public static void main(String[] args) {
		int[][] a = {{0,0,0,0},{0,0,0,0},{0,0,0,0}};
		for (int r = 0; r<a.length; r++) {
			for (int c = 0; c<a[0].length; c++) {
				a[r][c] = (int)(Math.random() * 100);
			}
		}
		System.out.print("[ ]");
		for (int i = 0; i<a[0].length; i++) {
			System.out.print("\t[" + (i) + "]");
		}
		for (int r = 0; r<a.length; r++) {
			System.out.print("\n[" + r + "]\t");
			for (int c = 0; c<a[0].length; c++) {
				System.out.print(a[r][c] + "\t");
			}
		}
		
		
	}
}