package lesson10lab1;
public class part2 {
	public static void fillRandom(int[] a) {
		for (int i=0;i<a.length;i++) {
			a[i] = (int)(Math.random()*20+1);
		}
	}
	public static String aToString(int[] b) {
		String str = "";
		for (int i=0;i<b.length;i++) {
			str += "a[" + i + "] = " + b[i] + "\n";
		}
		return str;
	}
	public static int[] copyInt(int[] c) {
		int[] copy = new int[c.length];
		for (int i=0;i<c.length;i++) {
			copy[i] = c[i];
		}
		return copy;
	}
	public static int[] subArray(int start, int end, int[] arr) {
		int[] subarr = new int[end-start+1];
		for (int i=start;i<=end;i++) {
			subarr[i-start] = arr[i];
		}
		return subarr;
	}
	public static int searchArr(int value, int[] d) {
		int end = 0;
		int i=0;
		while (end==0) {
			if (i>=d.length) {
				end = -1;
				return -1;
			}
			if (d[i] == value) {
				end=-1;
				return i;
			}
		i++;
		}
		return -1;
	}
}
/*This is the array
a[0] = 20
a[1] = 6
a[2] = 14
a[3] = 8
a[4] = 15
a[5] = 6
a[6] = 19
a[7] = 20
a[8] = 7
a[9] = 18

This is the copied array
a[0] = 20
a[1] = 6
a[2] = 14
a[3] = 8
a[4] = 15
a[5] = 6
a[6] = 19
a[7] = 20
a[8] = 7
a[9] = 18

This is the sub array
a[0] = 14
a[1] = 8
a[2] = 15
a[3] = 6
a[4] = 19

This is searching for 15
4
*/