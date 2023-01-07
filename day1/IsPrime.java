package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=4;
		for (int i = 2; i <n; i++) {
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


