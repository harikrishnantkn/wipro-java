package wipro;
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int reverse=0;
		
		while(num!=0)
		{
			int digit=num%10;
			 reverse=reverse*10+digit;
			 num=num/10;
			
		}
		System.out.print(reverse);

	}

}
