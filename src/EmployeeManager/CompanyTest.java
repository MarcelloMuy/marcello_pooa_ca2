/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EmployeeManager;

/**
 *
 * @author Marce
 */
public class CompanyTest {

    public static void main(String[] args) {

//        Test company New company
        Company company = new Company("Test Company");

//        Test add new staff
        company.addnewStaff(new Employee("Bob Marley", "bm@gmail.com"));
        company.addnewStaff(new Employee("Mark Cuban", "mc@gmail.com"));

//        Test get staff number
        System.out.println("Number of employees: " + company.getStaffNumber());

//        Test listEmployees, return all employees with employee number above 1
        company.listEmployees(1);
    }

}
