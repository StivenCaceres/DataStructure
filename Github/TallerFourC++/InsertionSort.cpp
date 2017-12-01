#include <iostream>
#include <conio.h>
#include <stdlib.h>
#include <vector>

using namespace std;

int main()
{
	//variables int
	int size,x,index,i;
	
	cout<<"Welcome\n\n";
	cout<<"this program sorts the algorithm with\n";
	cout<<"he Insertion Sort method\n";
	cout<<"\nwrite the size of array\n";
	
	cin >> size;
	int array [size];
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
	
	//logic
	for (i = 1; i < size; i++)
	{
		{
			//select value to be moved 
			x = array[i];	//valueToInsert
			index = i;		//holePosition
			
			//locate hole position for the value to be inserted 
			while ( index > 0 && array[index-1] > x)
			{
				array[index] = array[index-1];
				index--;
			}
			//insert the value at hole position 
			array[index] = x;
		}	
	}
	
	//Print new array
	cout<<"\n\nnew array\n\n";
	for (i = 0; i < size; i++)
	{
		cout<< "["<<array[i]<<"]  ";
	}
	
	cout << "\n\n";
	system("PAUSE");
	return 0;
}
