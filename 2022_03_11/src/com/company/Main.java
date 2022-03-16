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
        System.out.println(average);

        System.out.println("Task 6");
        Employee employee1 = new Employee(600,6);
        Employee employee2 = new Employee(499,7);
        Employee employee3 = new Employee(800,9);
        employee1.printFinalSalary();
        employee2.printFinalSalary();
        employee3.printFinalSalary();

        System.out.println("Task 7");
        int a = 5;
        int b = 10;
        System.out.println(Calculator.plus(a,b));
        System.out.println(Calculator.minus(a,b));
        System.out.println(Calculator.divide(a,b));
        System.out.println(Calculator.multiply(a,b));
        System.out.println(Calculator.percent(a,b));

        System.out.println("Task 8");
        MaxElementCalculater maxElementCalculater = new MaxElementCalculater(new int[]{-23,45,0,-30,49,77});
        maxElementCalculater.printMaxElement();

    }

}
