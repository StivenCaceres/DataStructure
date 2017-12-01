#include <iostream>
#include <conio.h>
#include <stdlib.h>

using namespace std;
 
int main() 
{

	//Welcome message
	cout <<"Welcome\n";
	cout <<"this program print the matrix transpose m * m\n";
	cout <<"\nwrite the value of \"m\"\n";
	
	//all variables
	int m,i,j,k;
	cin >> m;	//read to size
	int board[m][m];
	int matrix [m][m];
	cout << "Enter the number "<<m*m<<" in the position:\n\n";
	
	//read the array
	for (i = 0; i < m; i++)
	{
		for (int j = 0; j < m; j++) 
		{
			cout << "board["<<i+1<<"]["<<j+1<<"]: ";
			cin >> board[i][j];
		}
	}
	
	cout<<"\nfirst matrix\n";
	//first matrix
	for (i = 0; i < m; i++)
	{
		cout<<"\n";
		for (j = 0; j < m; j++)
		{
			cout <<"["<<board[i][j]<<"]\t";
			matrix[j][i] = board[i][j];
		}
	}
	//print new matrix
	cout<<"\n\nnew matrix\n";
	for (i = 0; i < m; i++)
	{
		cout<<"\n";
		for (j = 0; j < m; j++)
		{
			cout <<"["<<matrix[i][j]<<"]\t";
		}
	}
	cout <<"\n\n";
	system("PAUSE");
	return 0;
}
//(rand() %101)-50
