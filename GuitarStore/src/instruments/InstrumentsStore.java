package instruments;


public class InstrumentsStore 
{
	private Instrument[]instruments;
	private int count;//סופר כמה כלי נגינה בחנות
	private int countTotalInstruments;//סופר כמה כלי נגינה סך הכל התווספו לחנות
	private int countDrums;//סופר כמה תופים בחנות
	private int countKeyboards;//סופר כמה קלידים בחנות
	private int countGuitars;//סופר כמה גיטרות בחנות
	public InstrumentsStore()
	{
		this.instruments=new Instrument[128];
		count=0;
		countTotalInstruments=0;
		countDrums=0;
		countGuitars=0;
		countKeyboards=0;
	}
	public int getCurrentInstrumentsInStock()
	{
		return count;
	}
	public void addInstrument(Instrument instrument)
	{
		 if(count<instruments.length)
		  {
			  if(instrument!=null)//אם העצם שנשלח שונה מ null
			  {
				  int index=-1;//האינדקס שיגיע למקום הראשון שריק במערך
				  for(int i=0;i<instruments.length;i++)
				  {
					  if(instruments[i]==null)
					  {
						  index=i;
						  i=instruments.length+1;
					  }
				  }
				  if(index!=-1)//אם יש מקום ריק במערך
				  {
					  instruments[index]=instrument;
					  count++;
					  countTotalInstruments++;
					  if(instrument instanceof Drum)
						  countDrums++;
					  else if(instrument instanceof Keyboard)
						  countKeyboards++;
					  else if(instrument instanceof Guitar)
						  countGuitars++;
				  }
				  else
				  {
					  System.out.println("No more space for Instruments in this store.");
				  }
			  }
			  else
			  {
				  System.out.println("Theres no instance of \"Instrument\" to add.");
			  }
		  }
		  else
		  {
			  System.out.println("No more space for Instruments in this store.");
		  }
	}
	  public void printGuitarsWithSameType(GuitarTypes type)
	  {
		  //1-Classic guitar.
		  //2-Acoustic guitar.
		  //3-Electric guitar.
		  String s="The guitars which their type is ";
		  if(type==GuitarTypes.CLASSIC)
				s+="classics";
			else if(type==GuitarTypes.ACCOUSTIC)
				s+="acoustics";
			else
				s+="electics";
		  s+=" are:";
		  System.out.println(s);
		  for(int i=0;i<instruments.length;i++)
		  {
			  if(instruments[i]!=null)
			  {
				  if(instruments[i] instanceof Guitar&&((Guitar)(instruments[i])).getType()==type)
					  System.out.println(instruments[i]);
			  }
		  }
	  }
	  public Guitar sellGuitar(String productionCompany,double guitarPrice,GuitarTypes type)
	  {
		  //Prints the suitable guitar for selling and returns it.
		  int indexGuitar=-1;//המיקום של הגיטרה במערך למכירה
		  for(int i=0; i<instruments.length;i++)
		  {
			  if(instruments[i]!=null&& (instruments[i] instanceof Guitar)&&((Guitar)instruments[i]).getType()==type&&instruments[i].getCompanyName().equals(productionCompany)&&instruments[i].getPrice()==guitarPrice)
			  {
				  indexGuitar=i;
				  i=instruments.length+1;
			  }
		  }
		  if((indexGuitar!=-1)&&(countGuitars>=5))
		  {
			  System.out.println("The guitar for sell:\n"+instruments[indexGuitar]);
			  count--;
			  countGuitars--;
			  Guitar g=(Guitar)instruments[indexGuitar];
			  instruments[indexGuitar]=null;//הוצאת הגיטרה מהמערך
			  return g;//החזרת הגיטרה למכירה
		  }
		  else
		  {
			  //System.out.println("There is no suitable guitar in the store for sell");
			  return null;
		  }
	  }
	  public Keyboard sellKeyboard(String productionCompany,double keyboardPrice,int numOfOctaves)
	  {
		  //Prints the suitable Keyboard for selling and returns it.
		  int indexKeyboard=-1;//המיקום של הקלידים במערך למכירה
		  for(int i=0; i<instruments.length;i++)
		  {
			  if(instruments[i]!=null&& (instruments[i] instanceof Keyboard)&&((Keyboard)instruments[i]).getNumberOfOctaves()==numOfOctaves&&instruments[i].getCompanyName().equals(productionCompany)&&instruments[i].getPrice()==keyboardPrice)
			  {
				  indexKeyboard=i;
				  i=instruments.length+1;
			  }
		  }
		  if((indexKeyboard!=-1)&&(countKeyboards>=5))
		  {
			  System.out.println("The keyboard for sell:\n"+instruments[indexKeyboard]);
			  count--;
			  countKeyboards--;
			  Keyboard k=(Keyboard)instruments[indexKeyboard];
			  instruments[indexKeyboard]=null;//הוצאת הקלידים מהמערך
			  return k;//החזרת הקלידים למכירה
		  }
		  else
		  {
			  //System.out.println("There is no suitable guitar in the store for sell");
			  return null;
		  }
	  }
	  public Drum sellDrum(String productionCompany,double drumPrice,int numOfPercussion)
	  {
		  //Prints the suitable Keyboard for selling and returns it.
		  int indexDrum=-1;//המיקום של הקלידים במערך למכירה
		  for(int i=0; i<instruments.length;i++)
		  {
			  if(instruments[i]!=null&& (instruments[i] instanceof Drum)&&((Drum)instruments[i]).getPercussionAmount()==numOfPercussion&&instruments[i].getCompanyName().equals(productionCompany)&&instruments[i].getPrice()==drumPrice)
			  {
				  indexDrum=i;
				  i=instruments.length+1;
			  }
		  }
		  if((indexDrum!=-1)&&(countDrums>=5))
		  {
			  System.out.println("The Drum for sell:\n"+instruments[indexDrum]);
			  count--;
			  countDrums--;
			  Drum d=(Drum)instruments[indexDrum];
			  instruments[indexDrum]=null;//הוצאת הקלידים מהמערך
			  return d;//החזרת הקלידים למכירה
		  }
		  else
		  {
			  //System.out.println("There is no suitable guitar in the store for sell");
			  return null;
		  }
	  }
}
