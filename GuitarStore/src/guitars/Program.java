package guitars;

public class Program 
{

	public static void main(String[] args) 
	{
		GuitarStore gs1=new GuitarStore();
		for(int i=1;i<10;i++)
		{
			gs1.addGuitar(new Guitar(GuitarTypes.CLASSIC,"a"+i,i*1000));
			gs1.addGuitar(new Guitar(GuitarTypes.ACOUSTIC,"a"+i,i*1000));
			gs1.addGuitar(new Guitar(GuitarTypes.ELECTIRC,"a"+i,i*1000));
		}
		Guitar g=gs1.sellGuitar(GuitarTypes.ACOUSTIC, "a2", 2000);
		if(g==null)
			System.out.println("There is no suitable guitar in the store for sell");

		System.out.println("Current number of guitars in the Store: "+gs1.getCurrentNumberOfGuitarsInStock());
	}

}
