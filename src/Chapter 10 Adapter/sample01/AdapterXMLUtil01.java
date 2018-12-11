import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
public class AdapterXMLUtil01
{
//�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
	public static Object getBean()
	{
		try
		{
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("D:\\prj\\design-pattern-java-source-code\\Chapter 10 Adapter\\sample01\\config.xml")); 
		
			//��ȡ�����������ı��ڵ�
			NodeList nl = doc.getElementsByTagName("className");
//            Node classNode=nl.item(0).getFirstChild();
//            String cName=classNode.getNodeValue();
            org.w3c.dom.Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();
            
            //ͨ����������ʵ�����󲢽��䷵��
            Class c=Class.forName(cName);
	  	    Object obj=c.newInstance();
            return obj;
           }   
           	catch(Exception e)
           	{
           		e.printStackTrace();
           		return null;
           	}
		}
}
