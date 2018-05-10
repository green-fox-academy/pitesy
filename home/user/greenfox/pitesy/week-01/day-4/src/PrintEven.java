public class PrintEven {
  public static void main(String[] args) {
    int number = 0;
    while (number < 500) {
      number++;
      if (number % 2 == 0) {
       System.out.println(number);
      }
    }

    //for (int number = 0; number < 500; number++) {
    //  if (number % 2 == 0) {
    //    System.out.println(number);
    //  }
    //}

  }
}

