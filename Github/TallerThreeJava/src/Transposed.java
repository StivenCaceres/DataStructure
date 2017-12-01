import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Transposed {
	
	//these are the objects to use
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	
	public static void main(String[]args) throws IOException
	{
		//all variables
		int m,i,j,k;
		String numbers;
		String[] array;
		int [][] board,transposed;
		
		//Welcome message
		bw.write( "Welcome\n"
				+ "this program print the matrix transpose m * m\n"
				+ "\nwrite the value of \"m\"\n");
		bw.flush();
		
		//read to size
		m = Integer.parseInt(br.readLine());
		
		//read the array 
		bw.write("\nEnter "+ m*m +" numbers separated by commas\n");
		bw.flush();
		
		numbers = br.readLine();
		array = numbers.split(",");
		board = new int [m][m];
		transposed = new int [m][m];
		
		k = 0;	//counter
		
		bw.write("\nfirst matrix\n");
		bw.flush();
		//first matrix
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
				
				//new matrix transposed
				transposed [j][i] = board[i][j];
			}
		}
		bw.write("\n\nnew matrix\n");
		bw.flush();
		
		//print new matrix
		for (i = 0; i < m; i++)
		{
			bw.write("\n");
			bw.flush();
			for (j = 0; j < m; j++)
			{
				bw.write("[" + transposed[i][j] + "]\t");
				bw.flush();
			}
		}
	}
}