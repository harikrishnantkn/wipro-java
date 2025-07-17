package wipro;
import java.util.*;
public class Array9 {

	public static void main(String[] args) {
		
		int arr[]= {99,5,10,14,10};
		int idx=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==10)
			{
				arr[i]=0;
			}
		}
		List<Integer> list=new ArrayList<>();
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
			   list.add(arr[i]);
			}
		}
		for(int i=list.size()-1; i<arr.length-1; i++)
		{
			list.add(0);
			
		}
    System.out.print(list);
		
		
		
		

	}

}
