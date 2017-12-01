#include <iostream>
#include <conio.h>
#include <stdlib.h>
#include <time.h>

using namespace std;
 
int main() 
{
	srand(time(NULL));
	//Welcome message
	cout <<"Welcome\n";
	cout <<"This program will print the even, odd, positive and\n";
	cout <<"negative numbers of a matrix m * m with random numbers.\n";
	cout <<"\nwrite the value of \"m\"\n";
	
	//all variables
	int i,j,m,num;
	cin >> m;
	int board [m][m];
	//print of the matrix
	for (i = 0; i < m; i++)
	{
		cout << "\n";
		for (int j = 0; j < m; j++)
		{
			board[i][j] = -50 +rand()%100;
			cout << "["<<board[i][j]<<"]\t";
		}
	}
	
	cout << "\n\npair numbers\n";
	for (i = 0; i < m; i++)
	{
		cout << "\n";
		for (int j = 0; j < m; j++)
		{
			if(board[i][j] % 2 == 0)
			{
				cout <<"["<<board[i][j]<<"]\t";
			}else{
			cout << " -\t";
			}
		}
	}
	
	cout << "\n\nOdd numbers\n";
	for (i = 0; i < m; i++)
	{
		cout << "\n";
		for (int j = 0; j < m; j++)
		{
			if(board[i][j] % 2 != 0)
			{
				cout <<"["<<board[i][j]<<"]\t";
			}else{
			cout << " -\t";
			}
		}
	}
	
	cout << "\n\nPositove numbers\n";
	for (i = 0; i < m; i++)
	{
		cout << "\n";
		for (int j = 0; j < m; j++)
		{
			if(board[i][j] > 0)
			{
				cout <<"["<<board[i][j]<<"]\t";
			}else{
			cout << " -\t";
			}
		}
	}
	
	cout << "\n\nNegative numbers\n";
	for (i = 0; i < m; i++)
	{
		cout << "\n";
		for (int j = 0; j < m; j++)
		{
			if(board[i][j] < 0)
			{
				cout <<"["<<board[i][j]<<"]\t";
			}else{
			cout << " -\t";
			}
		}
	}
	return EXIT_SUCCESS;
}
