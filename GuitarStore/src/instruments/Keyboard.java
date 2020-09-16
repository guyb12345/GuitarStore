package instruments;
import java.util.*;
public class Keyboard extends Instrument
{
	private int numberOfOctaves;//מספר העוקטבות בקלידים
	public Keyboard()
	{
		super();
		numberOfOctaves=3;
	}
	public Keyboard(String companyName, double price)
	{
		super(companyName,price);
		numberOfOctaves=3;
	}
	public Keyboard(String companyName, double price,int numberOfOctaves)
	{
		super(companyName,price);
		numberOfOctaves=Math.abs(numberOfOctaves);
		this.numberOfOctaves=numberOfOctaves;
	}
	public int getNumberOfOctaves() 
	{
		return numberOfOctaves;
	}
	public void setNumberOfOctaves(int numberOfOctaves) 
	{
		numberOfOctaves=Math.abs(numberOfOctaves);
		this.numberOfOctaves = numberOfOctaves;
	}
	@Override
    public String toString()
    {
    	String s=super.toString();
    	s=s.replace("Instrument", "Keyboard");
    	s+="\n Number of octaves= "+numberOfOctaves;
    	return s;
    }
}
