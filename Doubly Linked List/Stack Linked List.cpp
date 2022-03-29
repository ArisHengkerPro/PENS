#include <iostream>
using namespace std;

struct Barang{
	string namaBarang;
	int hargaBarang;
	
	// Pointer
	Barang *prev, *next;
};

Barang *start, *end;
int maximal = 5, jumlahStack = 0;;

void Push(string namaBarang, int hargaBarang){
	Barang *newNode;
	
	if(jumlahStack == maximal){
		cout << "Stack sudah penuh!!\n" << endl;
	}else if(jumlahStack == 0){
		start = new Barang;
		start->namaBarang = namaBarang;
		start->hargaBarang = hargaBarang;
		start->prev = NULL;
		start->next = NULL;
		end = start;
		jumlahStack++;
	}else{
		newNode = new Barang;
		newNode->namaBarang = namaBarang;
		newNode->hargaBarang = hargaBarang;
		newNode->prev = end;
		newNode->next = NULL;
		end = newNode;
		jumlahStack++;
	}
}

void Pop(){
	Barang *del;
	
	del = end;
	end = end->prev;
	delete del;
}

void Print(){
	Barang *current;
	
	if(start == NULL){
		cout << "Stack Kosong" << endl;
	}else{
		cout << "Data Barang : " << endl;
		current = end;
		while(current != NULL){
			cout << current->namaBarang << " - Rp. " << current->hargaBarang << endl;
			current = current->prev;
		}
	}
}

int main(){
	Push("Sapu", 10000);
	Push("Gunting", 6000);
	Push("Spidol", 3000);
	Push("Permen", 1000);
	
	Print();
}
