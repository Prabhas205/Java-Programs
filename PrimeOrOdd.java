package week2;
import java.util.Scanner;
public class PrimeOrOdd {

	public static void main(String[] args) {
		int num,i,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number :");
		num=sc.nextInt();
		for(i=2;i<=num/2;i++)
		{
			if(num%i==0)
			{
				flag=1;
				break;
			}
		}
		if (flag==0)
			System.out.println(num+"is a prime.");
		else
			System.out.println(num+"is not a prime.");

	}

}
