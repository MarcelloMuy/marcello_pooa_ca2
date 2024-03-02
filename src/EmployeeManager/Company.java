/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeManager;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Marce
 */
public class Company {

//  Instance field for company name    
    private String companyName;

//  Create an ArrayList to store Employee objects 
    private ArrayList<Employee> staff = new ArrayList<>();

//  Default Constructor for initializing campanyName field
    public Company() {
        this.companyName = "Gnómes Ltd";
    }

//  Overloaded constructor with name value as parameter  
    public Company(String name) {
        this.companyName = name;
    }

//  Method for adding a new employee to staff ArrayList
    public void addnewStaff(Employee newEmployee) {
        staff.add(newEmployee);
    }

//  Method for returning the number of items in staff ArrayList
    public int getStaffNumber() {
        return staff.size();
    }

//    Uses an iterator to iterate the staff Arraylist, 
//    and return the name of employees with the employee number above a specific number
    public void listEmployees(int employeeNumber) {
//        Iterator
        Iterator<Employee> iterator = staff.iterator();

//        Will run until iterator has no more elements
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
//            If the employee number is above a specific number returns employee name
            if (employee.getEmpNum() > employeeNumber) {
                System.out.println("Name: " + employee.getName());
            }
        }
    }

    public void becomeManager(int empNum, String username, String password) {
//      Iterates through the staff
        Iterator<Employee> iterator = staff.iterator();

//      Boolean to control found and not found employees
        boolean found = false;

//      While loop to run until iterator has no more elements
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
//          Check for an employee with an specific number
            if (employee.getEmpNum() == empNum && empNum >= 1) {
//                If Employee is not a manager, give manager status
                if (!employee.isManager()) {
                    Manager manager = new Manager(employee.getName(), employee.getEmail(), username, password);

                    employee.setManager(manager);
                    System.out.println("Employee " + employee.getName() + " has manager status now.");
                } else {
                    System.out.println("Employee " + empNum + " has manager status already!");
                }
//                Flag that an employee was found and exit the loop
                found = true;
                break;
            }
        }
//        if employee is not found give helpfull message
        if (!found) {
            System.out.println("The employee " + empNum + " was not found.");
        }

    }

}
