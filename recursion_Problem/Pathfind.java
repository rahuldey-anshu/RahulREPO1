package recursion_Problem;

public class Pathfind {

	public static void main(String[] args) {

		System.out.println(path(4 , 4));
	}
	
	static int path(int row , int col)
	{
		if(row == 1 || col == 1)
		{
			return 1;
		}
		
		return path(row , col-1 ) + path(col , row-1) ;
	}

}
