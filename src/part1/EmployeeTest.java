/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package part1;

/**
 *
 * @author Marce
 */
// EmployeeTest Class creates 3 Employee objects,
// stores objects into an array and prints out the employee number
public class EmployeeTest {
//    Create 3 employee objects
    public static void main(String[] args) {
        Employee employeeJoe = new Employee("Joe Bloggs", "jb@gmail.com");
        Employee employeeAnn = new Employee("Ann Banana", "ab@gmail.com");
        Employee employeeTom = new Employee("Tom Thumb", "tt@gmail.com");

//    Array to store 3 employee objects
        Employee[] projectGroup = new Employee[3];  
        
//    Loads objects into the array
        projectGroup[0] = employeeJoe;
        projectGroup[1] = employeeAnn;
        projectGroup[2] = employeeTom;
        
//    Prints the value of the next employee number
        System.out.println(Employee.nextEmpNum);
    }
}
