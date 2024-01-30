package week2;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
		int number,i,sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		number=sc.nextInt();
		for(i=1;i<=number;i++)
		{
			if(number%i==0)
			{
				sum=sum+i;
			}
		}

	
	if(sum==number)
		System.out.println("The given nummber"+number+"is a perfect number.");
	else
		System.out.println("THe given number"+number+"is not a perfect number.");

}
}

	
