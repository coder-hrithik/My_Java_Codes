package patterns;

public class G {
    public static void main(String[]args)
	{
		int n=5;
		for (int r=1;r<=n ;r++ )
		{
			for (int c=1;c<=n ;c++ )
			{
				if (r==1 && c>1 || c==1 && r>1 && r<n || r==n && c>1 && c< n || r==n/2+1 && c>=n/2+1 || c==n && r==n-1)
				{
					System.out.print("# ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
// (i==0&&j!=0)||(i>0&&i<n-1&&j==0)||(i==n-1&&j>0&&j<n-1)||(i==n/2&&j>=n/2)||(j==n-1&&i>=n/2&&i<n-1)