package wipro;

public class Arrays6 {

	public static void main(String[] args) {
		
		int arr[]= {1,6,4,8,7,9};
		
		for(int i=0;i<=arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}
			}
		}
		for(int num:arr)
		System.out.print(num);

	}

}
