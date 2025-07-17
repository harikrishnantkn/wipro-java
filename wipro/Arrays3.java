package wipro;
import java.util.*;
public class Arrays3 {

	public static void main(String[] args) {
		int arr[]= {1,2,5,7,9};
		
		Scanner scan=new Scanner(System.in);
		int target=scan.nextInt();
		int num=0;
		for(int i=0;i<arr.length;i++)
		{
			if(target==arr[i])
			{
				num=i;
				break;
			}
		}
		
		if(num==0)
		{
			System.out.print("-1");
		}
		else
		{
			System.out.print(num);
		}
		
		
		
		
		
		
		
		
		
	}

}
