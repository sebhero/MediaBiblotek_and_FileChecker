package upggift1;

import java.util.concurrent.TimeUnit;

/**
 * Data Object of a cd
 * 
 * @author seb
 * @version 1
 */
public class CD extends Media
{
	private String	artist;

	/**
	 * Default constructor
	 */
	public CD()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * CD constructor takes all known variables.
	 * 
	 * @param _title
	 *            title of the cd
	 * @param _artist
	 *            arist name
	 * @param _length
	 *            length of the cd
	 * @param _publisher
	 *            publisher for the cd
	 * @throws Exception
	 */
	public CD(String _title, String _artist, int _length, Publisher _publisher)
			throws Exception
	{
		super(_title, _length, _publisher);
		this.artist = _artist;
	}

	/**
	 * Prints out the publisher object.
	 */
	@Override
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
		return "CD " + super.toString() + " artist=" + artist + "]";
		// return "CD [title=" + title + ", artist=" + artist + ", length="
		// + this.getLengthAsString() + ", publisher="
		// + publisher.get_name() + "]";
	}

	/**
	 * return the name of the artist
	 * 
	 * @return artist name
	 */
	public String get_artist()
	{
		return artist;
	}

	/**
	 * Sets the arist name
	 */
	public void set_artist(String _artist)
	{
		this.artist = _artist;
	}

	@Override
	public String getLengthAsString()
	{
		final long theHours = TimeUnit.MINUTES.toHours(this.getLength());
		final long theMinutes = TimeUnit.MINUTES.toMinutes(this.getLength()
				- TimeUnit.HOURS.toMinutes(theHours));
		final long theSeconds = TimeUnit.MINUTES.toSeconds(this.getLength()
				- TimeUnit.HOURS.toMinutes(theHours) - theMinutes);

		return String
				.format("%02d:%02d:%02d", theHours, theMinutes, theSeconds);
	}

}
