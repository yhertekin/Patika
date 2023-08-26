import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String username, password;
        int selection;
        String defaultUsername = "username";
        String defaultPassword = "password";

        Scanner input = new Scanner(System.in);

        System.out.print("Username: ");
        username = input.nextLine();

        System.out.print("Password: ");
        password = input.nextLine();

        if(username.equals(defaultUsername) && password.equals(defaultPassword)){
            System.out.println("1-Change username\n2-Change password\n3-Continue");
            selection = input.nextInt();
            input.nextLine();
            switch (selection) {
                case 1 -> {
                    while (true) {
                        System.out.print("Enter username (Cannot use default username): ");
                        username = input.nextLine();
                        if (username.equals(defaultUsername)) {
                            continue;
                        }
                        System.out.println("Username updated to : " + username);
                        break;

                    }
                }
                case 2 -> {
                    while (true) {
                        System.out.print("Enter password (Cannot use default password): ");
                        password = input.nextLine();
                        if (password.equals(defaultPassword)) {
                            continue;
                        }
                        System.out.println("Password updated to : " + password);
                        break;

                    }
                }
            }
            System.out.println("Welcome " + username);
        }
        else {
            System.out.println("Wrong username or password!");
        }
    }
}