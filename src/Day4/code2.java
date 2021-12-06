package Day4;

import java.util.ArrayList;
import java.util.Scanner;

public class code2 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String[] listofint = scan.next().split(",");
		ArrayList<ArrayList<ArrayList<Integer>>> listof2DArray = new ArrayList<ArrayList<ArrayList<Integer>>>();
		boolean check = true;
		int nextinteger = scan.nextInt();
		while (nextinteger != -1)
		{
			ArrayList<ArrayList<Integer>> listofrowinarray = new ArrayList<>();
			for (int i = 0; i < 5; ++i)
			{
				ArrayList<Integer> listofintinrow = new ArrayList<>();
				for (int j = 0; j < 5; ++j)
				{
					listofintinrow.add(nextinteger);
					nextinteger = scan.nextInt();
				}
				listofrowinarray.add(listofintinrow);
			}
			listof2DArray.add(listofrowinarray);
		}
		scan.close();
		int savedthebingo = 0;
		int lastnumber = 0;
		for (int i = 0; i < listofint.length; ++i)
		{
			lastnumber = Integer.parseInt(listofint[i]);
			for (int h = 0; h < listof2DArray.size(); ++h)//loop the number of existing 2D array
			{
				for (int k = 0; k < 5; ++k) //loop the row
				{
					for (int j = 0; j < 5; ++j) //loop the col
					{
						if (Integer.parseInt(listofint[i]) == listof2DArray.get(h).get(k).get(j))
						{
							listof2DArray.get(h).get(k).set(j, 200);
						}
					}
				}
			}
			for (int h = 0; h < listof2DArray.size(); ++h)
			{
				int countrow1 = 0;
				int countrow2 = 0;
				int countrow3 = 0;
				int countrow4 = 0;
				int countrow5 = 0;
				int countcol1 = 0;
				int countcol2 = 0;
				int countcol3 = 0;
				int countcol4 = 0;
				int countcol5 = 0;
				for (int k = 0; k < 5; ++k) //loop the row
				{
					for (int j = 0; j < 5; ++j) //loop the col
					{
						if (listof2DArray.get(h).get(k).get(j) == 200)
						{
							if (k == 0)
							{
								++countrow1;
								if (j == 0)
								{
									++countcol1;
								}
								if (j == 1)
								{
									++countcol2;
								}
								if (j == 2)
								{
									++countcol3;
								}
								if (j == 3)
								{
									++countcol4;
								}
								if (j == 4)
								{
									++countcol5;
								}
							}
							if (k == 1)
							{
								++countrow2;
								if (j == 0)
								{
									++countcol1;
								}
								if (j == 1)
								{
									++countcol2;
								}
								if (j == 2)
								{
									++countcol3;
								}
								if (j == 3)
								{
									++countcol4;
								}
								if (j == 4)
								{
									++countcol5;
								}
							}
							if (k == 2)
							{
								++countrow3;
								if (j == 0)
								{
									++countcol1;
								}
								if (j == 1)
								{
									++countcol2;
								}
								if (j == 2)
								{
									++countcol3;
								}
								if (j == 3)
								{
									++countcol4;
								}
								if (j == 4)
								{
									++countcol5;
								}
							}
							if (k == 3)
							{
								++countrow4;
								if (j == 0)
								{
									++countcol1;
								}
								if (j == 1)
								{
									++countcol2;
								}
								if (j == 2)
								{
									++countcol3;
								}
								if (j == 3)
								{
									++countcol4;
								}
								if (j == 4)
								{
									++countcol5;
								}
							}
							if (k == 4)
							{
								++countrow5;
								if (j == 0)
								{
									++countcol1;
								}
								if (j == 1)
								{
									++countcol2;
								}
								if (j == 2)
								{
									++countcol3;
								}
								if (j == 3)
								{
									++countcol4;
								}
								if (j == 4)
								{
									++countcol5;
								}
							}
						}
					}
				}	
				if (countrow1 == 5 || countrow2 == 5 || countrow3 == 5 || countrow4 == 5 || countrow5 == 5 || countcol1 == 5 ||countcol2 == 5 || countcol3 == 5 || countcol4 == 5 || countcol5 == 5)
				{
					if (listof2DArray.size() == 1)
					{
						savedthebingo = h;
						check = false;
						break;
					}
					else
					{
						listof2DArray.remove(h);
						--h;
						check = true;
						continue;
					}
				}
			}
			if (!check)
			{
				break;
			}
			else
			{
				continue;
			}
		}
		int sum = 0;
		for (int i = 0; i < listof2DArray.get(savedthebingo).size(); ++i)
		{
			for (int j = 0; j < 5; ++j)
			{
				if (listof2DArray.get(savedthebingo).get(i).get(j) != 200)
				{
					sum += listof2DArray.get(savedthebingo).get(i).get(j);
				}
			}
		}
		System.out.println(sum * lastnumber);
	}
}
