package uppgift2.pattern.strategy;

import java.util.ArrayList;

import uppgift2.AgeGroup;

/**
 * Check if the line if for the men part then it adds the men data to the
 * agegroup.
 * 
 * @author seb
 * 
 */
public class StartWithMen implements CheckStrategy
{

	@Override
	public ArrayList<AgeGroup> check(String inputLine,
			ArrayList<AgeGroup> listOfAgeGroups)
	{
		final AgeGroup group = listOfAgeGroups.get(listOfAgeGroups.size() - 1);

		if (inputLine.toLowerCase().contains("m�n"))
		{
			int ammountOfMen = 0;
			ammountOfMen = Integer.parseInt(inputLine.replaceAll("\\D", ""));
			group.setMen(ammountOfMen);
			return listOfAgeGroups;
		}
		else
		{
			return listOfAgeGroups;
		}

	}
}
