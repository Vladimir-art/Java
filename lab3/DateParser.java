package lab3;

import java.util.Scanner;
import java.util.regex.*;

public class DateParser {

  private static void showError(String data, String message, Scanner sc) {
    System.out.println(message + data);
    sc.close();
    return;
  }

  private static boolean correctMonthAndDay(String str) {
    String[] splitDate = str.split("/");
    int day = Integer.parseInt(splitDate[0]);
    int month = Integer.parseInt(splitDate[1]);
    switch (month) {
      case 2:
        return day > 0 && day < 29;
      case 4:
      case 6:
      case 9:
      case 11:
        return day > 0 && day < 31;
      default:
        return true;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String pattern =
      "^(0[1-9]|[12]\\d|3[01])\\/(0[1-9]|1[0-2])\\/(19\\d\\d|[2-9]\\d\\d\\d)$";
    String s1 = sc.nextLine();

    Pattern p = Pattern.compile(pattern);
    Matcher match = p.matcher(s1);

    boolean isMatch = match.matches();

    if (!isMatch) {
      showError(s1, "No matches ", sc);
      return;
    }

    boolean isCorrectAmountDays = correctMonthAndDay(s1);

    if (!isCorrectAmountDays) {
      showError(s1, "Not valid date: ", sc);
      return;
    }

    System.out.println("Valid date: " + s1);
    sc.close();
  }
}
