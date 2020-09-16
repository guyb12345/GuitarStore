package instruments;

public class Program {

	public static void main(String[] args) 
	{
//      GuitarTypes type = GuitarTypes.CLASSIC;
//      System.out.println(type==GuitarTypes.ACCOUSTIC);
		InstrumentsStore s1=new InstrumentsStore();
		for (int i = 1; i <= 20; i++) 
		{
			if(i==10)
			{
				System.out.println("aaa");
			}
			s1.addInstrument(new Guitar());
			s1.addInstrument(new Drum());
			s1.addInstrument(new Keyboard("a"+i,i*30,i+3));
		}
		Keyboard k = s1.sellKeyboard("a10", 300, 13);
		Guitar g = s1.sellGuitar("Yamaha", 1000, GuitarTypes.CLASSIC);
		Drum d = s1.sellDrum("Yamaha", 1000, 4);
		System.out.println("Instruments in stock: "+s1.getCurrentInstrumentsInStock());
		if(k==null)
			System.out.println("There is no suitable Keyboard for selling");
		if(g==null)
			System.out.println("There is no suitable Guitar for selling");
		if(d==null)
			System.out.println("There is no suitable Drum for selling");
		
	}

}
