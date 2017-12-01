'''
Created on 25/11/2017

@author: Stiven Caceres Hernandez
'''
import random

class main():
    matrix = []
    print("Welcome")
    print("This program will print the even, odd, positive and")
    print("negative numbers of a matrix m * m with random numbers.\n")
    print("write the value of \"m\"\n")
    size = input()
    size = int(size)
    matrix = []
    board = []
    #create matrix
    for i in range(size):
        matrix.append([0]*size)
        board.append([0]*size)
    #fill matrix
    for i in range(0,size):
        for j in range(0,size):
            matrix[i][j] = random.randint(10,99)
    #print matrix
    print ("first matrix\n")
    for i in matrix:
        print (i)
    
    firstValue = int((size - 1) / 2)    #principle of the diamond
    half = True                         #if it's half the diamond
    
    #if the size of the matrix is even or odd
    if size % 2 ==0:
        finalyValue = firstValue + 1
    else:
        finalyValue = firstValue
        
    #fill new matrix
    for i in range(firstValue):
        print(firstValue)
        for j in range(finalyValue):
            board[i][j] = matrix[i][j]
            
        if half == True:
            if size % 2 == 0:
                if (firstValue - 1) >= 0 and finalyValue < size:
                    firstValue = firstValue - 1
                    finalyValue = finalyValue + 1
                    print(firstValue)
                else:
                    half = False
                    firstValue = 0
                    finalyValue = size - 1
            else:
                if (firstValue - 1) > 0 and finalyValue < size:
                    firstValue = firstValue - 1
                    finalyValue = finalyValue + 1
                else:
                    half = False
                    firstValue = 0
                    finalyValue = size - 1
        else:
            firstValue = firstValue + 1
            finalyValue = finalyValue -1
    
    print("\nnew matrix\n")        
    for i in board:
        print (i)