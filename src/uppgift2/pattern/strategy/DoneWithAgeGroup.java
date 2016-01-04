package uppgift2.pattern.strategy;

import java.util.ArrayList;

import uppgift2.AgeGroup;

/**
 * When done with the agegroup. First it will chekc that the agegruop has the
 * right data and then create a new empty agegroup.
 * 
 * @author seb
 * 
 */
public class DoneWithAgeGroup implements CheckStrategy
{

	@Override
	public ArrayList<AgeGroup> check(String inputString,
			ArrayList<AgeGroup> listOfAgeGroups)
	{
		final AgeGroup group = listOfAgeGroups.get(listOfAgeGroups.size() - 1);
		if (group.getMen() == 0)
		{
			return listOfAgeGroups;
		}
		if (group.getWomen() == 0)
		{
			return listOfAgeGroups;
		}
		listOfAgeGroups.add(new AgeGroup());
		return listOfAgeGroups;
	}
}
