/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeManager;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
    
    public String getCompanyName() {
        return companyName;
    }
    
//  Method for adding a new employee to staff ArrayList
    public boolean addnewStaff(Employee newEmployee) {
//        Check if new employee has a valid email address
        if (isValidEmail(newEmployee.getEmail())) {
//            Generate the employee number only if email is valid
            newEmployee.setEmpNum(Employee.nextEmpNum++);
//            Add Staff
            staff.add(newEmployee);
            return true;
        } else {
            System.out.println(newEmployee.getEmail() + " is an invalid email addess. Employee not added.");
            return false;
        } 
    }
//    Method for validating email addess
    private static boolean isValidEmail(String email) {
//        Regex string validation
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
//        Returns true if the email matches the patter object
        return matcher.matches();
    }
//    Method for removing staff
    public boolean removeStaff(int empNum) {
//        Iterator
        Iterator<Employee> iterator = staff.iterator();
        
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
//            Remove staff if employee is found
            if (employee.getEmpNum() == empNum) {
                iterator.remove();
                return true;
            }
        }
        return false;
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
        System.out.println("");
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
