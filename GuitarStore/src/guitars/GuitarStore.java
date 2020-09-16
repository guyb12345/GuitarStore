package guitars;

public class GuitarStore 
{
  private Guitar[]guitars;//����� ������� �����
  private int count;//���� ��� ������ �����
  private int countTotalGuitars;//���� ��� ������ �� ��� ������� �����
  public GuitarStore()
  {
	  guitars=new Guitar[100];
	  count=0;
	  countTotalGuitars=0;
  }
  public void addGuitar(Guitar g)
  {
	  if(count<guitars.length)
	  {
		  if(g!=null)//�� ���� ����� ���� � null
		  {
			  int index=-1;//������� ����� ����� ������ ���� �����
			  for(int i=0;i<guitars.length;i++)
			  {
				  if(guitars[i]==null)
				  {
					  index=i;
					  i=guitars.length+1;
				  }
			  }
			  if(index!=-1)//�� �� ���� ��� �����
			  {
				  guitars[index]=g;
				  count++;
				  countTotalGuitars++;
			  }
			  else
			  {
				  System.out.println("No more space for guitars in this store.");
			  }
		  }
		  else
		  {
			  System.out.println("Theres no instance of \"Guitar\" to add.");
		  }
	  }
	  else
	  {
		  System.out.println("No more space for guitars in this store.");
	  }
  }
  public void printGuitarsWithSameType(GuitarTypes type)
  {
	  String s="The guitars which their type is ";
	  if(type==GuitarTypes.CLASSIC)
			s+="classics";
		else if(type==GuitarTypes.ACOUSTIC)
			s+="acoustics";
		else
			s+="electics";
	  s+=" are:";
	  System.out.println(s);
	  for(int i=0;i<guitars.length;i++)
	  {
		  if(guitars[i]!=null&&guitars[i].getType()==type)
			  System.out.println(guitars[i]);
	  }
  }
  public int getCurrentNumberOfGuitarsInStock()
  {
	  return count;
  }
  public Guitar sellGuitar(GuitarTypes type,String productionCompany,double guitarPrice)
  {
	  //Prints the suitable guitar for selling and returns it.
	  int indexGuitar=-1;//������ �� ������ ����� ������
	  for(int i=0; i<guitars.length;i++)
	  {
		  if(guitars[i]!=null&&guitars[i].getType()==type&&guitars[i].getCompanyName().equals(productionCompany)&&guitars[i].getPrice()==guitarPrice)
		  {
			  indexGuitar=i;
			  i=guitars.length+1;
		  }
	  }
	  if((indexGuitar!=-1)&&(count>=5))
	  {
		  System.out.println("The guitar for sell:\n"+guitars[indexGuitar]);
		  count--;
		  Guitar g=guitars[indexGuitar];
		  guitars[indexGuitar]=null;//����� ������ ������
		  return g;//����� ������ ������
	  }
	  else
	  {
		  //System.out.println("There is no suitable guitar in the store for sell");
		  return null;
	  }
  }
}
