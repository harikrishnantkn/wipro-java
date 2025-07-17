package wipro;
import java.util.*;
public class Arrays13 {

	public static void main(String[] args) {
		
		
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
		
		int flat[]=new int[n*m];
		int idx=0;
		
		for(int[] row:arr)
		{
			for(int num:row)
			{
				flat[idx++]=num;
			}
		}
		
		
		idx=0;
		
		for(int i=0;i<flat.length/2;i++)
		{
			
			int temp=flat[i];
			flat[i]=flat[flat.length-1-i];
			flat[flat.length-1-i]=temp;
			
		}
		idx=0;
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=flat[idx++];
			}
		}
		
		for(int[] row:arr) 
		{
			for(int num:row)
			{
			System.out.print(num);
			}
		}

	}

}
