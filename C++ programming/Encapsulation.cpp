#include<iostream>
using namespace std;  
class Customer{
	string name;
	int balance, account_number;
	public:
	Customer(string name, int balance, int account_number)
	{
		this->name = name;
		this->balance = balance;
		this->account_number = account_number;
	} 
	void deposit(int amount){
		if(amount>0){
			balance+=amount;
			cout<<amount<<"rupees is credited successfully"<<endl;
		}
		else {
			throw"amount should be greater than 0";
		}
	}
	void withdraw(int amount){
		if(amount>0&&amount<=balance){
	
		balance-=amount;
		cout<<amount<<"rupees is debited successfully"<<endl;
	}
	else if(amount<0)
	{
		throw "amount should be greater than 0";
	}else
	{
		throw"Your balance is law";
	}
 }
	
};
int main(){
	Customer c1("ramu", 500 ,66);
	try{
	c1.deposit(100);
	c1.withdraw(1000);
     }
	 catch(const char*e){
	 	cout<<"Exception occred:"<<e<<endl;
	 }
}
