 package wipro;
import java.util.*;
public class Arrays1 {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4};
		int sum=0;
		
		for(int num:arr)
		{
			sum+=num;
		}
		int average =sum/arr.length;
		
		System.out.print(sum +" & "+ average);
		
		
		
		
		
		
	}

}
