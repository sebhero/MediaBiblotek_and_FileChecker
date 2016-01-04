package uppgift2;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.MessageFormat;
import java.util.ArrayList;

import test.Skrivare2;

public class SaveToFile
{

	private String	fileName;

	public SaveToFile()
	{
	}

	/**
	 * Saves data to a file, Take the filename/path
	 * 
	 * @param fileName
	 */

	public SaveToFile(String fileName)
	{
		this.fileName = fileName;
	}

	/**
	 * Save data to file
	 * 
	 * @param ageGroupData
	 */
	public void save(ArrayList<AgeGroup> ageGroupData)
	{
		try
		{
			final PrintWriter out = new PrintWriter(this.fileName);

			long total = 0;

			addHeader(out);
			total = addAgeGroups(ageGroupData, out, total);
			addFooter(out, total);

			out.close();

		}
		catch (final FileNotFoundException e)
		{
			e.printStackTrace();
			Skrivare2.skrivUtFel(e.getMessage());
		}
	}

	/**
	 * Adds Agegroup to file
	 * 
	 * @param ageGroupData
	 *            list of agegroups
	 * @param out
	 *            filesaver
	 * @param total
	 *            total ammount of folks.
	 * @return the total value of folks.
	 */
	private long addAgeGroups(ArrayList<AgeGroup> ageGroupData,
			final PrintWriter out, long total)
	{
		for (final AgeGroup group : ageGroupData)
		{
			out.println(MessageFormat.format("\t{0}\t{1}", group.getAge(),
					group.getSumOfFolks()));
			total += group.getSumOfFolks();
		}
		return total;
	}

	/**
	 * Adds Footer to the text file. Static text
	 * 
	 * @param out
	 * @param total
	 */
	private void addFooter(final PrintWriter out, long total)
	{
		for (int i = 0; i < 24; i++)
		{
			out.print("-");

		}
		out.println();
		out.println(MessageFormat.format("Total: {0}", total));
	}

	/**
	 * Adds header to the file
	 * 
	 * @param out
	 */
	private void addHeader(final PrintWriter out)
	{
		out.println("\tage\tammount");
		for (int i = 0; i < 24; i++)
		{
			out.print("-");

		}
		out.println();
	}

}
