package test;

import upggift1.Book;
import upggift1.CD;
import upggift1.DVD;
import upggift1.Publisher;

public class MediaTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Skrivare2.skrivUt("kör medatest");
		try
		{
			// dvd test
			final DVD theRock = new DVD("the Rock", 90, new Publisher("MGM",
					"123"), 15);
			// test error
			// final DVD theRock2 = new DVD("the Rock 2", -90, new Publisher(
			// "MGM", "123"), 15);

			theRock.print();

			// define a publish for reuse and check that the publisher count
			// works.
			final Publisher oreily = new Publisher("OReily", "123");

			// book test
			final Book colorOfMagic = new Book("Color of Magic", 200, oreily,
					"Terry Pratchett");
			colorOfMagic.print();

			final Book jbossAtWork = new Book("Jboss at work", 1, oreily,
					"Tom Marrs");
			jbossAtWork.print();

			final Book vivil = new Book("hansel und gretchen", 0,
					new Publisher("Grimm", "33"), "Brueden Grimm");

			vivil.print();

			// CD test
			final CD SkeletonwitchBringersOfDeath = new CD("Bringers of Death",
					"Skeletonwitch", 67, oreily);

			SkeletonwitchBringersOfDeath.print();
		}
		catch (final Exception e)
		{
			Skrivare2.skrivUtFel("A error occured!\n more info\n"
					+ e.getMessage());
		}
	}
}
