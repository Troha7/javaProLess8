package ua.hillelit.lms.homeWork.exceptions;

public class ArraySizeException extends ArrayIndexOutOfBoundsException {

  public ArraySizeException(int index1, int index2) {
    super("Array size is not equal [" + index1 + "][" + index2 + "]");
  }

}
