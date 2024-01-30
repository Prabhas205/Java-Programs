package week2;

public class PrimenumbersFrom1To100 {

	public static void main(String[] args) {
		int i,j;
		for(i=2;i<=100;i++)
		{
			for(j=2;j<=i/2;j++)
			{
				if(j%i==0)
				{
					break;
				}
			}
			if(j==i/2 + 1)
			{
				System.out.println("prime numbers from 1 to 100 :"+i);
			}
		}

	}

}
