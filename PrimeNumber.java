
public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean f = true;
		int i;
		int j =11;
		
		for(i=2; i<j; i++) {
			if(j%i==0) {
				
				f = false;
				}
			}if(f== true){
				System.out.println("It is a Prime Number");
				}else {
					System.out.println("It is not a Prime Number");
				}

	}
}

