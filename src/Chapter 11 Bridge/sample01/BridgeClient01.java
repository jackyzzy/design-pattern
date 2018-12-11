public class BridgeClient01
{
	public static void main(String a[])
	{
		Color color;
		Pen pen;
		
		color=(Color)BridgeXMLUtilPen01.getBean("color");
		pen=(Pen)BridgeXMLUtilPen01.getBean("pen");
		
		pen.setColor(color);
		pen.draw("�ʻ�");
	}
}