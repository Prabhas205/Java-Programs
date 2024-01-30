package week2;
import java.util.Scanner;
public class SumOfDigits {

	public static void main(String[] args) {
		int num,i,sum=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num=sc.nextInt();
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum of digits of the given numbers is :"+sum);

	}

}
