#include<iostream>
using namespace std;
class Distance{
	private:
		int meters;
		public:
			Distance(){
			
			int meters=0;
		}
			void displayData(){
				cout <<"meters value:"<<meters<<endl;
			}
			friend void addValues(Distance &d);
};
 void addValues(Distance &d){
   	d.meters= d.meters+5;

   }
int main(){
	Distance d1;
	d1.displaydata();
	addValues(d1);
	d1.displaydata();
	return 0;
	
}

