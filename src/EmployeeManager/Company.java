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
    public String companyName;

//  Create an ArrayList to store Employee objects 
    ArrayList<Employee> staff = new ArrayList<>();

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
}
