package upggift1;

import java.util.concurrent.TimeUnit;

public class DVD extends Media
{

	private int	ageLimit;

	public DVD()
	{
		super();
	}

	public DVD(String title, int length, Publisher publisher, int ageLimit)
			throws Exception
	{
		super(title, length, publisher);
		this.setAgeLimit(ageLimit);
	}

	public int getAgeLimit()
	{
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) throws Exception
	{
		if (ageLimit <= 0)
		{
			throw new Exception("Age is less than zero on: " + this.getTitle());
		}
		this.ageLimit = ageLimit;

	}

	@Override
	public String toString()
	{
		return "DVD " + super.toString() + " ageLimit=" + ageLimit + "]";
		// return "DVD [ title=" + title + ", length=" +
		// this.getLengthAsString()
		// + ", publisher= " + publisher + ", ageLimit=" + ageLimit + "]";
	}

	@Override
	public void print()
	{
		System.out.println(this);
	}

	/**
	 * after 1.5 there exist a class that sovles this problem. {@link http
	 * ://stackoverflow
	 * .com/questions/625433/how-to-convert-milliseconds-to-x-mins
	 * -x-seconds-in-java} Converts a int time to a pretty formated string
	 * 
	 * @return time formated string
	 */
	@Override
	public String getLengthAsString()
	{
		final long theHours = TimeUnit.MINUTES.toHours(this.getLength());
		final long theMinutes = TimeUnit.MINUTES.toMinutes(this.getLength()
				- TimeUnit.HOURS.toMinutes(theHours));
		final long theSeconds = TimeUnit.MINUTES.toSeconds(this.getLength()
				- TimeUnit.HOURS.toMinutes(theHours) - theMinutes);

		return String.format("%02dh %02dm %02ds", theHours, theMinutes,
				theSeconds);
	}
}
