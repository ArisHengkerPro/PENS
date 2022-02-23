#include <iostream>

using namespace std;

bool IsDouble(int array[], int size){
	
	for(int i = 0; i < size; i++){
		for(int j = i+1; j < size; j++){
			if(array[i] == array[j]) return true;
		}
	}
	return false;
}

int main(){
	int angka[] = {10, 7, 3, 10, 0};
	int size = sizeof(angka)/sizeof(*angka);
	
	bool state = IsDouble(angka, size);
	cout << state << endl;
}
