/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

import java.util.ArrayList;

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

//  Method for adding new employee to staff ArrayList
    public void addnewStaff(Employee newEmployee) {
        staff.add(newEmployee);
    }
    
//  Method for returning the number of items in staff ArrayList
    public int getStaffNumber() {
        return staff.size();
    }
}
