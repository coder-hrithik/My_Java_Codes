package patterns;

public class A {
    public static void main(String[] args) 
	{
		int n=5;
		for(int i=0; i<n ; i++)//out for loop(ROW)
		{
			for (int j=0; j<n ; j++)//inner for loop(COLUMN)
			{
				if (i==n/2 ||(j==0 && i>n/2) || (j==n-1 && i>n/2) || (i==0 && j==n/2)) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
			}
			System.out.println();//belongs to outer for loop
		}
	}
}
