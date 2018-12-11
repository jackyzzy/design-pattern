public class BuilderClient
{
	public static void main(String args[])
	{
		//��̬ȷ���ײ�����
	    MealBuilder mb=(MealBuilder)BuilderXMLUtil.getBean();
		//����Ա��ָ����
		KFCWaiter waiter=new KFCWaiter();
	    //����Ա׼���ײ�
	    waiter.setMealBuilder(mb);
	    //�ͻ�����ײ�
	    Meal meal=waiter.construct();
        
        System.out.println("�ײ���ɣ�");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
	}
}
