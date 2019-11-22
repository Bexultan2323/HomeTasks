#include <iostream>130
using namespace std;
int main() {
	int n ,n1, n2, n3, n4, n5, n6, sum;
	cin >> n;
		n6 = n % 10;
		n5 = n % 100 / 10;
		n4 = n % 1000 / 100;
		n3 = n % 10000 / 1000;
		n2 = n % 100000 / 10000;
		n1 = n % 1000000 / 100000;
		sum = n1 + n2 + n3 + n4 + n5 + n6;
		if (sum % 13 == 0)
			cout << "chaslivi";
		else {
			cout << "Tebe ne povezlo";
		}
	return 0;
}