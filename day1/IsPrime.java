package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		if(n==1)
		{
			System.out.println("the number 1 is neither nor a prime number");

		}
		else if(n==2) {
			System.out.println("the number 2 is prime number");
		}

		else {for (int i = 2; i <n; i++) {
			if(n%i==0)
			{
				System.out.println("The Given Number "+n+" is not prime");
				break;
			}
			else 
			{
				System.out.println("The Given Number "+n+" is prime");
				break;
			}
		}
		}
	}
}





