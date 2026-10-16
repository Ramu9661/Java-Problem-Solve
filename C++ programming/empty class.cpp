#include<iostream>
using namespace std;
class Hero{
	public:
		int healt;
		char level;
		
};
int main()
 {
 	Hero ramu;
 	ramu.healt = 21;
 	ramu.level = 'A';
 	cout<<"Health:-"<<ramu.healt<<endl;
 	cout <<"Level:-"<<ramu.level<<endl;
 	return 0;
 }
