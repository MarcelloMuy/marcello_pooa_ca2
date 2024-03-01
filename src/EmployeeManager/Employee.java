package EmployeeManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Marce
 */
// Employee Class represents an employee with attributes name,
// email and employee number.
// Each employee is assigned a unique employee number
public class Employee {

// Instance fields for all employees   
    public String name;
    public String email;
    public int empNum;
//  Instance field for manager
    private Manager manager;

// Static field   
    public static int nextEmpNum = 1;

// Constructor for default values
    public Employee() {
        this.name = "Employee Name";
        this.email = "employee@email.com";
//  Manager is set null as default
        this.manager = null;
    }

// Constructor for initializing fields with values passed as parameters
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }
//    constructor for initializing employee manager 

    public Employee(String name, String email, Manager manager) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
        this.manager = manager;
    }

// Methods for getting a name, email and empNum
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getEmpNum() {
        return empNum;
    }

//    Check if employee is a manager
    public boolean isManager() {
        return manager != null;
    }

//    Method for getting manager
    public Manager getManager() {
        return manager;
    }

//    Method for setting employee a manager
    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
