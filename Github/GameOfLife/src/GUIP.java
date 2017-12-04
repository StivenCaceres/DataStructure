import processing.core.PApplet;

public class GUIP extends PApplet  
{	
	//variables of matrix
	static int i,j,counter;
	
	//variables of board
	int square_size = 7;
	int width = 100;
	int height = 100;
	
	Board B = new Board(width,height);
	
	public static void main (String[] args) 
	{
		PApplet.main("GUIP");
	}
	
	public void settings()
	{
		size(width*square_size, height*square_size);
	}
	
	public void draw()
	{
		background(0);
		/**
		 * in this cycles is the logic
		 */
		for(i = 0; i < height; i++)
		{
			for(j = 0; j < width; j++)
			{
				//paint the matrix
				if( B.matrix[i][j] == 1)
				{
					fill(0,250,0);	//alive
				}
				else
				{
					fill(0);		//dead
				}
				
				//search of neighbors 
				if(i == 0)
				{
					if (j == 0)
					{
						//Right upper corner
						counter = B.matrix[i][j+1] + B.matrix[i+1][j]
								+ B.matrix[i+1][j+1];
					}
					else
					{
						if (j == width - 1)
						{
							//left upper corner
							counter = B.matrix[i][j-1] + B.matrix[i+1][j-1]
									+ B.matrix [i+1][j];
						}
						else
						{
							//upper 
							counter = B.matrix[i][j-1] + B.matrix [i][j+1]
									+ B.matrix[i+1][j-1] + B.matrix [i+1][j]
									+ B.matrix[i+1][j+1];
						}
					}
				}
				
				else
				{
					if (i == height - 1)
					{
						if (j == 0)
						{
							//Lower right corner
							counter = B.matrix[i-1][j] + B.matrix[i-1][j+1]
									+ B.matrix[i][j+1];
						}
						else
						{
							if (j == width -1)
							{
								//lower left corner
								counter = B.matrix[i-1][j] + B.matrix[i-1][j]
										+ B.matrix [i][j-1];	
							}
							else
							{
								//lower
								counter = B.matrix[i-1][j-1] + B.matrix [i-1][j]
										+ B.matrix[i-1][j+1] + B.matrix [i][j-1]
										+ B.matrix[i][j+1];
							}
						}
					}
					else
					{
						if (j == 0)
						{
							//left side
							counter = B.matrix[i-1][j] + B.matrix [i-1][j+1]
									+ B.matrix[i][j+1] + B.matrix [i+1][j]
									+ B.matrix[i+1][j+1];
						}
						else
						{
							if (j == width-1)
							{
								//Right side
								counter = B.matrix[i-1][j-1] + B.matrix [i-1][j]
										+ B.matrix[i][j-1] + B.matrix [i+1][j-1]
										+ B.matrix[i+1][j];
							}
							else
							{
								//All
								counter = B.matrix[i-1][j-1] + B.matrix [i-1][j]		// A
										+ B.matrix[i-1][j+1] + B.matrix [i][j-1]		// L
										+ B.matrix[i][j+1] + B.matrix [i+1][j-1]		// L
										+ B.matrix[i+1][j] + B.matrix [i+1][j+1];
							}
						}
					}
				}
				/*
				counter = B.matrix[(i-1+height)%height][(j-1+width)%width]+B.matrix[(i-1+height)%height][j]+
						  B.matrix[(i-1+height)%height][(j+1+width)%width]+B.matrix [i][(j-1+width)%width]+
						  B.matrix[i][(j+1+width)%width]+B.matrix[(i+1+height)%height][(j-1+width)%width]+
						  B.matrix[(i+1+height)%height][j]+B.matrix[(i+1+height)%height][(j+1+width)%width];
				*/
				//kill or to revive
				if (B.matrix[i][j] == 1 ) 
				{
					if (counter < 2 || counter > 3)
					{
						B.matrix[i][j] = 0; //kill
					}
				}
				else
				{
					if ( counter ==3)
					{
						B.matrix[i][j] = 1;	//to revive
					}
				}
			
				rect(j*square_size, i*square_size,square_size,square_size);
			}
		}
		try
		{
			Thread.sleep(10);
		}
		catch (InterruptedException e){e.printStackTrace();}
	
	}
}
