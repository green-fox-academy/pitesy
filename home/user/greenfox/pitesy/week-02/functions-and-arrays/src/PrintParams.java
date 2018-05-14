public class PrintParams {
  public static void main(String[] args) {

    String[] array = {"first", "second", "third", "fourth"};

    printParams(array);

  }

  public static void printParams(String[] text) {
    for (int i = 0; i < text.length; i++) {
      System.out.print (text[i] + " ");
    }
  }
}

