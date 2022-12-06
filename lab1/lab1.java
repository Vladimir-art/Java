import java.util.Scanner;

public class lab1 {

  public static void main(String[] args) {
    Scanner console = new Scanner(System.in);
    System.out.println("Please, enter 4 int digits:");
    int a = console.nextInt();
    int b = console.nextInt();
    int c = console.nextInt();
    int d = console.nextInt();
    int small;
    if (a < b) {
      if (a < c) {
        if (a < d) {
          small = a;
        } else {
          small = d;
        }
      } else {
        if (c < d) small = c; else small = d;
      }
    } else {
      if (b < c) {
        if (b < d) {
          small = b;
        } else {
          small = d;
        }
      } else {
        if (c < d) {
          small = c;
        } else {
          small = d;
        }
      }
    }
    System.out.printf("The smallest of was entered digits is %d", small);
  }
}
