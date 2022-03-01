#include <iostream>
using namespace std;

const int a = 2, b = 3;

int Print(int array[a][b][b]){
	
	for(int i = 0; i < a; i++){
		for(int j = 0; j < b; j++){
			for(int k = 0; k < b; k++){
				cout << array[i][j][k] << "\t";
			}
			cout << endl;
		}
	}
	return false;
}

int main(){	
	int angka[a][b][b] = {{{10, 2, 20}, {100, 4, 5}, {12, 13, 14}}, 
	{{2000, 23, 122}, {120, 230, 120}, {12, 69, 20}}};
	
	Print(angka);
	
}
