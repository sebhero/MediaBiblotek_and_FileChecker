package upggift1;

import java.text.ChoiceFormat;
import java.text.MessageFormat;

public class Book extends Media
{
	String	author;

	public Book()
	{
	}

	public Book(String title, int length, Publisher publisher, String author)
			throws Exception
	{
		super(title, length, publisher);
		this.author = author;
	}

	@Override
	public String toString()
	{
		return "Book " + super.toString() + " author=" + author + "]";
		// return "Book [author=" + author + ", title=" + title + ", publisher="
		// + publisher + ", getLengthAsString()=" + getLengthAsString()
		// + "]";
	}

	@Override
	public String getLengthAsString()
	{
		/*
		 * Följde exemplet på. Vet inte ifall detta är overkill.. ville bara ha
		 * 3 olika svar..
		 * http://docs.oracle.com/javase/1.4.2/docs/api/java/text/MessageFormat
		 */
		final MessageFormat form = new MessageFormat("{0}");
		final double[] pageLimits =
		{ 0, 1, 2 };
		final String[] pageParts =
		{ "no pages", "one page", "{0,number} pages" };
		final ChoiceFormat pageForm = new ChoiceFormat(pageLimits, pageParts);
		form.setFormatByArgumentIndex(0, pageForm);

		return form.format(new Object[]
		{ this.getLength() });
	}

	@Override
	public void setLength(int length) throws Exception
	{
		this.length = length;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

}
