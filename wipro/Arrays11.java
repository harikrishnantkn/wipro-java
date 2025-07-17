package wipro;

public class Arrays11 {

	public static void main(String[] args) {
		int arr[]= {1,1,1};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=1 && arr[i]!=4)
			{
				count=1;
				break;
				
			}
			
		}
		
		if(count==1)
		{
			System.out.print("false");
		}
		else
		{
			System.out.print("true");
		}
		
		
		
		
		
	}

}
