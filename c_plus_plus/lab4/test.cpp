#include <iostream>
#include "Circle.h"

using namespace std;
int main() {
    Circle *c1 = new Circle();
    c1->displayCircle();
    Circle *c2 = new Circle(1,2,3.0);
    c2->displayCircle();
    Circle *c3 = new Circle(*c2);
    c3->displayCircle();
    c3->translate(1,1);
    c3->displayCircle();
    c3->setX(1);
    c3->setY(2);
    c3->setRadius(4.0);
    cout << "Area of c3: " << c3->getArea() << endl;
    cout << "c1 intersects c2: " << c1->intersect(*c2) << endl;
    cout << "c3 intersects c2: " << c3->intersect(*c2) << endl;
    cout << "c1 intersects c3: " << c1->intersect(*c3) << endl;
    Circle *test = new Circle(*c1);
    test->displayCircle();
    cout << "c1 == new c1: " << (*c1==*test) << endl;
    Circle sum = *c1+*c2;
    sum.displayCircle();
    delete c1;
    delete c2;
    delete c3;
    delete test;
}