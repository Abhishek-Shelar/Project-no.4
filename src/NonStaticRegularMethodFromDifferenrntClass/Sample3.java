package NonStaticRegularMethodFromDifferenrntClass;
//Static regular method from same class

public class Sample3 {
	public static void main(String[] args)   //pre-define method.  
	{
		System.out.println("Hi");
		m1();
		m2();
		m1();
		System.out.println("Hello");
		
	}

	//static regular method
	public static void m1()

	{
		System.out.println("running Static Regular mehod m1 from same class");
	
	}
	public static void m2()
	{
		System.out.println("running static regular method m2 from same calss");
		
	}
}
