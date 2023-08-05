package snippet;
import components.queue.*;
public class Homework15 {
	/**
	 * Reports the smallest integer in the given {@code Queue<Integer>}.
	 * 
	 * @param q
	 *            the queue of integer
	 * @return the smallest integer in the given queue
	 * @requires q /= empty_string
	 * @ensures <pre>
	 * min is in entries(q) and
	 * for all x: integer
	 *     where (x is in entries(q))
	 *   (min <= x)
	 * </pre>
	 */
	private static int min(Queue<Integer> q) {
		int min = q.front();
		for (int i = q.length();i>0;i--) {
			int temp = q.dequeue();
			if (min > temp)
				min = temp;
			q.enqueue(temp);
		}
		return min;
	}
	
	/**
	 * Reports an array of two {@code int}s with the smallest and the
	 * largest integer in the given {@code Queue<Integer>}.
	 * 
	 * @param q
	 *            the queue of integer
	 * @return an array of two {@code int}s with the smallest and the
	 *         largest integer in the given queue
	 * @requires q /= empty_string
	 * @ensures <pre>
	 * { minAndMax[0], minAndMax[1] } is subset of entries(q) and
	 * for all x: integer
	 *     where (x in in entries(q))
	 *   (minAndMax[0] <= x <= minAndMax[1])
	 * </pre>
	 */
	private static int[] minAndMax(Queue<Integer> q) {
		int[] maxima = {q.front(),0};
		int i = q.dequeue();
		if (q.length()>0)
			maxima = minAndMax(q);
		if (i<maxima[0]) 
			maxima[0] = i;
		if (i>maxima[1])
			maxima[1] = i;
		q.enqueue(i);
		q.rotate(-1);
		return maxima;
	}
	private static int[] minAndMaxNoah(Queue<Integer> q) {
		int iterations = (q.length()%2==0) ? q.length()/2 : q.length()/2+1;
		int[] maxima = {q.front(),0};
		for (int i = 0; i<iterations; i++) {
			int one = q.dequeue();
			int two = q.dequeue();
			int smaller = (one>two) ? two : one;
			int larger = (one>two) ? one : two;
			if (smaller < maxima[0]) 
				maxima[0] = smaller;
			if (larger > maxima[1]) 
				maxima[1] = larger;
			q.enqueue(one);
			q.enqueue(two);
		}
		if (q.length()%2!=0)
			q.rotate(-1);
		return maxima;
	}
	public static void main(String[] args) {
		Queue<Integer> q = new Queue1L<>();
		for (int i = 0; i<=15; i++) {
			q.enqueue(i);
		}
		q.enqueue(50);
		q.enqueue(-50);
		q.enqueue(-123);
		System.out.println(q.toString());
		int[] temp = minAndMax(q);
		System.out.println("Min: " + temp[0] + ", Max: " + temp[1]);
		System.out.println(q.toString());
		System.out.println(min(q));
		System.out.println(q.toString());
		temp = minAndMaxNoah(q);
		System.out.println("Min: " + temp[0] + ", Max: " + temp[1]);
		System.out.println(q.toString());
	}
}
