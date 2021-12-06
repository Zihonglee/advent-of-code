package Day1;

import java.util.ArrayList;
import java.util.Scanner;

public class code2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> listofint = new ArrayList<>();
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int total = 0;
		while (scan.hasNextInt()) 
		{
			total = x + y +z;
			listofint.add(total);
			x = y;
			y = z;
			z = scan.nextInt();
			if (z == 6624)
			{
				total = x + y + z;
				listofint.add(total);
				break;
			}
		}
		scan.close();
		System.out.println(helpermethod(listofint));
	}
	
	public static int helpermethod(ArrayList<Integer> listofint)
	{
		int sum = 0;
		for (int i = 0; i < listofint.size() - 1; ++i)
		{
			if (listofint.get(i) < listofint.get(i + 1))
			{
				++sum;
			}
		}
		return sum;
	}
}