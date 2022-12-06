import java.util.Scanner;

public class lab1_2 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Please, enter 4 int digits:");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int d = in.nextInt();
    int max;
    int count = 0;
    if (a >= b && a >= d && a >= c) max = a; else if (
      b >= a && b >= c && b >= d
    ) max = b; else if (c >= a && c >= b && c >= d) max = c; else max = d;
    if (a == max) count++;
    if (b == max) count++;
    if (c == max) count++;
    if (d == max) count++;
    System.out.printf("The amount of %d is %d", max, count);
  }
}
