#include<iostream>
using namespace std;
int main()
{
    	int n=5;
	    for(int i=1; i<=n; i++){
		for(int s=1; s<=n-i+1; s++){
			cout<<"*";
      }
      cout<<"";
	}
}
