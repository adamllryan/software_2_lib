#include "shapes.h"
#include <iostream>
using namespace std;

Circle::Circle() {radius = 0;}
Circle::Circle(int r) {radius = r;}
double Circle::area() const {return 3.1415926 * radius * radius;}
void Circle::display() const {cout << "Circle: " << radius << " | Area = " << area() << endl;}

Rectangle::Rectangle() {l = 0;w = 0;}
Rectangle::Rectangle(int len, int wid) {l = len; w = wid;}
double Rectangle::area() const {return (double)l * w;}
void Rectangle::display()  const {cout << "Rectangle: " << l << ", " << w << " | Area = " << area() << endl;} 

Trapezoid::Trapezoid() {length = 0; height = 0; side = 0;}
Trapezoid::Trapezoid(int l, int h, int s) {length = l; height = h; side = s;}
double Trapezoid::area() const {return (double)(length + side)/2 * height;}
void Trapezoid::display() const {cout << "Trapezoid: " << length << ", " << height << ", " << side << " | Area = " << area() << endl;}
