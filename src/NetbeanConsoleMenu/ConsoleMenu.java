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
//      Calls the login method
        Manager managerlogin = login();

    }
//    Method for manager login
    private static Manager login() {
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

}
