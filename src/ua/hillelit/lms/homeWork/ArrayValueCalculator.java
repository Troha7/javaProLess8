package ua.hillelit.lms.homeWork;

import ua.hillelit.lms.homeWork.exceptions.ArrayDataException;
import ua.hillelit.lms.homeWork.exceptions.ArraySizeException;

public class ArrayValueCalculator {

  public static void main(String[] args) {

    String[][] strArr = { {"1", "1", "1", "1"},
                          {"2", "2", "2", "2"},
                          {"3", "3", "3", "3"},
                          {"4", "4", "4", "4"} };

    try {
      int sumArr = doCalc(strArr);
      System.out.println("Sum Integer in array = " + sumArr);
    } catch (ArraySizeException | ArrayDataException e) {
      System.out.println(e.getMessage());
    } catch (NullPointerException e) {
      System.out.println("Input array: [null]");
    }

  }

  public static int doCalc(String[][] strArr) throws ArraySizeException {

    if (strArr[0].length != 4 || strArr.length != 4) {
      throw new ArraySizeException(4, 4);
    }

    int sum = 0;
    int len = strArr.length;

    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {

        try {
          sum += Integer.parseInt(strArr[i][j]);
        } catch (NumberFormatException e) {
          System.out.println("[" + strArr[i][j] + "] cannot be parsed to Integer!");
          throw new ArrayDataException(i, j);
        }

      }
    }
    return sum;

  }

}
