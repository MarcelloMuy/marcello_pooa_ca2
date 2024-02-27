package part1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Marce
 */
public class Employee {
    
    private String name;
    private String email;
    private int empNum;
    
    private static int nextEmpNum = 1;
    
    public Employee() {
        this.name = "Employee Name";
        this.email = "employee@email.com";
    }
    
    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
        this.empNum = nextEmpNum++;
    }

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
