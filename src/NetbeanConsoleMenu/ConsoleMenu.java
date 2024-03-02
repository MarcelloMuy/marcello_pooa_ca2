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

        if (managerlogin != null) {

//         Calls display menu method
//           While loop with switch cases for the menu options
            Scanner scanner = new Scanner(System.in);
            while (true) {
                displayMenu();
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
                        System.out.println("\nYou exit the program.");
                        System.exit(0);
                    default:
                        System.out.println("\ninvalid option. Please enter a valid option.");
                }
            }
        }

    }
//    Method for manager login

    public static Manager login(Company company) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the " + company.getCompanyName() + " manager menu!");
//        While loop to keep runing the menu if user type an invalid credential
        while (true) {            
            System.out.println("\nPlease type your credentials below or type 'exit' to exit the program");
//       Display message asking for Username
            System.out.println("Username: ");
            String username = scanner.nextLine();
//        Exit the program if user types exit
            if ("exit".equals(username)) {
                System.out.println("\nYou exit the program.");
                System.exit(0);
            }
//      Display message asking for Password
            System.out.println("Password: ");
            String password = scanner.nextLine();
//        Exit the program if user types exit
            if ("exit".equals(password)) {
                System.out.println("\nYou exit the program.");
                System.exit(0);
            }
//        Check if creditials are matching
            if ("Gnomeo".equals(username) && "smurf".equals(password)) {
//            Manager is logged in
                System.out.println("\nYou are logged in!");
                return new Manager("name", "email", username, password);
            } else {
//            Wrong or invalid credentials
                System.out.println("\nInvalid credentials. Please try again.");
            }
        }
    }

//    Method for displaying menu
    public static void displayMenu() {
//         Prints the manager menu
        System.out.println("\nStaff Manager Menu:");
        System.out.println("1. View current staff");
        System.out.println("2. Add new staff");
        System.out.println("3. Exit program");
    }
//    Method for adding new Staff

    public static void addNewStaff(Company company) {
        Scanner scanner = new Scanner(System.in);

//        Display menu messages for name and email
        System.out.println("Enter new employee name: ");
        String name = scanner.nextLine();
        System.out.println("Enter new employee email: ");
        String email = scanner.nextLine();

//        Create new employee
        Employee newEmployee = new Employee(name, email);

//        Add new employee
        boolean staffAddedSuccessfully = company.addnewStaff(newEmployee);

//       Display success message if boolean is true
        if (staffAddedSuccessfully) {
            System.out.println("\n" + newEmployee.getName() + " was added to the staff list!");
        } else {
//            Display failure message if boolean is false
            System.out.println("\nFailed to add " + newEmployee.getName() + ". Invalid email address.");
        }
    }

}
