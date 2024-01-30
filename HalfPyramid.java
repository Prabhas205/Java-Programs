package week3;
import java.util.Scanner;
public class HalfPyramid {

	public static void main(String[] args) {
		int num,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows : ");
		num=sc.nextInt();
		for(i=0;i<num;i++)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
