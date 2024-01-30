package week3;
import java.util.Scanner;
public class FullPyramid {

	public static void main(String[] args) {
		int num,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows : ");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=num;j++)
			{
				if(j<=num-i)
					System.out.print(" ");
				else
					System.out.println("*");
			}
			System.out.println();
		}
			

	}

}
