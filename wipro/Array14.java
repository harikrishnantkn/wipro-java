package wipro;
import java.util.*;
public class Array14 {

	public static void main(String[] args) {
//		
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int arr[][]=new int[n][m];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				max=Math.max(max,arr[i][j]);
				
			}
		}
		
		System.out.print("Max value="+max);
		
		
		
		

	}

}
