package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class code 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> sumofint = new ArrayList<>();
		ArrayList<String> listofint = new ArrayList<>();
		String nextval = scan.next();
		while (!nextval.equals("a"))
		{
			listofint.add(nextval);
			nextval = scan.next();
		}
		int sumof0 = 0;
		int sumof1 = 0;
		for (int j = 0; j < 12; ++j)
		{
			for (int i = 0; i < listofint.size(); ++i)
			{
				if (listofint.get(i).charAt(j) == '0')
				{
					++sumof0;
				}
				else
				{
					++sumof1;
				}
			}
			if (sumof0 > sumof1)
			{
				sumofint.add(0);
			}
			else
			{
				sumofint.add(1);
			}
			sumof0 = 0;
			sumof1 = 0;
		}
		scan.close();
		String binaryString = "";
		for (int i = 0; i < sumofint.size(); ++i)
		{
			if (sumofint.get(i) == 1)
			{
				binaryString += 1;
			}
			else
			{
				binaryString += 0;
			}
		}
		int saved = Integer.parseInt(binaryString, 2);
		binaryString = "";
		for (int i = 0; i < sumofint.size(); ++i)
		{
			if (sumofint.get(i) == 1)
			{
				binaryString += 0;
			}
			else
			{
				binaryString += 1;
			}
		}
		System.out.println(Integer.parseInt(binaryString, 2) * saved);
		
	}
}
