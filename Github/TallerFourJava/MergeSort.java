package DivideYVenceras;

public class MergeSort 
{
	public static void MergeSort(int board[], int izq, int der)
	{
		if (izq < der)
		{
			int half = (izq + der) / 2;
			MergeSort (board, izq, half);
			MergeSort (board, half + 1, der);
			Merge(board, izq, half,der);
		}
	}
	public static void Merge(int board[],int izq, int half, int der)
	{
		int i, j, k;
		//array auxiliar
		int [] aux = new int[board.length];
		
		//copia ambas mitades en el array auxiliar
		for (i = izq; i <= der; i++)
		{	
			aux[i] = board[i];
	
			i = izq; 
			j = half + 1;
			k = izq;
			//copia el siguiente elemento más grande
			while (i <= half && j <= der) 
			{ 
				if (aux[i] <= aux[j]) 
				{	
					board[k++] = aux[i++];
				}				else
				{
					board[k++] = aux[j++];
				}
			}
			//copia los elementos que quedan de la
			//primera mitad (si los hay)
			while (i <= half) 
			{ 
				board[k++]=aux[i++]; 
			}
		}
	}
}
