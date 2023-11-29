#ifndef CIRCLE_H
#define CIRCLE_H
class Circle
{
public:
	Circle();
	Circle(int x, int y, double radius);
	Circle(const Circle &c);
	int getX() const;
	int getY() const;
	double getRadius() const;
	void setX(int x_coord);
	void setY(int y_coord);
	void setRadius(int r);
	void translate(int horizShift, int vertShift);
	double getArea();
	void displayCircle() const;
	bool intersect(Circle c);
	bool operator==(Circle c);
	Circle operator+(const Circle &c1); 
private:
	int x;
	int y;
	int radius;
};
#endif
