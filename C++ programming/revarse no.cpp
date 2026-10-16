#include<iostream>
using namespace std;
int main()
{
	int n = 1099901;
	while (n > 0){
		int lastDigit = n % 10;
		cout<<lastDigit;
		n = n/10;
	}

}
