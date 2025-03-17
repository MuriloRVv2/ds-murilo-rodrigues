package Aula3;
import java.util.Scanner;

public class input {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = input.nextLine();
        System.out.println("Username is: " + username);

    }

}
