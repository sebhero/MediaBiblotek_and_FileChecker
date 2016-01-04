package uppgift2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadAFile
{

	String	filePath;

	public ReadAFile()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * A file reader that take the path to the file.
	 * 
	 * @param filePath
	 */
	public ReadAFile(String filePath)
	{
		this.filePath = filePath;

	}

	/**
	 * Loads the file and saves the data to a Arraylist.
	 * 
	 * @return arraylist with the lines of the file.
	 * @throws IOException
	 */
	public ArrayList<String> loadFile() throws IOException
	{
		if (this.filePath == null || this.filePath.isEmpty())
		{
			throw new FileNotFoundException("There is no file");
		}

		final ArrayList<String> lines = new ArrayList<>();
		try
		{
			final Scanner fileScanner = new Scanner(new File(this.filePath));
			while (fileScanner.hasNext())
			{
				lines.add(fileScanner.nextLine());
			}
			fileScanner.close();
		}
		catch (IOException | NullPointerException exception)
		{
			System.err.println(exception.getMessage());
			lines.clear();
		}
		return lines;
	}
}
