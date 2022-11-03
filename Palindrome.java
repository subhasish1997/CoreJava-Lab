
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 525;
		int j=i;
		int r;
		int sum=0;
		
		while(i>0)	{
		
		r= i%10;
		sum= (sum*10)+ r;
		i= i/10;
		
	}
		if(j==sum) {
			
			System.out.println("Its a Palindrome number");
		}
		else {
			System.out.println("Its not a Palindrome number");
		}
		}
	}
