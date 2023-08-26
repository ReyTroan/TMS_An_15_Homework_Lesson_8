package com.teachmeskills.lesson8.part1;

/**
 * I wrote a hierarchy of "Figure" classes.
 * Made the Shape class abstract, added abstract methods for calculating the area of the shape and perimeter.
 */
sealed abstract class Figure permits Triangle, Rectangle, Circle {
    public abstract double getArea();
    public abstract double getPerimeter();
}

final class Triangle extends Figure {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        double x = (a + b + c) / 2;
        return Math.sqrt(x * (x - a) * (x - b) * (x - c));
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}

final class Rectangle extends Figure {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

final class Circle extends Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}