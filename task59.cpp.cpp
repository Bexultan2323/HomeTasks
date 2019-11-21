#include <iostream> 59
using namespace std;
int main() {
	int n, m1, m2, m3, m4;
	cin >> n;
	if (n < 1000)
		cout << "error";
	m4 = n % 10;
	m3 = n % 100 / 10;
	m2 = n % 1000 / 100;
	m1 = n % 10000 / 1000;
	cout << m1 << m2 << m3 << m4;
	cout << endl;
	if (m1 > m2&& m2 > m3&& m3 > m4) {
		cout << "Yes";
	}
	else cout << "No";
	return 0;
}