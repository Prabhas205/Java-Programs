package week2;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		int original_num,num,reversed_num=0,digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		original_num=sc.nextInt();
		num=original_num;
		while(num>0)
		{
			digit=num%10;
			reversed_num=reversed_num*10+digit;
			num=num/10;
			
		}
		if(reversed_num==original_num)
			System.out.println("The given number"+original_num+"is a palindrome.");
		else
			System.out.println("The given number"+original_num+"is not a palindrome.");

	}

}
