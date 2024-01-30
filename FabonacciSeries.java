package week2;
import java.util.Scanner;
public class FabonacciSeries {

	public static void main(String[] args) {
		int num,a=0,b=1,c , temp,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Nummber of terms you want :");
		num=sc.nextInt();
		System.out.println("The Fibboncci series is"+a+" "+b );
		for(i=2;i<num;i++)
		{
			c=a+b;
			System.out.println(+c);
			temp=a;
			a=b;
			b=c;
		}

	}

}
