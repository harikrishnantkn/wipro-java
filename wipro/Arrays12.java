package wipro;

public class Arrays12 {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3};
		int arr2[]= {4,5,6};
		
		
		int arr3[]=new int[2];
		
		arr3[0]=arr1[1];
		arr3[1]=arr2[1];
		
		for(int num:arr3) System.out.print(num+"  ");

	}

}
