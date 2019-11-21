#include <iostream> 54
using namespace std;
int main() {
	int a, b, c;
	cin >> a >> b >> c;
	if (a < 5 && b < 5 || b < 5 && c < 5 || b < 5 && c < 5) {
		cout << "Yes";
	}
	else {
		cout << "No";
	}
	return 0;
}