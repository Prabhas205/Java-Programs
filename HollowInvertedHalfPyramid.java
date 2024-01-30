package week3;
import java.util.Scanner;
public class HollowInvertedHalfPyramid {

	public static void main(String[] args) {
		int num,i,j;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.of rows : ");
		num=sc.nextInt();
		for(i=1;i<=num;i++)
		{
				for(j=1;j<i;j++)
				{
					System.out.print(" ");
				}
					if(i==1||i==num){
						for(i=1;i<=num;i++)
							System.out.println("*");{
				}
					}else
			{
				System.out.print("*");
				for(i=1;i<=num-2;i++) {
					System.out.println(" ");
			}
				}
				
						System.out.println();
				}
			}

	}

