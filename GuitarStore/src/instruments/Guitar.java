package instruments;
import java.util.*;
public class Guitar extends Instrument
{
  private GuitarTypes type;//: סוג גיטרה
  //1-classic, 2-acoustic, 3- electric
  public Guitar()
  {
	  super();
	  type=GuitarTypes.CLASSIC;
  }
  public Guitar(String companyName, double price, GuitarTypes type)
  {
	  super(companyName,price);
	  this.type=type;
  }
public GuitarTypes getType() 
{
	return type;
}
public void setType(GuitarTypes type) 
{
	this.type = type;
}
@Override
public String toString()
{
	String s="";
	s+="Guitar number "+this.getSerialNumber()+":\n"+"type: ";
	if(type==GuitarTypes.CLASSIC)
		s+="Classic";
	else if(type==GuitarTypes.ACCOUSTIC)
		s+="Acoustic";
	else
		s+="Electic";
	s+="\n Production company: "+this.getCompanyName()+"\n price: "+this.getPrice();
	return s;
}
}
