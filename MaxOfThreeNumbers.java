package week1;
import java.util.Scanner;
public class MaxOfThreeNumbers {

	public static void main(String[] args) {
		int a,b,c ,max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter values of a,b,andc : ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		max = (a>b)?((a>c) ? a:c):((b>c) ? b:c);
		System.out.println("Maximum of number :" +max);
		
		

	}

}
