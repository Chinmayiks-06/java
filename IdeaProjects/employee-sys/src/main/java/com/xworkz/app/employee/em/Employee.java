package com.xworkz.app.employee.em;

public class Employee implements EmployeeI{
    private String employeeName;
    private double[] salaries;

    public Employee(String employeeName, double[] salaries) {
        this.employeeName = employeeName;
        this.salaries = salaries;
    }

    public double getAverageSalary() {
        double sum = 0;
        for (double salary : salaries) {
            sum += salary;
        }
        return sum / salaries.length;
    }

    public double getHighestSalary() {
        double highest = salaries[0];
        for (double salary : salaries) {
            if (salary > highest) {
                highest = salary;
            }
        }
        return highest;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public static void main(String[] args) {
        double[] salaries = {55000, 60000, 62000, 58000, 64000};

        Employee emp = new Employee("Chinmayi", salaries);

        System.out.println("Employee Name: " + emp.getEmployeeName());
        System.out.println("Average Salary: " + emp.getAverageSalary());
        System.out.println("Highest Salary: " + emp.getHighestSalary());
    }
}

