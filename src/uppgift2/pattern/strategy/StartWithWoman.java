package uppgift2.pattern.strategy;

import java.util.ArrayList;

import uppgift2.AgeGroup;

/**
 * Check if the line if for the women part then it adds the men data to the
 * agegroup.
 * 
 * @author seb
 * 
 */
public class StartWithWoman implements CheckStrategy
{

	@Override
	public ArrayList<AgeGroup> check(String inputLine,
			ArrayList<AgeGroup> listOfAgeGroups)
	{
		final AgeGroup group = listOfAgeGroups.get(listOfAgeGroups.size() - 1);

		if (inputLine.toLowerCase().contains("kvinnor"))
		{
			int ammountOfWomen = 0;
			ammountOfWomen = Integer.parseInt(inputLine.replaceAll("\\D", ""));
			group.setWomen(ammountOfWomen);
			group.setSumOfFolks(group.getMen(), ammountOfWomen);
			return listOfAgeGroups;
		}
		else
		{
			return listOfAgeGroups;
		}
	}

}
