package classProject;

public class Prime_no_1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Prime nos are:");
		for(int n=2 ;n<=100  ; n++)
		{
			int temp = 0 ;
			for(int i = 2  ; i<n-1 ; i++)
			{
				if( n % i == 0)
				{
					temp = temp + 1 ;
				}
			}
			if(temp == 0)
			{				
				System.out.print(n + " ");
			}
		}

	}

}
