import java.util.*;
class RemLin{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		LinkedList<Integer> ar=new LinkedList<>(3);
		System.out.println("Enter size of list");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			ar.add(sc.nextInt());
		}
		System.out.println("First element is "+ar.getFirst());
		System.out.println("First element is "+ar.getLast());
}}