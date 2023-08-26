package com.teachmeskills.lesson8.part1;


/**
 * I cycled through the array and for each figure from the array I displayed the area on the screen
 * Displayed the sum of the perimeter of all the shapes in the array.
 */
public class Runner {
    public static void main(String[] args) {
        Figure[] arrayFigures = new Figure[5];
        arrayFigures[0] = new Triangle(3.0, 3.0, 3.0);
        arrayFigures[1] = new Rectangle(4.0, 8.0);
        arrayFigures[2] = new Circle(2.0);
        arrayFigures[3] = new Rectangle(9.0, 6.0);
        arrayFigures[4] = new Triangle(6.0, 8.0, 10.0);

        double totalPerimeter = 0.0;

        for (Figure i : arrayFigures) {
            double area = i.getArea();
            System.out.println("The area of the figure: " + area);

            double perimeter = i.getPerimeter();

            totalPerimeter += perimeter;
        }

        System.out.println("Sum of the perimeters of all shapes: " + totalPerimeter);
    }
}
