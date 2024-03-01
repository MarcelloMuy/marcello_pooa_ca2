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

//        Test create a new company
        Company company = new Company("Test Company");

//        Test add new staff
        company.addnewStaff(new Employee("Bob Marley", "bm@gmail.com"));
        company.addnewStaff(new Employee("Mark Cuban", "mc@gmail.com"));
        company.addnewStaff(new Employee("Elon Musk", "em@gmail.com"));

//        Test get staff number
        System.out.println("Number of employees: " + company.getStaffNumber());

//        Test listEmployees, return all employees with employee number above 1
        company.listEmployees(1);

        company.becomeManager(3, "Gnomeo", "smurf");
    }

}
