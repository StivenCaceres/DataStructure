import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class InterpolationSearch {
	//these are the objects to use for read and write
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	
	//all variables
	static int i, x, index;
	static int middlePoint,lowerBound,upperBound;
	static String numbers;
	static String[] array;
	static int [] board;
	
	public static void main (String[] args) throws IOException
	{
		//Welcome message
		bw.write( "Welcome\n"
				+ "this program sorts the algorithm with the\n"
				+ "Insertion Sort method, search a number too\n"
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
		
		//read x = number to search
		bw.write("\nwhich number you want to search?\n");
		bw.flush();
		x = Integer.parseInt(br.readLine());
		
		//logic for search
		lowerBound = 0;
		upperBound = board.length - 1;
		index = -1;
		
		//if upper bound is less than lower bound,
		//there is not a feasible solution 
		while (lowerBound < upperBound)
		{
			middlePoint = lowerBound +((upperBound-lowerBound)/
					(board[upperBound] - board[lowerBound])) *
					(x - board[lowerBound]);
			if(x == board[middlePoint])
			{
				//x has been found 
				index = middlePoint;
				break;
			}
			else
			{
				if(x < board[middlePoint])
				{
					upperBound = middlePoint + 1;
				}
				else
				{
					lowerBound = middlePoint + 1;
				}
			}
		}
		if (lowerBound == upperBound && board[lowerBound]==x)
		{
			index = lowerBound;
		}
		bw.write("\nnumber in position: " + (index + 1));
		bw.flush();
	}	
}