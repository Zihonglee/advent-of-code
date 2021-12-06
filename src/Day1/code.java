package Day1;

import java.util.Scanner;

public class code {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int listofnumber = scan.nextInt();
		while (listofnumber != 6624)
		{
			int listofnumber2 = scan.nextInt();
			if (listofnumber2 == 6624)
			{
				break;
			}
			if (listofnumber < listofnumber2)
			{
				++sum;
			}
			listofnumber = listofnumber2;			
		}
		System.out.println(sum);
		scan.close();
	}
}
