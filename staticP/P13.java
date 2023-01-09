package staticP;

public class P13 {
    public static void main(String[] args) 
	{
		System.out.println("from main");
		test();
		P13.test();
	}

	public static void test()
	{
		System.out.println("from test()");
	}
}
