#include <iostream>
#include "Circle.h"
#define _USE_MATH_DEFINES
#include <math.h>
using namespace std;

Circle::Circle()
{
	x = 0;
	y = 0;
	radius = 5;
}
Circle::Circle(int x_val, int y_val, double r)
{
	x = x_val;
	y = y_val;
	radius = r;
}
Circle::Circle(const Circle &c)
{
	x = c.getX();
	y = c.getY();
	radius = c.getRadius();
}
int Circle::getX() const {
	return x;
}
int Circle::getY() const {
	return y;
}
double Circle::getRadius() const {
	return radius;
}
void Circle::setX(int x_coord) {
	x = x_coord;
}
void Circle::setY(int y_coord) {
	y = y_coord;
}
void Circle::setRadius(int r) {
	if (r<=0)
		cerr << "value of radius cannot be below zero";
	radius = r;
}
void Circle::translate(int horizShift, int vertShift) {
	x += horizShift;
	y += vertShift;
}
double Circle::getArea() {
	return M_PI * radius * radius;
}
void Circle::displayCircle() const {
	cout << "Radius: " <<radius<< " at point x = " <<x<< ", y = " <<y<< endl;
}
bool Circle::intersect(Circle c) {
	return sqrt(pow(x-c.getX(), 2) + pow(y-c.getY(), 2))<radius+c.getRadius();
}
bool Circle::operator==(Circle c) {
	
	return (c.getX()==this->getX()) && (c.getY()==this->getY()) && (c.getRadius()==this->getRadius());
}
Circle Circle::operator+(const Circle &c1) {
	int radius = radius;
	int x = this->getX();
	int y = this->getY();
	double c1_m = sqrt(pow(c1.getX(), 2)+pow(c1.getY(), 2));
	double c2_m = sqrt(pow(x, 2)+pow(y, 2));
	Circle *ret;
	if (c1_m>c2_m)
		ret = new Circle(c1.getX(), c1.getY(), c1.getRadius()+this->getRadius());
	else
		ret = new Circle(x, y, c1.getRadius()+this->getRadius());
	return *ret;
}
