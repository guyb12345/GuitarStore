package instruments;
import java.util.*;
public class Instrument 
{
	private int serialNumber;//���� ������ �� ��� ������
	private static int counter=1000;//���� ����� ������
	private String companyName;//�� ���� �����
	private double price;// ���� ��� ������ ������
	
	public Instrument()
	{
		this.price=1000;
		this.companyName="Yamaha";
		this.serialNumber=counter++;
	}
	public Instrument(String companyName, double price)
	{
		price=Math.abs(price);
		this.price=price;
		this.companyName=companyName;
		this.serialNumber=counter++;
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
		price=Math.abs(price);
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
		s="Instrument details:\n Company name= "+companyName+"\n Serial number: "+serialNumber+"\n price= "+price;
		return s;
	}
}
