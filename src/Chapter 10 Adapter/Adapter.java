
public class Target{
	
}
public class Adaptee{
		public void specificRequest() {
		// TODO Auto-generated method stub		
	}
}

public class Adapter extends Target
{
	private Adaptee adaptee;
	
	public Adapter(Adaptee adaptee)
	{
		this.adaptee=adaptee;
	}
	
	public void request()
	{
		adaptee.specificRequest();
	}
}