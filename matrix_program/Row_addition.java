package matrix_program;
import java.util.*;

/*Selection of MPCS exams include a fitness test which is conducted on ground.
   There will be a batch of 3 trainees, appearing for running test in track for 3 rounds.
   
You need to record their oxygen level after every round. After trainee are finished with 
all rounds, calculate for each trainee his average oxygen level over the 3 rounds and 
select one with highest oxygen level as the most fit trainee. If more than one trainee
 attains the same highest average level, they all need to be selected.

Display the most fit trainee (or trainees) and the highest average oxygen level.


Note:

The oxygen value entered should not be accepted if it is not in the range between 1 and 100.
If the calculated maximum average oxygen value of trainees is below 70 then declare the trainees
 as unfit with meaningful message as “All trainees are unfit”
Average Oxygen Values should be rounded.*/

public class Row_addition {
	
	public static void main(String[] args) {
		
		int m , n ;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows in the matrix");
		m =sc.nextInt() ;
		
		System.out.println("Enter the no of cols in the matrix");
		n =sc.nextInt() ;
		
		int matrix[][] = new int[m][n] ;
		int[] sum_rows = new int[3];
		int []avg = new int[3];
		
		System.out.println("Enter the values in the matrix");
		for(int i=0 ; i<m ; i++)
		{
			for(int j=0 ; j<n ; j++)
			{
				matrix[i][j] = sc.nextInt() ;
				if(matrix[i][j] <1 || matrix[i][j]>100)
				{
					matrix[i][j] = 0 ;
				}
			}
		}
		
		System.out.println("The matrix is :");
		for(int i=0 ; i<m ; i++)
		{
			for(int j=0 ; j<n ; j++)
			{
				System.out.print(  "["+i+"]" + "["+j+"]" + "="  + matrix[i][j] + "  ");	
			}
			System.out.println();
		}
		
		for(int i=0 ; i<m ; i++)
		{
		
			for(int j=0 ; j<n ;j++)
			{
				sum_rows[i] = sum_rows[i] + matrix[i][j] ;
				avg[i] =sum_rows[i] /3 ;
			}
			
			System.out.println("sum of " + (i+1) + " row:" +sum_rows[i]);
			System.out.println("Average of " + (i+1) + " row:" +avg[i]);
		}
		int max= 0;
		for(int i= 0 ; i<avg.length ; i++)
		{
			if(avg[i] > max)
			{
				max = avg[i];
			}
		}
		for(int i= 0 ; i<avg.length ; i++)
		{
			
			if(avg[i] == max) 
			{
				System.out.println("Trainee Number :" + (i+1));
			}
			if(avg[i] <= 70)
			{
				System.out.println("Trainee is unfit");
			}
		}
		
		
	}

}
