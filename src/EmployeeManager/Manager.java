/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeManager;

/**
 *
 * @author Marce
 */
// A Manager Class that extends the Employee Class
public class Manager extends Employee {

//    Fields of the Manager Class
    private String username;
    private String password;

//    Constructor, initialize fields
    public Manager(String name, String email, String username, String password) {
        
//        "Super" access fields of parent class
        super(name, email);
        this.username = username;
        this.password = password;
    }
}
