package test;

import java.io.IOException;
import java.util.ArrayList;

import uppgift2.AgeGroup;
import uppgift2.ReadAFile;
import uppgift2.SaveToFile;
import uppgift2.pattern.strategy.CheckStrategy;
import uppgift2.pattern.strategy.DoneWithAgeGroup;
import uppgift2.pattern.strategy.StartWithMen;
import uppgift2.pattern.strategy.StartWithNumber;
import uppgift2.pattern.strategy.StartWithWoman;

public class TestStrategy
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final ArrayList<CheckStrategy> strategiesGroup = createStrategyGroup();
		final DoneWithAgeGroup doneWithAgeGroup = new DoneWithAgeGroup();
		Skrivare2.skrivUt("Load file");
		final ArrayList<String> testList = getStringDataFromFile();
		Skrivare2.skrivUt("Create AgeGroup Data");
		final ArrayList<AgeGroup> listOfAgeGroups = createAgeGroupData(
				strategiesGroup, doneWithAgeGroup, testList);
		Skrivare2.skrivUt("Done Checking. Saveing to file");
		saveToFile(listOfAgeGroups);

	}

	private static void saveToFile(ArrayList<AgeGroup> listOfAgeGroups)
	{
		final SaveToFile save = new SaveToFile("filename.txt");
		save.save(listOfAgeGroups);
	}

	private static ArrayList<AgeGroup> createAgeGroupData(
			final ArrayList<CheckStrategy> strategiesGroup,
			final DoneWithAgeGroup doneWithAgeGroup, ArrayList<String> testList)
	{
		ArrayList<AgeGroup> listOfAgeGroups = new ArrayList<AgeGroup>();
		listOfAgeGroups.add(new AgeGroup());

		// for (final String text : testList)
		String text = "";
		for (int i = 0; i < testList.size(); i++)
		{
			text = testList.get(i);

			for (final CheckStrategy strategy : strategiesGroup)
			{
				listOfAgeGroups = strategy.check(text, listOfAgeGroups);
			}
			// för att doneWithAgeGroup skapar en ny Agegroup i slutet..
			if (i != testList.size() - 1)
			{
				listOfAgeGroups = doneWithAgeGroup.check(text, listOfAgeGroups);
			}

		}
		return listOfAgeGroups;
	}

	private static ArrayList<String> getStringDataFromFile()
	{
		final ReadAFile fileReader = new ReadAFile(
				"src/uppgift2/befolkning2010.txt");
		ArrayList<String> testList = new ArrayList<>();
		try
		{
			testList = fileReader.loadFile();
		}
		catch (final IOException e)
		{
			e.printStackTrace();
		}
		return testList;
	}

	private static ArrayList<CheckStrategy> createStrategyGroup()
	{
		final ArrayList<CheckStrategy> strategiesGroup = new ArrayList<>();
		strategiesGroup.add(new StartWithNumber());
		strategiesGroup.add(new StartWithMen());
		strategiesGroup.add(new StartWithWoman());
		return strategiesGroup;
	}
}
