package week1.day1;

public class FibnociiSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,sum ;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i < 11; i++) {
			sum =a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}
}
