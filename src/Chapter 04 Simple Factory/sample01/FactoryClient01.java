import sample01.TV;

public class FactoryClient01
{
	public static void main(String args[])
	{
         try
         {
         	TV tv;
//         	String brandName=XMLUtilTV.getBrandName();
         	String brandName=FactoryXMLUtilTV01.getBrandName();
         	tv=TVFactory.produceTV(brandName);
         	tv.play();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
