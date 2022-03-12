#include <iostream>
using namespace std;

struct Motor{
	string merk, nomorKendaraan, type;
	Motor *prev, *next;
};

Motor *start, *end;
int jumlahLinkedList = 0;

void CreateDoublyLinkedList(string merkMotor, string nomorMotor, string typeMotor){
	start = new Motor();
	
	start->merk = merkMotor;
	start->nomorKendaraan = nomorMotor;
	start->type = typeMotor;
	start->prev = NULL;
	start->next = NULL;
	end = start;
	jumlahLinkedList = jumlahLinkedList + 1;
}

void Checker(){
	if(start == NULL){
		cout << "Tidak ada data pada doubly linked list" << endl;
		exit(0);
	}
}

void AddNodeAtFirst(string merkMotor, string nomorMotor, string typeMotor){
	Motor *newNode;
	
	Checker();
	newNode = new Motor();
		
	newNode->merk = merkMotor;
	newNode->nomorKendaraan = nomorMotor;
	newNode->type = typeMotor;
	newNode->prev = NULL;
	newNode->next = start;
	start->prev = newNode;
	start = newNode;
	jumlahLinkedList = jumlahLinkedList + 1;
}

void AddNodeAtLast(string merkMotor, string nomorMotor, string typeMotor){
	Motor *newNode;
	Checker();
	
	newNode = new Motor();
		
	newNode->merk = merkMotor;
	newNode->nomorKendaraan = nomorMotor;
	newNode->type = typeMotor;
	newNode->prev = end;
	newNode->next = NULL;
	end->next = newNode;
	end = newNode;
	jumlahLinkedList = jumlahLinkedList + 1;
}

void AddNodeAtMiddle(string merkMotor, string nomorMotor, string typeMotor, int posisi){
	Motor *current, *newNode, *afterNode;
	
	Checker();
	if(posisi <= 1 || posisi > jumlahLinkedList){
		cout << "Posisi diluar jangkauan atau bukan posisi tengah"<< "\n"  << endl;
	}else{
		newNode = new Motor();
			
		newNode->merk = merkMotor;
		newNode->nomorKendaraan = nomorMotor;
		newNode->type = typeMotor;
			
		//trafers
		current = start;
		int nomor = 1;
		while(nomor < posisi-1){
			current = current->next;
			nomor++;
		}
		afterNode = current->next;
		newNode->prev = current;
		newNode->next = afterNode;
		current->next = newNode;
		afterNode->prev = newNode;
		jumlahLinkedList = jumlahLinkedList + 1;
	}
}

void PrintDoublyLinkedList(){
	Motor *current, *newNode;
	Checker();
	
	cout << "Isi Doubly Linked List sekarang : " << jumlahLinkedList << endl;
	cout << "Isi data : " << "\n" << endl;
	current = start;
	while(current != NULL){
		cout << "Merek Motor : " << current->merk << endl;
		cout << "Nomor Kendaraan : " << current->nomorKendaraan << endl;
		cout << "Tipe Motor : " << current->type << "\n"<< endl;
		current = current->next;
	}
}

void RemoveNodeAtFirst(){
	Motor *del;
	Checker();
	
	del = start;
	start = start->next;
	start->prev = NULL;
	delete del;
	jumlahLinkedList = jumlahLinkedList - 1;
}

void RemoveNodeAtLast(){
	Motor *del;
	Checker();
	
	del = end;
	end = end->prev;
	end->next = NULL;
	delete del;
	jumlahLinkedList = jumlahLinkedList - 1;
}

void RemoveNodeAtMiddle(int posisi){
	Motor *current, *del, *afterNode;
	Checker();
	
	if(posisi <= 1 || posisi >= jumlahLinkedList ){
		cout << "Posisi diluar jangkauan atau bukan posisi tengah!" << "\n" << endl;
	}else {
		int nomor = 1;
		current = start;
		
		while(nomor < posisi-1){
			current = current->next;
			nomor++;
		}
		del = current->next;
		afterNode = del->next;
		current->next = afterNode;
		afterNode->prev = current;
		delete del;
		jumlahLinkedList = jumlahLinkedList - 1;
	}
}

int main(){
	CreateDoublyLinkedList("Honda", "L 2012 SO", "Matic");
	PrintDoublyLinkedList();
		
	AddNodeAtFirst("Supra X", "L 1230 LO", "Manual");
	PrintDoublyLinkedList();
	
	AddNodeAtLast("Honda Mio", "L 1122 AA", "Matic");
	PrintDoublyLinkedList();
	
	AddNodeAtMiddle("Supra XX", "M 6928 PO", "Manual", 3);
	PrintDoublyLinkedList();
	
	RemoveNodeAtMiddle(2);
	PrintDoublyLinkedList();
}
