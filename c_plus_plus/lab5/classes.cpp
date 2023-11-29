#include <iostream>
using namespace std;

class A {
	protected:
		int var;
	public:
		A() { var = 0; }
		void increment() { var++; }
		virtual void decrement() { var--; }
		virtual void print() {cout << "var = " << var << endl;}
};

class B : public A {
	protected: 
		int varB;
	public: 
		B() { varB = 0;}
		void increment() { var += 3; }
		virtual void decrement() { var -= 3; }
		void print() {
			cout << "var = " << var << endl;
			cout << "varb = " << varB << endl;
		}
};

A aPasser(A a) {
	return a;
}

int main() {
	A a;
	A * ptr;
	ptr = &a;
	ptr -> increment();
	ptr -> print();
	ptr -> decrement();
	ptr -> print();
	
	//Question 1
	cout << "Question 1" << endl;
	
	B b;
	ptr = &b;
	ptr -> print();

	//Question 2
	cout << "Question 2" << endl;

	a = b;
	a.print();
	ptr = &a;
	ptr -> print();

	//Question 4
	cout << "Question 4" << endl;
	
	aPasser(b).print();

	//Question 5
}
