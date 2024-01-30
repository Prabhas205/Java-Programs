package week1;
import java.util.Scanner;
public class SumOfThreeNumbers {

	public static void main(String[] args) {
		int a,b,c,sum;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of a,b,c : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		sum = a+b+c;
		System.out.println("Sum of"+a+","+b+"and"+c+"is: " +sum);

	}

}
