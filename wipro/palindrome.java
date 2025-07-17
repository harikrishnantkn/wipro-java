package wipro;
import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int og=num;
		int sum=0;
		
		while(num>0)
		{
			int digit=num%10;
			 sum=sum*10+digit;
			num=num/10;
		}
		
		if(og==sum)
		{
			System.out.print("is palindrome");
		}
		else
		{
			System.out.print("not palindrome");
		}
		
	}

}
