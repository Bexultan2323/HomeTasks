#include <iostream>100
using namespace std;
int main() {
	int i1, i2, i3, i4;
	for (int i = 1000; i <= 9999; i++) {
		i4 = i % 10;
		i3 = i % 100 / 10;
		i2 = i % 1000 / 100;
		i1 = i % 10000 / 1000;
		if (i1 != 5 && i1 != 6 && i2 != 5 && i2 != 6 && i3 != 5 && i3 != 6 && i4 != 5 && i4 != 6) {
			cout << i1 << i2 << i3 << i4 << " ";
		}
	}
	return 0;
}