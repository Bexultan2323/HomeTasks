#include <iostream>55
using namespace std;
int main() {
	int a[3];
	int d = 0;
	for (int i = 0; i < 3; i++) {
		cin >> a[i];
		if (a[i] > 0) {
			d++;
		}
	}
	cout << d << endl;
	return 0;
}
