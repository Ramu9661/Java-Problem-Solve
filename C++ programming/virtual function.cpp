#include<iostream>
using namespace std;
class A{
	public:
	virtual	void show(){
			cout<<"base class"<<endl;
		}
};
 class B : public A
 {
 	public:
 		void show(){
 			cout<<"derived class"<<endl;
		 }
 };
 int main(){
 	A*ptr;
 	B aa;
 	ptr=&aa;
 	ptr->show();
 	return 0;
 }











































































