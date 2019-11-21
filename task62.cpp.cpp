#include <iostream> 62
using namespace std;
int main() {
	int n;
	cin >> n;
	int n1, n2, n3, n4, n5;
	n5 = n % 10;
	n4 = 0;
	n3 = n % 1000 / 100;
	n2 = 0;
	n1 = n % 100000 / 10000;
	cout << n1 << n2 << n3 << n4 << n5;
	return 0;
}