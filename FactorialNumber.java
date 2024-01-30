package week1;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		int num,i;
		long factorial=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		num=sc.nextInt();
		if(num>0)
		{
			for(i=1;i<=num;i++)
			{
				factorial=factorial*i;
			}
			System.out.println("The factorial is :" +factorial);
		}
		else if(num<0)
		{
			System.out.println("The factorial for a negative number is not defined. ");
		}
		else
		{
			System.out.println("The factorial is zero.");
		}

	}

}
