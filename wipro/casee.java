package wipro;
import java.util.*;
public class casee {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		char ch=scan.next().charAt(0);
		
		if(ch>='A' && ch <='Z')
		{
			ch=(char)(ch+32);
			System.out.print(ch);
		}
		else
		{
			ch=(char)(ch-32);
			System.out.print(ch);
		}
		

	}

}
