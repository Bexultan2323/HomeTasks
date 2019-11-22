#include <iostream>118
using namespace std;
int main() {
	int a[100];
	int d = 0;
	for (int i = 0; i < 100; i++) {
		cin >> a[i];
		if (i % 2 == 0)
			d = d + a[i];
		if (a[i] == 0)break;
	}
	cout << d;
	return 0;
}