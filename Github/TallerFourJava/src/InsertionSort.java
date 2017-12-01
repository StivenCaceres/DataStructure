import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InsertionSort {
	//these are the objects to use
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	
	public static void main(String[]args) throws IOException
	{
		//all variables
		int i, x, index;
		String numbers;
		String[] array;
		int [] board;
		
		//Welcome message
		bw.write("Welcome\n"
				+ "this program sorts the algorithm with\n"
				+ "the Insertion Sort method\n"
				+ "\nwrite the value of numbers separated by comma\n");
		bw.flush();
		
		// array equal to read for commas	
		numbers = br.readLine();
		array = numbers.split(",");
		board = new int [array.length];
		
		//Print first array
		bw.write("\nfirst array\n\n");
		bw.flush();
		for (i = 0; i < array.length; i++)
		{
			board[i] = Integer.parseInt(array[i]);
			bw.write("["+board[i]+"] ");
			bw.flush();
		}
		
		//logic
		for (i = 1; i < board.length; i++)
		{
			//select value to be moved 
			x = board[i];	//value To Insert
			index = i;		//hole Position
			
			//locate hole position for the value to be inserted 
			while ( index > 0 && board[index-1] > x)
			{
				board[index] = board[index-1];
				index--;
			}
			
			//insert the value at hole position 
			board[index] = x;
		}		
		
		//Print new array
		bw.write("\n\nnew array\n\n");
		bw.flush();
		for (i = 0; i < board.length; i++)
		{
			bw.write("["+board[i]+"] ");
			bw.flush();
		}
	}
}