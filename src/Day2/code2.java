package Day2;

import java.util.Scanner;

public class code2 
{
	public static void main(String[]args)
	{

		Scanner scan = new Scanner(System.in);
		int horizon = 0;
		int aim = 0;
		int depth = 0;
		String direction = scan.next();
		int distance = scan.nextInt();
		while (!direction.equals("a"))
		{
			if (direction.charAt(0) == 'f')
			{
				horizon += distance;
				depth += distance * aim;  
			}
			else
			{
				if (direction.charAt(0) == 'd')
				{
					aim += distance;
				}
				else
				{
					aim -= distance;
				}
			}
			direction = scan.next();
			distance = scan.nextInt();
		}
		System.out.println(horizon * depth);
		scan.close();
	}
}
