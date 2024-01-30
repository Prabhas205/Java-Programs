package week1;
import java.util.Scanner;
public class NumberPosNegZer {

	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		num=sc.nextInt();
		if(num>0)
		{
			System.out.print("Given number"+num+"is positive.");
		}
		else if(num<0)
		{
			System.out.println("Given number"+num+"is negative.");
		}
		else
		{
			System.out.println("The number is zero.");
		}

	}

}
