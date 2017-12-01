import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Random;

public class Spiral {
	//these are the objects to use
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	static Random rd = new Random();
	
	//all variables
	static int m,i,j,rows,columns,counter,method;
	static int[][] board,spiral;
	
	public static void main (String []args) throws IOException
	{
		//Welcome message
		bw.write("Welcome\n"
				+ "This program will print the numbers by console,\n"
				+ "which were created randomly in a matrix m * m,\n"
				+ "in the form of a spiral.\n"
				+ "write the value of \"m\"\n");
		bw.flush();
		m = Integer.parseInt(br.readLine());
		
		//size of matrix
		board = new int [m][m];
		spiral = new int [m][m];
		
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
		
		//matrix in spiral
		rows = 0;
		columns = 0;	
		counter = 1;
		method = 0;
		bw.write("\n\nnew matrix\n\n");
		while (counter <= (m*m))
		{
			switch (method) 
			{
	        case 0: // up
	        	for (i = rows; i < board[0].length-columns; i++) 
	        	{
	        		bw.write("["+board[rows][i]+"]\t");
	        		bw.flush();
	        		counter++;
	            }
	            method += 1;
	            break;
	 
	        case 1: //right
	        	for (i = rows+1; i < board.length-rows; i++) 
	            {
	        		bw.write("["+board[i][board[0].length -1-columns]+"]\t");
	        		bw.flush();
	        		counter++;
	            }
	            method++;
	            break;
	 
	         case 2: //down
	            for (int i = board[0].length - 2 - columns; i >= columns; i--) 
	            {
	            	bw.write("["+board[board.length -1-rows][i]+"]\t");
	                bw.flush();
	                counter++;
	            }
	            method++;
	            break;
	 
	         case 3: //left
	            for (i = board.length - 2 - rows; i >= rows + 1; i--) 
	            {
	            	bw.write("["+board[i][columns]+"]\t");
	            	bw.flush();
	                counter++;
	            }
	            method = 0;
	            rows++;
	            columns++;
	            break;
	        }
			bw.write("\n");
			bw.flush();
		}
	}
}
