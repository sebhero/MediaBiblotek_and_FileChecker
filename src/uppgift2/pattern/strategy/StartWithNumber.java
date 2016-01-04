package uppgift2.pattern.strategy;

import java.util.ArrayList;

import uppgift2.AgeGroup;

/**
 * Check if current line starts with a the agegroup number Strategy pattern.
 * 
 * @author seb
 * 
 */
public class StartWithNumber implements CheckStrategy
{

	@Override
	public ArrayList<AgeGroup> check(String inputString,
			ArrayList<AgeGroup> listOfAgeGroups)
	{

		final AgeGroup group = listOfAgeGroups.get(listOfAgeGroups.size() - 1);

		try
		{
			group.setAge(Integer.parseInt(inputString));
			return listOfAgeGroups;
		}
		catch (final Exception e)
		{
			return listOfAgeGroups;
		}

	}
}
