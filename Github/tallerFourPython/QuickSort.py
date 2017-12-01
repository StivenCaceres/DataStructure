class main():
    print("Welcome\n"
          + "this program sorts the algorithm with\n"
          + "the Merge Sort method\n"
          + "\nwrite the value of numbers separated by comma\n")
    #array equal to read for commas
    numbers = input()
    board = numbers.split(",")
    
    print("\nfirst array\n")
    array = []
    j = 0
    #print board
    for i in board:
        board[j] = int(i)
        j = j + 1
    print(board)
    print(QuickSort (board,0,len(board)))
    def QuickSort(self,board,izq,der):
        pivote = board[izq]
        i = izq
        j = der
        
        while i < j:
            while board[i] <= pivote and i < j:
                while board[j] > pivote:
                    if i < j:
                        aux = board[i]
                        board[i] = board[j]
                        board[j] = aux
                j=j+1    
            i= i +1
        board[izq] = board[j]
        board[j] = pivote
        if izq < (j-1):
            QuickSort (board, izq, j-1)
        if j+1 < der:
            QuickSort(board,j+1,der )
        return board