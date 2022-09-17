package ua.hillelit.lms.homeWork;

import ua.hillelit.lms.homeWork.exceptions.ArrayDataException;
import ua.hillelit.lms.homeWork.exceptions.ArraySizeException;

public class ArrayValueCalculator {

  public static void main(String[] args) {

    String[][] strArr = {{"1", "2", "3", "4"}, {"2"}, {"3", "5", "8", "9", "777", "888"}, null};

    try {
      int sumArr = doCalc(strArr);
      System.out.println("Sum Integer in array = " + sumArr);
    } catch (ArraySizeException | ArrayDataException e) {
      System.out.println(e.getMessage());
    }

  }

  public static int doCalc(String[][] strArr) throws ArraySizeException {

    if (strArr == null || strArr.length != 4) {
      throw new ArraySizeException(4, 4);
    }

    int sum = 0;

    for (int i = 0; i < strArr.length; i++) {
      for (int j = 0; j < strArr[i].length; j++) {

        if (strArr[i].length != 4) {
          throw new ArraySizeException(4, 4);
        }

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
