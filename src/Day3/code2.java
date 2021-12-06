package Day3;

import java.util.ArrayList;
import java.util.Scanner;

public class code2 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
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
			if (listofint.size() == 1)
			{
				break;
			}
			if (sumof0 > sumof1)
			{
				for (int i = 0; i < listofint.size(); ++i)
				{
					if (listofint.get(i).charAt(j) == '1')
					{
						listofint.remove(i);
						--i;
					}
				}
			}
			else
			{
				if (sumof0 == sumof1 )
				{
					for (int i = 0; i < listofint.size(); ++i)
					{
						if (listofint.get(i).charAt(j) == '0')
						{
							listofint.remove(i);
							--i;
						}
					}
				}
				else
				{
					for (int i = 0; i < listofint.size(); ++i)
					{
						if (listofint.get(i).charAt(j) == '0')
						{
							listofint.remove(i);
							--i;
						}
					}
				}
			}
			sumof0 = 0;
			sumof1 = 0;
		}
		scan.close();		
		System.out.println(listofint.toString());
		String saved = "";
		for (int i = 0; i < listofint.size(); ++i)
		{
			saved += listofint.get(i);
		}
		System.out.println(Integer.parseInt(saved, 2));
		//this is just the half part of it not full, if want it to be full then copy twice the code and change the condition.
	}
}
