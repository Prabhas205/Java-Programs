package week1;
import java.util.Scanner;
public class MaxOfTwoNumbers {

	public static void main(String[] args) {
		int a,b,max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a and b : ");
		a = sc.nextInt();
		b = sc.nextInt();
		max = (a>b)?a:b;
		System.out.println("Maximum of two numbers is : "+max);

	}

}
