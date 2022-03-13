package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        // 1.Create a class named "Student" containing  variable String  'name' and  integer variable 'number'.
        //    //Assign the value of number =2 and value of name is "Petr" by creating an object of the class Student
        //    //Create two more objects of the class Student
        Student student1 = new Student();
        student1.name = "Peter";
        student1.number = 2;

        Student student2 = new Student();
        student2.name = "Ivan";
        student2.number = 3;

        System.out.println("Task 2 and 3");
        //2.Write a program to print perimeter of a triangle with sides 3,4,5 by creating
        // a class 'Triangle' without
        // any parameter in constructor

        // 3.Write a program to print area and  perimeter
        //   of a triangle with sides 3,4,5 by creating a
        //   class 'Triangle' with constructor having the three sides as its parameters
        Triangle triangle1 = new Triangle(3, 4, 5);
        // triangle1.a = 3;
        //triangle1.b = 4;
        //triangle1.c = 5;

        System.out.println("Perimeter of a triangle is " + triangle1.getPerimeter());

        System.out.println("Task 4");
        //4.Write a program to print the area and perimeter of a rectangle by
        // creating a class named "Rectangle" .
        //Create methods getArea and getPerimeter to calculate area and perimeter in that class.
        // Length and breadth
        // should be variables of the class passed via constructor.
        // Create two objects with sides(4,5) and (5,8) and
        // calculate their perimeter and area
        Rectangle rectangle1 = new Rectangle(4, 5);
        Rectangle rectangle2 = new Rectangle(5, 8);

        System.out.println("Perimeter of a rectangle1 is " + rectangle1.getPerimeterOfRectangle());
        System.out.println("Area of a rectangle1 is " + rectangle1.getAreaOfRectangle());
        System.out.println("Perimeter of a rectangle2 is " + rectangle2.getPerimeterOfRectangle());
        System.out.println("Area of a rectangle2 is " + rectangle2.getAreaOfRectangle());

        System.out.println("Task 5");
        //5. Print the average of three numbers by creating a class named "Average" having a method to calculate and
        // print the average. The class should have a constructor

        Average average = new Average(1,2,3);
        System.out.println(average.average());

        //6, Write a program by creating an "Employee" class having the following methods and print the final salary.
        // - constructor which accepts the salary, numbers of employee's working hours  per day as parameters
        // - 'addSalary()' method which adds $10 to the salary of the employee if it is less than $500
        // - "addWork()" method which adds $5 to the employee's salary if the number of working hours per day is
        // more than 6 hours

    }
}
