
public class hw5Test {
	static boolean allTheSame(int x, int y, int z) {
		return (x==y&&y==z) ? true: false;
	}
	static boolean allDifferent(int x, int y, int z) {
		return (x!=y&&y!=z&&x!=z) ? true : false;
	}
	static boolean sorted(int x, int y, int z) {
		return (x<=y && y<=z) ? true : false;
	}
	public static void main(String[] args) {
		System.out.println(allTheSame(0,0,0));
		System.out.println(allTheSame(0,1,0));
		System.out.println(allTheSame(1,0,0));
		System.out.println(allTheSame(0,0,1));
		System.out.println(allDifferent(0,0,0));
		System.out.println(allDifferent(0,0,1));
		System.out.println(allDifferent(0,1,0));
		System.out.println(allDifferent(1,0,0));
		System.out.println(allDifferent(1,0,2));
		System.out.println(sorted(1,2,3));
		System.out.println(sorted(2,1,3));
		System.out.println(sorted(1,1,3));
		
		
		
	}
	


}
