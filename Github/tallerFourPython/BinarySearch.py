'''
Created on 30/11/2017

@author: Stiven Caceres Hernandez
@time: 12:35pm
'''
from builtins import int
class main():
    #Welcome message
    print("welcome\n",
          "this program looks for the number you want",
          "in an array that you enter\n",
          "\nwrite the value of numbers separated by comma\n")
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
    
    #logic for order
    j = 0    
    for i in board:
        #select value to be moved 
        x = i       #value to insert
        index = j   #hole position
        
        #locate hole position for the value to be inserted 
        while index > 0 and board[index - 1] > x:
            board[index] = board[index - 1]
            index = index - 1
            
        #insert the value at hole position 
        board[index] = x
        j = j + 1 #counter
        
    #print array order
    print("\nnew array\n")
    print(board)
    
    #number to search
    print("\nwhich number you want to search?\n")
    x = input()
    x = int (x)
    #logic for search
    lowerBound = 0
    upperBound = len(board) - 1
    index = -1
    while lowerBound < upperBound:
        middlePoint = (lowerBound + upperBound) / 2
        middlePoint = int(middlePoint)
        if x == board[middlePoint]:
            index = middlePoint
            break
        else:
            if x < board[middlePoint]:
                upperBound = middlePoint - 1
            else:
                lowerBound = middlePoint + 1
    
    if lowerBound == upperBound and board[lowerBound] == x:
        index = lowerBound
    if index != -1:
        print("\nnumber in position: ",index + 1)
    else:
        print("\nNumber not found")