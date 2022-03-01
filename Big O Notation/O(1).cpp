#include <iostream>
using namespace std;

int Jumlah(int a, int b){
	return a+b;
}

int main(){
	int a, b, hasil;
	
	cout << "Masukkan nilai a dan b : ";
	cin >> a >> b;
	
	hasil = Jumlah(a, b);
	cout << hasil;
}
