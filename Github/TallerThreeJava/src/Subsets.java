import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class Subsets {
	//these are the objects to use
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	static Random rd = new Random();
				
	public static void main (String []args) throws IOException
	{
		//all variables
		int i, j, m;
		int[][] board;
		
		//Welcome message
		bw.write("Welcome\n"
				+ "This program will print the even, odd, positive and\n"
				+ "negative numbers of a matrix m * m with random numbers.\n"
				+ "\nwrite the value of \"m\"\n");
		bw.flush();
		
		//read to size
		m = Integer.parseInt(br.readLine());
		board =  new int [m][m];
		bw.write("\nMatrix\n");
		bw.flush();
		//print of the matrix
		for (i = 0; i < m; i++)
		{
			bw.write("\n");
			bw.flush();
			for(j = 0; j < m; j++)
			{
				board[i][j] = -50 + rd.nextInt(100);
				bw.write("["+board[i][j]+"]\t");
				bw.flush();
			}
		}

		bw.write("\n\npair numbers\n");
		bw.flush();
		for (i = 0; i < m; i++)
		{
			bw.write("\n");
			bw.flush();
			for(j = 0; j < m; j++)
			{
				if(board[i][j] % 2 == 0)
				{
					bw.write("[" + board[i][j] + "]\t");
					bw.flush();
				}
			}
		}
	
		bw.write("\n\nOdd numbers\n");
		bw.flush();
		for (i = 0; i < m; i++)
		{
			bw.write("\n");
			bw.flush();
			for(j = 0; j < m; j++)
			{
				if(board[i][j] % 2 != 0)
				{
					bw.write("[" + board[i][j] + "]\t");
					bw.flush();
				}
			}
		}
		
		bw.write("\n\nPositove numbers\n");
		bw.flush();
		for (i = 0; i < m; i++)
		{
			bw.write("\n");
			bw.flush();
			for(j = 0; j < m; j++)
			{
				if(board[i][j] > 0)
				{
					bw.write("[" + board[i][j] + "]\t");
					bw.flush();
				}
			}
		}
		
		bw.write("\n\nNegative numbers\n");
		bw.flush();
		for (i = 0; i < m; i++)
		{
			bw.write("\n");
			bw.flush();
			for(j = 0; j < m; j++)
			{
				if(board[i][j] < 0)
				{
					bw.write("[" + board[i][j] + "]\t");
					bw.flush();
				}
			}
		}
	}
}