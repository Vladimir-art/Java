package lab2;

import java.util.Scanner;

public class lab2_2 {

  private static void printWarningMessage(Scanner scanner) {
    while (!scanner.hasNextInt()) {
      System.out.println("Incorrect value. Try again");
      scanner.next();
    }
  }

  private static int fastPower(int x, int n) {
    int tempX = x, tempN = n, result = 1;
    while (tempN > 0) {
      if (tempN % 2 == 1) {
        result *= tempX;
      }
      tempX *= tempX;
      tempN /= 2;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int power;
    System.out.println("Enter integer number - x:");
    printWarningMessage(scanner);
    int x = scanner.nextInt();

    System.out.println("Enter integer number - n:");
    printWarningMessage(scanner);
    int n = scanner.nextInt();

    if (n < 0 || n > 15) {
      System.out.println("Enter digit from 0 to 15");
      scanner.close();
      return;
    }

    power = fastPower(x, n);

    System.out.println("Answer is: " + power);
    scanner.close();
  }
}
