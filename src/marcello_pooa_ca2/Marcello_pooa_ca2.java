/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package marcello_pooa_ca2;

import EmployeeManager.*;
import java.util.Scanner;

/**
 *
 * @author Marce
 */
public class Marcello_pooa_ca2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Manager managerlogin = login();

    }

    private static Manager login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        String username = scanner.nextLine();

        System.out.println("Password: ");
        String password = scanner.nextLine();

        if ("Gnomeo".equals(username) && "smurf".equals(password)) {
            System.out.println("You are logged in!");
            return new Manager("name", "email", username, password);
        } else {
            System.out.println("Invalid credentials. Exiting...");
            return null;
        }

    }

}
