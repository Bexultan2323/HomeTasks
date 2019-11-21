#include <iostream> 61
using namespace std;
int main() {
	int n, m;
	cin >> n;
	cin >> m;
	int n1, n2, n3;
	int m1, m2, m3;
	n3 = n % 10;
	n2 = n % 100 / 10;
	n1 = n % 1000 / 100;
	m3 = m % 10;
	m2 = m % 100 / 10;
	m1 = m % 1000 / 100;
	cout << n1 << n2 << n3 << m1 << m2 << m3;
	return 0;
}
