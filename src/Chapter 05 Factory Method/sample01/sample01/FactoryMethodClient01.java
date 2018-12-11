package sample01;

public class FactoryMethodClient01
{
	public static void main(String args[])
	{
         try
         {
         	TV tv;
         	TVFactory factory;
         	factory=(TVFactory)FactoryMethodXMLUtil01.getBean();
         	tv=factory.produceTV();
         	tv.play();
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
	}
}
