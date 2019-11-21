#include <iostream> 60
using namespace std;
int main() {
	int n;
	cin >> n;
	int n1, n2, n3;
	n3 = n % 10;
	n2 = n % 100 / 10;
	n1 = n % 1000 / 100;
	cout << n3 << n2 << n1;
	return 0;
}