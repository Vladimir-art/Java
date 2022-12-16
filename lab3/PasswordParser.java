package lab3;

import java.util.Scanner;
import java.util.regex.*;

public class PasswordParser {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter password:");
    boolean isStrongPassw;
    String pattern = "^(?=.+\\d)(?=.+[a-z])(?=.+[A-Z])[a-zA-Z\\d_]{8,}$";
    Pattern regExp = Pattern.compile(pattern);

    do {
      String password = sc.nextLine();
      Matcher match = regExp.matcher(password);
      isStrongPassw = match.matches();
      if (!isStrongPassw) System.out.println(
        "Weak password, please enter again"
      );
    } while (!isStrongPassw);

    System.out.println("Strong password, thank you");

    sc.close();
  }
}
