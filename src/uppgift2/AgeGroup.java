package uppgift2;

public class AgeGroup
{

	@Override
	public String toString()
	{
		return "AgeGroup [age=" + age + ", men=" + men + ", women=" + women
				+ ", sumOfFolks=" + sumOfFolks + "]";
	}

	// age is the id.
	int			age;
	int			men;
	int			women;
	private int	sumOfFolks	= 0;

	/**
	 * Holds the number of people of a specefic age.
	 */
	public AgeGroup()
	{

	}

	public AgeGroup(int age, int men, int women)
	{
		super();
		this.age = age;
		this.men = men;
		this.women = women;
		this.setSumOfFolks(men, women);

	}

	/**
	 * Sums up the number of folks in this age group
	 * 
	 * @param men
	 * @param women
	 */
	public void setSumOfFolks(int men, int women)
	{
		this.sumOfFolks = men + women;
	}

	/**
	 * returns the agegroup
	 * 
	 * @return
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * Sets the agegroup
	 * 
	 * @param ageGroup
	 */
	public void setAge(int ageGroup)
	{
		this.age = ageGroup;
	}

	/**
	 * Returns the ammount of men
	 * 
	 * @return
	 */
	public int getMen()
	{
		return men;
	}

	/**
	 * Sets the ammount of men
	 */
	public void setMen(int men)
	{
		this.men = men;
	}

	/**
	 * Returns the ammount of women
	 * 
	 * @return
	 */
	public int getWomen()
	{
		return women;
	}

	/**
	 * Sets the ammount of wommen
	 */
	public void setWomen(int women)
	{
		this.women = women;
	}

	/**
	 * @return the sumOfFolks
	 */
	public int getSumOfFolks()
	{
		return sumOfFolks;
	}

}
