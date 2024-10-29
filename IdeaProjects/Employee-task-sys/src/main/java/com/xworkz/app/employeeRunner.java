package com.xworkz.app;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class employeeRunner {

    public static void main(String[] args) {
            List<Employee> list = new ArrayList<>();

            Employee employee = new Employee(1,"chin",56800.00,"clerk","O+ve");
            Employee employee1 = new Employee(2,"prema",78000.00,"Manager","AB+ve");
            Employee employee2 = new Employee(3,"shree",56000.00,"HR","A-ve");
            Employee employee3 = new Employee(4,"swathi",30000.00,"R&D","A+ve");
            Employee employee4 = new Employee(5,"dinesh",25000.00,"Quality","A+ve");
            Employee employee5 = new Employee(6,"bhasker",18000.00,"Production","B+ve");
            Employee employee6 = new Employee(7,"bhavish",35000.00,"Audit","O+ve");
            Employee employee7 = new Employee(8,"bhairesh",29000.00,"SaleMan","O+ve");
            Employee employee8 = new Employee(9,"kiran",30000.00,"Marketing","AB-ve");
            Employee employee9 = new Employee(10,"kavya",25000.00,"Finance","AB+ve");
            Employee employee10 = new Employee(11,"gopi",10000.00,"clerk","B-ve");
            Employee employee11 = new Employee(12,"jeevan",18000.00,"Production","B+ve");
            Employee employee12 = new Employee(13,"preethi",29000.00,"Sales","O-ve");

            list.add(employee);
            list.add(employee1);
            list.add(employee2);
            list.add(employee3);
            list.add(employee4);
            list.add(employee5);
            list.add(employee6);
            list.add(employee7);
            list.add(employee8);
            list.add(employee8);
            list.add(employee9);
            list.add(employee10);
            list.add(employee11);
            list.add(employee12);

       // 1) fetch employee's second highest salary
    System.out.println(list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst());

       // 2) given 11 employee of collection fetch all those employee whose salary is greater than 25000
    System.out.println(list.stream().filter(salary-> salary.getSalary() > 25000).collect(Collectors.toList()));

      //  3) fetch only those employee whose name startsWith B
     System.out.println(list.stream().filter(ref -> ref.getName().startsWith("b")).collect(Collectors.toList()));


     

//        4.employee with duplicate names

        }

    }
