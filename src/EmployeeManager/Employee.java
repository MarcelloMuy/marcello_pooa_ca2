package EmployeeManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marce
 */

// Employee Class represents an employee with atributes name, email and employee number.
// Each employee is assigned a unique employee number
public class Employee {

// Instance fields    
    public String name;
    public String email;
    public int empNum;

// Static field   
    public static int nextEmpNum = 1;

// Constructuor for default values
    public Employee() {
        this.name = "Employee Name";
        this.email = "employee@email.com";
    }
    
// Constructor for initializing fields with values passed as parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }

// Methods for getting name, email and empNum
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
    
    public int getEmpNum() {
        return empNum;
    }
}
