/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NetbeanConsoleMenu;

import EmployeeManager.*;
import java.util.Scanner;

/**
 *
 * @author Marce
 */
public class ConsoleMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//      Create company with deafult values
        Company company = new Company();

//        Add employees to staff list
        company.addnewStaff(new Employee("Joe Bloggs", "jb@gmail.com"));
        company.addnewStaff(new Employee("Ann Banana", "ab@gmail.com"));
        company.addnewStaff(new Employee("Tom Thumb", "tt@gmail.com"));
        company.addnewStaff(new Employee("Bob Marley", "bm@gmail.com"));
        company.addnewStaff(new Employee("Mark Cuban", "mc@gmail.com"));
        company.addnewStaff(new Employee("Elon Musk", "em@gmail.com"));

//      Calls the login method
        Manager managerlogin = login(company);
        
        if (managerlogin !=null){
            
//            Prints the manager menu
            System.out.println("\nStaff Manager Menu:");
            System.out.println("1. View current staff");
            System.out.println("2. Add new staff");
            System.out.println("3. Exit program");
            
//           While loop with switch cases for the menu options
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("Choose option: 1, 2 or 3 ");
                int option = scanner.nextInt();
                switch (option) {
//                    Display list of employees that have employee number above 0
                    case 1:
                        company.listEmployees(0);
                        break;
                    case 2:
//                        Calls method for adding new staff
                        addNewStaff(company);
                        break;
//                        Invalid option trigers the default message
                    case 3:
//                        Option for exiting the program
                        System.out.println("You extit the program.");
                        System.exit(0);
                    default:
                        System.out.println("invalid option. Please enter a valid option.");
                }
            }
        }

    }
//    Method for manager login

    public static Manager login(Company company) {
        
        System.out.println("Welcome to the " + company.getCompanyName() + " manager menu!");
        System.out.println("Please type your credentials below");
//       Display message asking for Username
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String username = scanner.nextLine();
//      Display message asking for Password
        System.out.println("Password: ");
        String password = scanner.nextLine();
//        Check if creditials are matching
        if ("Gnomeo".equals(username) && "smurf".equals(password)) {
//            Manager are logged in
            System.out.println("You are logged in!");
            return new Manager("name", "email", username, password);
        } else {
//            Wrong or invalid credentials
            System.out.println("Invalid credentials. Exiting...");
            return null;
        }
    }
//    Method for adding new Staff
    public static void addNewStaff(Company company) {
        Scanner scanner= new Scanner(System.in);
//        Display menu messages for name and email
        System.out.println("Enter new employee name: ");
        String name = scanner.nextLine();
        
        System.out.println("Enter new employee email: ");
        String email = scanner.nextLine();
//        Create new employee
        Employee newEmployee = new Employee(name, email);
//        Add new employee
        company.addnewStaff(newEmployee);
//        Display success message
        System.out.println(name + " was added to the staff list!");
    }

}
