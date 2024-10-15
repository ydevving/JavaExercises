package Day27;

import java.util.Scanner;
import Day27.WrongPasswordException;

public class PasswordValidator {

    String password;

    private PasswordValidator(String password) {
        this.password = password;
    }

    public static boolean validate(String password) {
        if (!(password.length() >= 6 && password.length() <= 13))
            return false;

        int checked = 0;
        int letters = 0;
        for (char ch : password.toCharArray()) {

            if (ch == 'T' || ch == '&')
                return false;

            if (Character.isAlphabetic(ch))
                letters += 1;

            if ((Character.isUpperCase(ch) || Character.isLowerCase(ch) || Character.isDigit(ch)) && checked < 3)
                checked += 1;
        }

        if (!(letters >= 6 && letters <= 13))
            return false;

        if (checked < 3)
            return false;

        return true;
    }

    public static PasswordValidator create(String password) throws WrongPasswordException {
        if (!PasswordValidator.validate(password))
            throw new WrongPasswordException("Passwords follows wrong format!");

        return new PasswordValidator(password);
    }

    public static void body() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Password format - 6-13 letters, atleast 1 lower- and uppercase letter, atleast 1 digit\npassword cannot contain capital T or &\n");
        System.out.println("Continously enter new passwords to test validity!\n");

        while (true) {
            String password = sc.nextLine();

            boolean validation = PasswordValidator.validate(password);

            if (validation == true)
                System.out.println("Password is allowed to be used!");
            else
                System.out.println("Password is invalid croski...");
        }
    }
}
