#include <iostream>
#include <conio.h>
#include <stdlib.h>


using namespace std;
 
int main() 
{
	
	//Welcome message
	cout <<"Welcome\n";
	cout <<"this program ordered the array with the Bubble Sort method\n";
	cout <<"\nwrite the size of array\n";
	
	//size the matrix
	int size,i,swap;
	bool swapped;
	//read to size
	cin >> size;
	int array[size];
	
	cout<<"\nwrite the number in the position\n";
	//read array
	for (i = 0; i < size; i++)
	{
		cout<<"array["<<i+1<<"]: ";
		cin >> array[i]; 
	}
	
	//Print first array
	cout<<"\nfirst array\n\n";
	for (i = 0; i < size; i++)
	{
		cout<< "["<<array[i]<<"]  ";
	}
	
	swapped = true;
	//logic for change the matrix
	while (swapped != false)
	{
		swapped = false;
		for (i = 0; i < size*size -1; i++)
		{
			if (array[i] > array[i+1])
			{
				swap = array[i];
				array[i] = array[i+1];
				array[i+1] = swap;
				swapped = true;
			}
		}
	}
	
	//print new matrix ordered
	cout << "\n\nnew matrix ordered\n\n";
	for (i = 0; i < size; i++)
	{
		cout<< "["<<array[i]<<"]  ";
	}
	cout << "\n\n";
	system("PAUSE");
	return 0;
}
