package upggift1;

import java.text.MessageFormat;

public abstract class Media
{
	protected String	title;
	protected int		length;
	protected Publisher	publisher;

	public Media()
	{

	}

	public Media(String title, int length, Publisher publisher)
			throws Exception
	{
		super();
		this.title = title;
		this.setLength(length);
		this.publisher = publisher;
	}

	/**
	 * return the title of cd
	 * 
	 * @return title
	 */
	public String getTitle()
	{
		return title;
	}

	/**
	 * Sets the title of the cd
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**
	 * returns the length of the cd
	 * 
	 * @return the length of the cd
	 */
	public int getLength()
	{
		return length;
	}

	/**
	 * Sets the cd length
	 */
	public void setLength(int length) throws Exception
	{
		if (length <= 0)
		{
			throw new Exception("Length is less than zero on: "
					+ this.getTitle());
		}

		this.length = length;
	}

	/**
	 * returns the publisher of the cd
	 * 
	 * @return the publisher of the cd
	 */
	public Publisher getPublisher()
	{
		return publisher;
	}

	/**
	 * Sets the publisher
	 */
	public void set_publisher(Publisher _publisher)
	{
		this.publisher = _publisher;
	}

	/**
	 * Sets the publisher
	 * 
	 * @param name
	 *            Name of the publisher
	 * @param phone
	 *            Phonenumber for the publisher
	 */
	public void set_publisher(String name, String phone)
	{
		this.publisher = new Publisher(name, phone);
	}

	/**
	 * Prints out the publisher object.
	 */
	public void print()
	{
		System.out.println(this);
	}

	/**
	 * @return string of the CD object.
	 */
	@Override
	public String toString()
	{
		return MessageFormat.format("[title: {0}, length: {1}, publisher: {2}",
				this.getTitle(), this.getLengthAsString(), this.getPublisher());
	}

	public abstract String getLengthAsString();

}
