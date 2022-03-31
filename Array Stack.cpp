#include <iostream>
using namespace std;

const int maksimal = 5;
string arrayBenda[maksimal];
int top = 0;

bool isFull(){
	if(top == maksimal)
		return true;
	return false;
}

bool isEmpty(){
	if(top == 0)
		return true;
	return false;
}


void Push(string benda){
	if(isFull()){
		cout << "Stack sudah penuh!" << endl;
	}else{
		arrayBenda[top] = benda;
		top++;
	}
}

void Display(){
	cout << "Data stack array : " << endl;
	for(int i = maksimal - 1; i >= 0; i--){
		if( arrayBenda[i] != "" ){
			cout << arrayBenda[i] << endl;
		}
	}
}

void Pop(){
	if( isEmpty() ){
		cout << "Tidak ada data pada stack" << endl;
	}else{
		arrayBenda[top-1] = ""; 
		top--;
	}
}

void Peek(int posisi){
	if( isEmpty() ){
		cout << "Tidak ada data pada stack" << endl;
	}else{
		int index = top;
		for(int i = 0; i < posisi; i++){
			index--;
		}
		cout << "Data posisi ke - " << posisi << " : " << arrayBenda[index] << endl;
	}
}

int main(){
	Push("Sapu");
	Push("Penghapus");
	Push("Pencil");
	Push("Spidol");
	Peek(3);
	
	Display();
}
