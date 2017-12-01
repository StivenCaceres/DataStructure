import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class RhombOpp {
	
	//object to use
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	static Random rd = new Random();
	
	public static void main (String []args) throws IOException
	{	
		//all variables
		int i,m,j,k,firstValue,finalyValue;
		boolean half;
		String numbers;
		String[] array;
		int[][] board,boardOpp;
		
		//Welcome message
		bw.write("Welcome\n"
				+ "This program will print the numbers of a matrix\n"
				+ "\"m * m\" only those that are outside a rhombus\n\n"
				+ "write the value of \"m\"\n");
		bw.flush();
		
		//read to size
		m = Integer.parseInt(br.readLine());
		
		//read the array 
		bw.write("\nEnter "+ m*m +" numbers separated by commas\n");
		bw.flush();
		
		numbers = br.readLine();	//read with commas
		array = numbers.split(",");	//separate by commas
		board = new int [m][m];		//matrix
		boardOpp = new int [m][m];	//matrix opposite
		k = 0;						//counter
		
		//print first matrix
		for (i = 0; i < m; i++)
		{
			bw.write("\n");
			bw.flush();
			for (j = 0; j < m; j++)
			{
				board[i][j] = Integer.parseInt(array[k]);
				k++;
				bw.write("[" + board[i][j] + "]\t");
				bw.flush();
			}
		}
		
		firstValue = (m - 1) / 2;	//principle of the rhombus
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
		
		for (i = 0; i < m;i++)
		{
			for (j = 0; j < firstValue; j++)
			{
				boardOpp[i][j] = board[i][j]; 
			}
			for (k = finalyValue+1; k < m; k++)
			{
				boardOpp[i][k] = board[i][k]; 
			}
			if(half == true)
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
		for(i = 0; i < m; i++)
		{
			bw.write("\n");
			bw.flush();
			for (j = 0; j < m; j++)
			{
				bw.write("[" + boardOpp[i][j] + "]\t");
				bw.flush();
			}
		}
	}
}
