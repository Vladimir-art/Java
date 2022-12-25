package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySmooth_2 {

  private static void printArray(float[] array, int N) {
    for (int i = 0; i < N; i++) {
      System.out.println(array[i]);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter N size of array: ");
    int N = sc.nextInt();

    float[] array = new float[N];
    System.out.println("Enter a float arrays elements: ");
    for (int i = 0; i < N; i++) {
      array[i] = sc.nextFloat();
    }

    System.out.println("Array before smoothing: ");
    printArray(array, N);

    float tmpElement = 0;
    for (int i = 0; i < N; i++) {
      int count = i;
      if (i == 0) {
        tmpElement = array[i];
      } else {
        tmpElement += array[i];
        array[i] = tmpElement / ++count;
      }
    }
    System.out.println("Array after smoothing: ");
    printArray(array, N);

    sc.close();
  }
}
