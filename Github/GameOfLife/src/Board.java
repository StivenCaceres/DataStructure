public class Board 
{
	//matrix is global for everybody
	public static int[][] matrix = null;
	
	//all variables
	static int counter,i,j;
	
	public Board(int width, int height)
	{
		//size of matrix
		matrix = new int[width][height];
		
		//fill matrix
		for(i = 0; i < height; i++)
		{ 
			for(j = 0; j < width; j++)
			{
				//50% is probability he is life 
				matrix[i][j] = Math.random() < 0.05 ? 1:0;
			}
		}
	}
}