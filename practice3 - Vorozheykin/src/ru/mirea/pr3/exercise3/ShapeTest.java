package ru.mirea.pr3.exercise3;

import ru.mirea.pr3.exercise2.Circle;
import ru.mirea.pr3.exercise2.Rectangle;
import ru.mirea.pr3.exercise2.Shape;
import ru.mirea.pr3.exercise2.Square;

public class ShapeTest {

	public static void main(String[] args) {
		Shape s1 = new Circle(5.5, "RED", false); // Upcast Circle to Shape
		System.out.println(s1); // which version? (Circle)
		System.out.println(s1.getArea()); // which version? (Circle)
		System.out.println(s1.getPerimeter()); // which version? (Circle)
		System.out.println(s1.getColor());
		System.out.println(s1.isFilled());
		// System.out.println(s1.getRadius());
		/*
		1) При выполнения методов toString(), getArea() и getPerimeter()
		будут вызываться переопределённые методы класса Circle.

		2) Метод getRadius() находится в классе Circle, который наследуется от Shape.
		Поэтому JVM не может найти его в Shape.
		Для выполнения этого метода необходимо провести downcast.
		System.out.println(((Circle) s1).getRadius());
		 */

		Circle c1 = (Circle) s1; // Downcast back to Circle
		System.out.println(c1);
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		System.out.println(c1.getColor());
		System.out.println(c1.isFilled());
		System.out.println(c1.getRadius());
		/*
		3) Downcast можно произвести, так как изначально был создан объект класса Circle.
		 */

		//Shape s2 = new Shape();
		/*
		4) Абстрактный класс не может содержать какие-либо объекты.
		 */

		Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // Upcast
		System.out.println(s3);
		System.out.println(s3.getArea());
		System.out.println(s3.getPerimeter());
		System.out.println(s3.getColor());
		//System.out.println(s3.getLength());
		/*
		5) Аналогично пункту 2.
		Метод getLength() содержится в классе-наследнике Rectangle,
		JVM не может его найти в классе Shape.
		 */

		Rectangle r1 = (Rectangle) s3; // downcast
		System.out.println(r1);
		System.out.println(r1.getArea());
		System.out.println(r1.getColor());
		System.out.println(r1.getLength());
		/*
		6) Аналогично пункту 3.
		 */

		Shape s4 = new Square(6.6); // Upcast
		System.out.println(s4);
		System.out.println(s4.getArea());
		System.out.println(s4.getColor());
		//System.out.println(s4.getSide());
		/*
		7) Аналогично пункту 2.
		 */

		// Take note that we downcast Shape s4 to Rectangle,
		// which is a superclass of Square, instead of Square
		Rectangle r2 = (Rectangle) s4;
		System.out.println(r2);
		System.out.println(r2.getArea());
		System.out.println(r2.getColor());
		//System.out.println(r2.getSide());
		System.out.println(r2.getLength());
		/*
		8) Downcast можно произвести, так как Square является наследником класса Rectangle.
		Однако вызов метода getSide() в данном случае невозможен, так как он находится в классе-наследнике Square,
		а суперкласс Rectangle о нём не знает.
         */

		// Downcast Rectangle r2 to Square
		Square sq1 = (Square) r2;
		System.out.println(sq1);
		System.out.println(sq1.getArea());
		System.out.println(sq1.getColor());
		System.out.println(sq1.getSide());
		System.out.println(sq1.getLength());
		/*
		9) Downcast можно произвести, так как Square является наследником класса Rectangle.
		 */
	}
}
