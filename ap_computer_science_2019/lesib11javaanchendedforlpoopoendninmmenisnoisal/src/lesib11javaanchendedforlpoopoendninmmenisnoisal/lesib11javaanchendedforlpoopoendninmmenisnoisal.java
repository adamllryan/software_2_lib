package lesib11javaanchendedforlpoopoendninmmenisnoisal;
public class lesib11javaanchendedforlpoopoendninmmenisnoisal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] list = {56,23,78,54};
		int i=0;
		System.out.println("Print original list");
		for(i = 0; i < 4; i++){
			System.out.println(" initial list["+ i + "]= "+list[i]);}
		i=0;
		System.out.println("each element in the list is in variable item");
		for(int item : list){
			System.out.println(item);
			System.out.println(" initial list["+ i + "]= "+list[i]);
			i++;}
		i=0;
		System.out.println( " ******************");
		System.out.println(" Within the loop the enhanced loop control variable uses a copy of the orignial list");		
		System.out.println(" Even if the original value is indexed and changed within the enhanced loop");
		for(int item : list){
			list[i]=0;
			System.out.println(item);
			System.out.println(" initial list["+ i + "]= "+list[i]);
			i++;}
		i=0;
		for(i = 0; i < 4; i++){
			System.out.println("/n" + "updated list["+ i + "]= "+list[i]);}
		i=0;
		for(int item : list){
			System.out.println(item);
			System.out.println(" initial list["+ i + "]= "+list[i]);
			i++;}
		System.out.println( " ******************");		
		int a[] = {2,4,6,8,10};
		i=0;
		for(int item: a){
			System.out.println(" initial a[" + i + "]=" +a[i] );
			i++;}
		i=0;
		System.out.println("The enhanced loop control variable can not change any value inside of the array");
		for( int item : a){
			item =99;
			System.out.println( "in enhanced loop " + item);
			System.out.println(" in enhanced a[" + i + "]=" +a[i] );
			i++;}
		for(i=0; i<5; i++){
			System.out.println(" initial a[" + i + "]=" +a[i] );}
		System.out.println("What can you conclude about an enhanced for looop and the loop control variable?");
	}	
}
