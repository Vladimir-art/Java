package lab4;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySmooth {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String strArr = "";
    System.out.println("Enter a float array util write 'quit'");

    while (!sc.hasNext("quit")) {
      if (sc.hasNextFloat()) {
        strArr =
          strArr.equals("")
            ? (strArr + sc.nextFloat())
            : (strArr + "," + sc.nextFloat());
      } else {
        System.out.println("Error type!");
        sc.next();
      }
    }

    String[] parsedStrArr = strArr.split(",");
    float[] parsedFloatArr = new float[parsedStrArr.length];

    System.out.println("Array before smoothing: ");
    for (int i = 0; i < parsedStrArr.length; i++) {
      parsedFloatArr[i] = Float.valueOf(parsedStrArr[i]);
      System.out.println(parsedFloatArr[i]);
    }

    float avarageNum = 0;
    System.out.println("Array after smoothing: ");
    for (int j = 0; j < parsedFloatArr.length; j++) {
      int counter = j;
      if (j == 0) {
        avarageNum = parsedFloatArr[j];
      } else {
        avarageNum += parsedFloatArr[j];
        parsedFloatArr[j] = avarageNum / ++counter;
      }
      System.out.println(parsedFloatArr[j]);
    }

    sc.close();
  }
}
