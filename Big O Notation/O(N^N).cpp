#include <iostream>
using namespace std;

bool IsDouble(int array[], int size){
	
	for(int i = 0; i < size; i++){
		for(int j = i+1; j < size; j++){
			for(int k = i+1; k < size; k++){
				if(array[i] == array[k]) return true;
			}
		}
	}
	return false;
}

int main(){
	int angka[] = {23, 71, 32, 103, 42, 23};
	int size = sizeof(angka)/sizeof(*angka);
	
	bool state = IsDouble(angka, size);
	cout << state << endl;
}
