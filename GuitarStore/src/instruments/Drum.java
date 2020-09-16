package instruments;
import java.util.*;
public class Drum extends Instrument
{
	private int percussionAmount;//כמות כלי הקשה
	public Drum()
	{
		super();
		this.percussionAmount=4;
	}
	public Drum(String companyName, double price)
	{
		super(companyName,price);
		this.percussionAmount=4;
	}
	public Drum(String companyName, double price, int percussionAmount)
	{
		super(companyName,price);
		percussionAmount=Math.abs(percussionAmount);
		this.percussionAmount=percussionAmount;
	}
	public int getPercussionAmount() 
	{
		return percussionAmount;
	}
	public void setPercussionAmount(int percussionAmount) 
	{
		percussionAmount=Math.abs(percussionAmount);
		this.percussionAmount = percussionAmount;
	}
    @Override
    public String toString()
    {
    	String s=super.toString();
    	s=s.replace("Instrument", "Drum");
    	s+="\n Percussion amount= "+percussionAmount;
    	return s;
    }
}
