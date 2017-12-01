import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BubbleSort {
	
	//these are the objects to use
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	
	public static void main (String[] args) throws IOException
	{
		//all variables
		int i, j, k, swap, size;
		boolean swapped;
		String numbers;
		String[] array;
		int [][] board;
		int [] aux;
		
		//Welcome message
		bw.write("Welcome\n"
				+ "this program sorts the algorithm with the Bubble Sort method\n"
				+ "\nwrite the value of \"m\"\n");
		bw.flush();
		
		size = Integer.parseInt(br.readLine());
		
		bw.write("Enter " + size*size + " numbers separated by comma\n");
		bw.flush();
		numbers = br.readLine();
		array = numbers.split(",");
		board = new int [size][size];
		aux = new int [size*size];
		k = 0;//counter
		
		for (i = 0; i < size; i++)
		{
			bw.write("\n");
			bw.flush();
			for (j = 0; j < size; j++)
			{
				if ((array[k]) != null) 
				{
					board[i][j] = Integer.parseInt(array[k]);
					aux[k] = Integer.parseInt(array[k]);
				}else
				{
					board[i][j] = 0;
				}
				
				bw.write("[" + board[i][j] + "]\t");
				bw.flush();
				
				k++;
			}
		}
		bw.write("\n\nOrdered array\n");
		bw.flush();
		swapped = true;
		while (swapped)
		{
			swapped = false;
			for (i = 0; i < size*size - 1; i++)
			{
				if(aux[i] > aux[i+1])
				{
					swap = aux[i];
					aux[i] = aux[i+1];
					aux[i+1] = swap;
					swapped = true;
				}
			}
		}
		//print new matrix
		k = 0;
		for (i = 0; i < size; i++)
		{
			bw.write("\n");
			bw.flush();
			for (j = 0; j < size; j++)
			{
				board[i][j] = aux[k];
				bw.write("[" + board[i][j] + "]\t");
				bw.flush();
				k++;
			}
		}
	}
}
