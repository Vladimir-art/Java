import java.util.Scanner;

public class lab1_4 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a number of month: ");
    int month = in.nextInt();
    in.close();
    if (month < 1 || month > 12) {
      System.out.printf("Enter number from 1 to 12");
      return;
    }
    switch (month) {
      case 12:
      case 1:
      case 2:
        System.out.println("It is Winter");
        break;
      case 3:
      case 4:
      case 5:
        System.out.println("It is Spring");
        break;
      case 6:
      case 7:
      case 8:
        System.out.println("It is Summer");
        break;
      case 9:
      case 10:
      case 11:
        System.out.println("It is Autumn");
        break;
    }
  }
}
