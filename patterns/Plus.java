package patterns;

public class Plus {
    
    public static void main(String[] args) 
	{
		int n = 5;
		for(int i=0; i<n ; i++)//out for loop(ROW)
		{
			for(int j=0; j<n ;j++)
            {
                if(i==2 || j==2)
                System.out.print(" *");
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
	    }
    }
}
