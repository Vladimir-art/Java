import java.util.Scanner;

public class lab1_3 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please, enter 5 int digits:");
    int a = in.nextInt();
    int b = in.nextInt();
    int c = in.nextInt();
    int d = in.nextInt();
    int e = in.nextInt();
    in.close();
    int max, min;
    if (a < b) {
      if (a < c) {
        if (a < d) {
          if (a < e) min = a; else min = e;
        } else {
          if (d < e) min = d; else min = e;
        }
      } else {
        if (c < d) {
          if (c < e) min = c; else min = e;
        } else {
          if (d < e) min = d; else min = e;
        }
      }
    } else {
      if (b < c) {
        if (b < d) {
          if (b < e) min = b; else min = e;
        } else {
          if (d < e) min = d; else min = e;
        }
      } else {
        if (c < d) {
          if (c < e) min = c; else min = e;
        } else {
          if (d < e) min = d; else min = e;
        }
      }
    }

    if (a > b) {
      if (a > c) {
        if (a > d) {
          if (a > e) max = a; else max = e;
        } else {
          if (d > e) max = d; else max = e;
        }
      } else {
        if (c > d) {
          if (c > e) max = c; else max = e;
        } else {
          if (d > e) max = d; else max = e;
        }
      }
    } else {
      if (b > c) {
        if (b > d) {
          if (b > e) max = b; else max = e;
        } else {
          if (d > e) max = d; else max = e;
        }
      } else {
        if (c > d) {
          if (c > e) max = c; else max = e;
        } else {
          if (d > e) max = d; else max = e;
        }
      }
    }
    System.out.println("The smallest of was entered digits is " + min);
    System.out.printf("The biggest of was entered digits is %d", max);
  }
}
