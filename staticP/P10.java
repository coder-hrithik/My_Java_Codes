package staticP;
public class P10 {
    
	static int j=test2();//20

	static
	{
		System.out.println("from static block-1");
	}

	static int i = test();//10

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		System.out.println(i);
		System.out.println(j);
	}

	public static int test()
	{
		System.out.println("from test");
		return 10;
	}

	public static int test2()
	{
		System.out.println("from test2");
		return 20;
	}

	static
	{
		System.out.println("from static block-2");
	}


}
