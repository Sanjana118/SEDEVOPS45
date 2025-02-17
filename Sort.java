import java.util.*;
class Sort{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ar=new ArrayList<>();
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			ar.add(sc.nextInt());
		}
		Collections.sort(ar);
		System.out.println(ar);
	
	System.out.println("Enter the first element to be inserted ");
	ar.add(0,sc.nextInt());
	System.out.println(ar);
	
	ArrayList<Integer> ar2=new ArrayList<>(ar);
	ArrayList<Integer> ar3=new ArrayList<>();
	ar3=ar;
	System.out.println("\n"+ar2);
	System.out.println("\n"+ar3);
	}
}

		