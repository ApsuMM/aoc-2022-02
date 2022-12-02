package aoc;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new FileReader(Main.class.getClassLoader().getResource("data.txt").getFile()));
		int total = 0;
		
		String line = null;
		while ((line = reader.readLine()) != null)
		{
			Integer opponent = null;
			switch (line.charAt(0))
			{
			case 'A':	opponent = 1;
						break;
			case 'B':	opponent = 2;
						break;
			case 'C':	opponent = 3;
						break;
			}
			
			switch (line.charAt(2))
			{
			case 'X':	total += Main.lose(opponent);
						break;
			case 'Y':	total += opponent + 3;
						break;
			case 'Z':	total += Main.win(opponent) + 6;
						break;
			}
		}
		System.out.println(total);
	}
	
	public static int win(int i)
	{
		i++;
		if (i > 3)
		{
			i = 1;
		}
		return i;
	}
	
	public static int lose(int i)
	{
		i--;
		if (i < 1)
		{
			i = 3;
		}
		return i;
	}
}
