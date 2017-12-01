#include <iostream>
#include <conio.h>
#include <stdlib.h>
#include <vector>

using namespace std;

int main()
{
	//variables int
	int index,size,i,value;
	
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
	
	cout << "\n\nwrite the nummber for search\n\n";
	cin >> value;
	index = -1;
	for (i = 0; i < size; i++)
	{
		if( array[i] == value)
		{
			index = i+1;
			cout<<"\nthe number is "<<index<<" position\n";
			break;
		}
	}
	if (index = -1)
	{
		cout<<"\nNumber not found\n";
	}
	cout << "\n\n";
	system("PAUSE");
	return 0;
}
