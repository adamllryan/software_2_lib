/*Adam Ryan
 * Moga
 * 1/13/19
 * Homework
 */


package lesson10lab1;

class problem1 {
    public static void main(String[] args) {
        int[] a = {34, 23, 67, 89, 12};
        int index = 0;
        //10.2 1
        //23
        //10.2 2
        //89
        //10.2 3
        //156
        //10.3 1
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);


        //10.3 2
        for (int i=a.length-1;i>=0;i--)
          System.out.println(a[i]);
        //  10.3 3
        //
        for (int i=0;i<a.length; i++) {
            if (a[i] < 0) {
                index = i;
                i = a.length;
            }
        }
        //10.3 4 a
        //sets all values in array to positive
        //10.3 4 b
        //adds all the array values into a sum
        //10.3 5
        //it returns the length of the array, which allows the use of for loops with different array lengths
        //10.4 1
        double[] d = new double[15];
        String[] s = new String[20];
        //10.4 2
        //it is the values in the braces that holds the values of an array
        //10.4 3
        int[] scores = {100,90,75,60,88};
        double[] rates = {.12,.05,.15};
        String[] name = {"Adam","Ryan"};
        //10.4 4
        //using <type>[] is more clear because it shows that it is an array instead of a regular variable
        //10.5 5
        //
        int[] a1 = {1,2,4,8,16,32,64,128,256,512};
        int[] a2 = {0,1,2,3,4,5,6,7,8,9};
        
    }
}
