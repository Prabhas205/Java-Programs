package week2;
import java.util.Scanner;
public class ArmStrong {

	public static void main(String[] args) {
		int original_num,num,i,sum=0,digit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a NUmber : ");
		original_num=sc.nextInt();
		num=original_num;
		while(num>0)
		{
			digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
					
		}
		if(sum==original_num)
			System.out.println("The given number" +original_num+ "is a Armstrong number.");
		else
			System.out.println("The given number" +original_num+ "is not a Armstrong number.");

	}

}
