package wipro;
import java.util.*;
public class Arrays10{

	public static void main(String[] args) {
		
		
		int arr[]= {3,2,2};
		List<Integer>list=new ArrayList<>();
		for(int num:arr)
		{
			if(num%2==0)
			{
				list.add(num);
			}
		}
		
		for(int num:arr)
		{
			if(num%2!=0)
			{
				list.add(num);
			}
		}
		
		
		
			System.out.print(list);
		

	}

}
 