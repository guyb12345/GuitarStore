package guitars;
import java.util.*;
public class Guitar 
{
  private GuitarTypes type;//: סוג גיטרה
  //1-classic, 2-acoustic, 3- electric
  private String companyName;//שם חברת ייצור
  private double price;//מחיר בשקלים
  private int serialNumber;//מספר סידורי של הגיטרה
  private static int counter=1000;//מונה למספר סידורי
  public Guitar()
  {
	  type=GuitarTypes.CLASSIC;
	  companyName="Yamaha";
	  price=1000;
	  serialNumber=counter++;
  }
  public Guitar(GuitarTypes type, String companyName, double price)
  {
	  this.type=type;
	  this.companyName=companyName;
	  this.price=price;
	  serialNumber=counter++;
  }
public GuitarTypes getType() 
{
	return type;
}
public void setType(GuitarTypes type) 
{
	this.type = type;
}
public String getCompanyName() 
{
	return companyName;
}
public void setCompanyName(String companyName) 
{
	this.companyName = companyName;
}
public double getPrice() 
{
	return price;
}
public void setPrice(double price) 
{
	this.price = price;
}
public int getSerialNumber() 
{
	return serialNumber;
}
@Override
public String toString()
{
	String s="";
	s+="Guitar number "+serialNumber+":\n"+"type: ";
	if(type==GuitarTypes.CLASSIC)
		s+="Classic";
	else if(type==GuitarTypes.ACOUSTIC)
		s+="Acoustic";
	else
		s+="Electic";
	s+="\n Production company: "+companyName+"\n price: "+price;
	return s;
}
}
