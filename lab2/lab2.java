package lab2;

import java.util.Scanner;

public class lab2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number, j = 1;
    long factorial1, factorial2 = 1;
    System.out.println("Enter positive digit less than 15: ");

    if (scanner.hasNextInt()) {
      number = scanner.nextInt();
    } else {
      System.out.println("Incorrect value. Try again");
      scanner.close();
      return;
    }
    if (number < 0 || number > 15)
      System.out.println("Incorrect number. Try again");

    factorial1 = number;
    for (int i = 1; i < number; i++) {
      factorial1 *= i;
    }

    while (j <= number) {
      factorial2 *= j;
      j++;
    }

    System.out.printf("Factorial 1 of %d! is %d%n", number, factorial1);
    System.out.printf("Factorial 2 of %d! is %d%n", number, factorial2);
    scanner.close();

  }
}
