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

			RoShamBo opponent = null;
			switch (line.charAt(0))
			{
			case 'A':	opponent = RoShamBo.Rock;
						break;
			case 'B':	opponent = RoShamBo.Paper;
						break;
			case 'C':	opponent = RoShamBo.Scissors;
						break;
			}
			
			RoShamBo self = null;
			switch (line.charAt(2))
			{
			case 'X':	self = RoShamBo.Rock;
						total += 1;
						break;
			case 'Y':	self = RoShamBo.Paper;
						total += 2;
						break;
			case 'Z':	self = RoShamBo.Scissors;
						total += 3;
						break;
			}
			
			if (opponent == self)
			{
				total += 3;
				continue;
			}
			
			if (opponent == RoShamBo.Rock && self == RoShamBo.Paper)
			{
				total += 6;
				continue;
			}
			
			if (opponent == RoShamBo.Paper && self == RoShamBo.Scissors)
			{
				total += 6;
				continue;
			}
			
			if (opponent == RoShamBo.Scissors && self == RoShamBo.Rock)
			{
				total += 6;
				continue;
			}
		}
		System.out.println(total);
	}
}
