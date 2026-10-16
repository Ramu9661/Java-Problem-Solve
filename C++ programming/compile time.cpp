#include<iostream>
using namespace std;
class compileTimePolymorphism{
	public:
       int add(int a ,int b){  
	     return a+b;
	 }
	 double add(double a, double b, double c){  
	 	return a+b+c;
	 }
};
int main(){
	compileTimePolymorphism obj;
	cout<<"Integer sum:"<< obj.add(2 ,5)<<endl;
	cout<<"decimal sum:"<< obj.add(1.2 , 2.2 , 2.1)<<endl;
	return 0;
}
