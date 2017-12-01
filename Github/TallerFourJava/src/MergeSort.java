import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MergeSort {
	//these are the objects to use
	static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
	static BufferedWriter bw = new BufferedWriter (new OutputStreamWriter (System.out));
	
	//all variables
	static int i,j,size,indexA,indexB,indexC;
	static int[] sortedL,sortedR,leftSubArray,rightSubArray,arrayC,board;
	static String numbers;
	static String[] array;
	
	public static void main (String []args)throws IOException
	{
		//Welcome message
		bw.write("Welcome\n"
				+ "this program sorts the algorithm with\n"
				+ "the Merge Sort method\n"
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
		MergeSort(board);
		bw.write("\nnew array\n\n");
		bw.flush();
		for (i = 0; i < board.length; i++)
		{
			bw.write("["+board[i]+"] ");
			bw.flush();
		}
	}
	
	public static int[] MergeSort(int[] board)
	{
		if (board.length == 1|| board.length == 0)
		{
			//array is already sorted
			return board;
		}
		else 
		{
			leftSubArray = new int [board.length / 2];
			rightSubArray = new int [board.length / 2 ];
			//Split in two parts 
			 for (i = 0; i < board.length / 2;i++)
			 {
				 leftSubArray[i] = board[i];
			 }
			 j = 0;
			 for (i = board.length / 2 + 1; i < board.length; i++)
			 {
				 rightSubArray[j] = board[i];
				 j++;
			 }
			 
			 //sort each one of the parts 
			 sortedL = MergeSort(leftSubArray);
			 sortedR = MergeSort(rightSubArray);
			 
			 //lowing the strategy Divide & Conquer 
			 return Merge(MergeSort(leftSubArray),MergeSort(rightSubArray));
		}

	}

	public static int[] Merge(int[]arrayA,int[]arrayB)
	{
		//arrayC equal to size of arrayA and arrayB
		size = arrayA.length + arrayB.length;
		board = new int [size];
		indexA = 0;
		indexB = 0;
		indexC = 0;
		while (indexA != arrayA.length && indexB != arrayB.length)
		{
			if(arrayA[indexA] < arrayB[indexB])
			{
				//Add element from A array 
				board[indexC] = arrayA[indexA];
				indexA = indexA + 1;
				indexC = indexC + 1;

			}
			else
			{
				//Add element from B array 
				board[indexC] = arrayB[indexB];
				indexB = indexB + 1;
				indexC = indexC + 1;
			}
			for ( i = 0; i < board.length;i++)
			{
				System.out.println(board[i]);
			}
		}
		
		//one of A or B has still some elements 
		while (arrayA.length != 1)
		{
			board[indexC] = arrayA[indexA];
			indexA = indexA + 1;
			indexC = indexC + 1; 
		}
		while (arrayB.length != 1)
		{
			board[indexC] = arrayB[indexB];
			indexB = indexB + 1;
			indexC = indexC + 1;
		}
		
		return board;
	}
}
//9,8,7,6,5,4,3,2,1