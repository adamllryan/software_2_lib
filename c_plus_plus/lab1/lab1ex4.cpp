#include <iostream>
#include <cstdlib>
using std::cout;
using std::cin;
using std::endl;
int main() {
	cout << "Input temperature in Fahrenheit: ";
	double temp;
	cin >> temp;
	cout << temp << "°F in Celsius is " << (temp-32)*5/9 << "°C" << endl;
	return EXIT_SUCCESS;
}
