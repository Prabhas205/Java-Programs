package week3;
import java.util.Scanner;
public class HollowInvertedHalf {

	public static void main(String[] args) {
		int rows,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows : ");
		Scanner scanner = null;
		scanner.close();
	    rows=sc.nextInt();
		for(i=1;i<=rows;i++)
		{
			for(j=1;j<=i;j++)
				if(j==1 || j==i || i==rows)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
		}
		System.out.println();

	}

}
