package com.company;

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

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", hours=" + hours +
                '}' + " -> final salary = "+finalSalary();
    }
    public void print(){
        System.out.println(this.toString());
    }
}

