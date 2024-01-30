package week3;
import java.util.Scanner;
public class InvertedFullPyramid {

	public static void main(String[] args) {
		int num,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows : ");
		num=sc.nextInt();
		for(i=num;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				if(j>num-i)
					System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
