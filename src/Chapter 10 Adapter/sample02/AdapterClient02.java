public class AdapterClient02
{
	public static void main(String args[])
	{
		DataOperation dao=(DataOperation)AdapterXMLUtil02.getBean();
		dao.setPassword("sunnyLiu");
		String ps=dao.getPassword();
		String es=dao.doEncrypt(6,ps);
		System.out.println("����Ϊ��" + ps);
		System.out.println("����Ϊ��" + es);
	}
}


