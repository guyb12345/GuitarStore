package instruments;

public enum GuitarTypes 
{
 CLASSIC(1) ,ACCOUSTIC(2) ,ELECTRIC(3);
	private int value;
	GuitarTypes(int value) 
 	{
		this.value=value;
	}
	public void exit()
	{
		System.exit(value);
	}
}
