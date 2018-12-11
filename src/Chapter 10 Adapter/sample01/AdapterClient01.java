public class AdapterClient01
{
//	static Robot robot = null;
	public static void main(String args[])
	{
		Robot robot=(Robot)AdapterXMLUtil01.getBean();
//		robot=(Robot)AdapterXMLUtil01.getBean();
		robot.cry();
		robot.move();
	}
}