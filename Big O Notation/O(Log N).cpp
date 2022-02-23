#include <iostream>
using namespace std;

void Hello(int n){
	if(n == 0){
		cout << "Done" << endl;
	}else{
		cout << "Hello" << endl;
		n--;
		Hello(n);
	}
}

main(){
	Hello(5);
}
