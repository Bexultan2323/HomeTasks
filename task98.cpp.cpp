#include <iostream>98
using namespace std;
int main() {
	int n;
	cin >> n;
	double d = 0, x = 10;
	for (int i = 0; i <= n; i++) {
		x = x * 1.1;
		d = d + x;
	}
	cout << d << endl;
	return 0;
}