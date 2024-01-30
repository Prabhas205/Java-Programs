package week3;
import java.util.Scanner;
public class InvertedHalfPyramid {

	public static void main(String[] args) {
		int num,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows : ");
		num=sc.nextInt();
		for(i=num;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
