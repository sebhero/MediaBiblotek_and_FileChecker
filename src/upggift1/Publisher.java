package upggift1;

import java.text.MessageFormat;

/**
 * Data object of the publisher
 * 
 * @author seb
 * @version 1
 */
public class Publisher
{
	private static int	_count	= 0;
	private String		_name;
	private String		_phone;

	/**
	 * Default constructor.
	 */
	public Publisher()
	{
		_count++;
	}

	/**
	 * Needs given name and phone
	 * 
	 * @param name
	 *            Name of the publisher.
	 * @param phone
	 *            Phone number of the publisher
	 */
	public Publisher(String name, String phone)
	{
		this();// snyggare �n kalla efter _count++
		this._name = name;
		this._phone = phone;
	}

	/**
	 * Overide of toString
	 * 
	 * @return nicely formated string of the publisher object.
	 */
	@Override
	public String toString()
	{
		return MessageFormat.format(
				"Namn: {0}, Telefonnummer: {1}, Antal förlag: {2}", _name,
				_phone, _count);
	}

	/**
	 * Prints out the publisher object.
	 */
	public void print()
	{
		// Skrivare2.skrivUt(this.toString());
		System.out.println(this);
	}

	/**
	 * Returns the name of the publisher
	 * 
	 * @return publisher name
	 */
	public String get_name()
	{
		return _name;
	}

	/**
	 * sets the name of the publisher
	 * 
	 * @param _name
	 *            name of publisher
	 */
	public void set_name(String _name)
	{
		this._name = _name;
	}

	/**
	 * Returns the phonenumber of the publisher
	 * 
	 * @return phonenumber of the publisher
	 */
	public String get_phone()
	{
		return _phone;
	}

	/**
	 * sets the phonenumber of the publisher
	 * 
	 * @param _phone
	 *            phonenumber of publisher
	 */
	public void set_phone(String _phone)
	{
		this._phone = _phone;
	}

	/**
	 * Returns the ammount of existing publishers
	 * 
	 * @return the ammount of existing publishers
	 */
	public static int getCount()
	{
		return _count;
	}
}
