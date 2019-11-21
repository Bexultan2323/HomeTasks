#include <iostream>57
using namespace std;
int main() {
	int d, m, y;
	cin >> d >> m >> y;
	if (m == 2) {
		if (d >= 1 && d <= 28) {
			cout << "Yes";
		}
		else {
			cout << "No";
		}
	}
	else if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
		if (d >= 1 && d <= 31) {
			cout << "Yes";
		}
	}
	else if (m == 4 || m == 6 || m == 9 || m == 11) {
		if (d >= 1 && d <= 30) {
			cout << "Yes";
		}
	}
	return 0;
}
