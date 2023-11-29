#ifndef SHAPES_H
#define SHAPES_H

class Shape {
	private: 		
	public: 
		 virtual double area() const = 0;
		 virtual void display() const = 0;
};
class Circle : public Shape {
	protected: 
		int radius;
	public:
		Circle();
		Circle(int r);
		virtual double area() const;
		virtual void display() const;
};
class Rectangle : public Shape {
	protected: 
		int l, w;
	public: 
		Rectangle();
		Rectangle(int len, int wid);
		 double area() const;
		 void display() const;
};
class Quadrilateral : public Shape{
	protected: 
		int length, height;
	public:
};
class Trapezoid : public Quadrilateral {
	protected:
		int side;
	public: 	
		 Trapezoid();
		 Trapezoid(int l, int h, int s);
		double area() const;
		void display() const;
};

#endif
