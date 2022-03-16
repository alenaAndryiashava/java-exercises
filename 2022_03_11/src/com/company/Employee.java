package com.company;
//6, Write a program by creating an "Employee" class having the following methods
// and print the final salary.
// - constructor which accepts the salary, numbers of employee's working hours  per day as parameters
// - 'addSalary()' method which adds $10 to the salary of the employee if it is less than $500
// - "addWork()" method which adds $5 to the employee's salary if the number of working hours per day is
// more than 6 hours

public class Employee {
    int salary;
    int hours;

    public Employee(int salary, int hours) {
        this.salary = salary;
        this.hours = hours;
    }

    public int addSalary(int bonus) {
        if (this.salary < 500)
            return bonus;
        else
            return 0;
    }

    public int addWork(int bonus){
        if(this.hours>6)
            return bonus;
        else
            return 0;
    }
    public  int finalSalary(){
       return this.salary + addSalary(10)+addWork(5);

    }


    public void printFinalSalary() {
        System.out.println("Employee: " +
                "salary = " + salary +
                " hours = " + hours +
                 " -> final salary = "+finalSalary());
    }
}

