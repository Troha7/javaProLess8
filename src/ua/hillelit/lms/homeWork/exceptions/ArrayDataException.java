package ua.hillelit.lms.homeWork.exceptions;

public class ArrayDataException extends NumberFormatException {

  public ArrayDataException(int index1, int index2) {
    super("Twu-Dimension Array index: [" + index1 + "][" + index2 + "]");
  }

}
