package wipro;
import java.util.*;
public class Arrays4 {

	public static void main(String[] args) {
		
		
		
		int arr[]=new int[55];
		int idx=0;
		
		for(int i=65;i<91;i++)
		{
			arr[idx++]=i;
		}
		for(int i=97;i<=123;i++)
		{
			arr[idx++]=i;
		}
		for(int num:arr)
		System.out.print((char)num+" ");
		
	     
	
	}
}

