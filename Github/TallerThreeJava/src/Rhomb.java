import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class Rhomb {
	
	//these are the objects to use
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	static Random rd = new Random();
			
	public static void main (String []args) throws IOException
	{
		//all variables
		int m, firstValue, finalyValue,i,j;
		boolean half;
		int[][] board, boardRhomb;
		
		//Welcome message
		bw.write("Welcome\n"
				+ "This program will print the numbers of a matrix\n"
				+ "\"m * m\" only those that are inside a rhombus\n\n"
				+ "write the value of \"m\"\n");
		bw.flush();
		m = Integer.parseInt(br.readLine());
		
		board = new int [m][m];
		boardRhomb = new int [m][m];
		
		bw.write("\nfirst matrix\n");
		bw.flush();
		//fill matrix with numbers random
		for (i = 0; i < m; i++)
		{
			bw.write("\n");
			bw.flush();
			for(j = 0; j < m; j++)
			{
				board[i][j] = rd.nextInt(100);
				bw.write("["+board[i][j]+"]\t");
				bw.flush();
			}
		}
		
		firstValue = (m - 1) / 2;	//principle of the diamond
		half = true;				//if it's half the diamond
		
		//if the size of the matrix is even or odd
		if(m % 2 == 0)
		{
			finalyValue = firstValue + 1;
		}
		else
		{
			finalyValue = firstValue;
		}
		
		bw.write("\n\nMatrix Rhomb\n");
		bw.flush();
		
		//fill the matrix of the rhomb
		for (i = 0; i < m; i++)
		{
			for(j = firstValue; j <= finalyValue; j++)
			{
				boardRhomb[i][j] = board[i][j];
			}
			if (half == true)
			{
				if (m % 2 == 0)
				{
					if((firstValue - 1) >= 0 && finalyValue < m)
					{
						firstValue -= 1;
						finalyValue += 1; 
					}
					else
					{
						half = false;
						firstValue = 0;
						finalyValue = m-1;
					}
				}
				else
				{
					if((firstValue - 1) > 0 && finalyValue < m)
					{
						firstValue -= 1;
						finalyValue += 1; 
					}
					else
					{
						half = false;
						firstValue = 0;
						finalyValue = m-1;
					}
				}
			}
			else
			{
				firstValue += 1;
				finalyValue -= 1;
			}
		}
		
		//print the new matrix
		for(i = 0; i < m; i++)
		{
			bw.write("\n");
			bw.flush();
			for (j = 0; j < m; j++)
			{
				bw.write("[" + boardRhomb[i][j] + "]\t");
				bw.flush();
			}
		}
	}
}
