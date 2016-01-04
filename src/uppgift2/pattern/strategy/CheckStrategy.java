package uppgift2.pattern.strategy;

import java.util.ArrayList;

import uppgift2.AgeGroup;

/**
 * using the strategy pattern to find out what to do with the text line. Sure
 * overkill but fun =)
 * 
 * @author seb
 * 
 */
public interface CheckStrategy
{
	/**
	 * Checks what the line of text contains.
	 * 
	 * @param inputString
	 *            reed line
	 * @param listOfAgeGroups
	 * @return boolean
	 */
	public ArrayList<AgeGroup> check(String inputString,
			ArrayList<AgeGroup> listOfAgeGroups);

}
