public class Sum {

  public static void main(String[] args) {

    int a = 1;
    int b = 2;
    int c = 3;
    int d = 4;

    sum(a, b, c, d);

  }

  public static int sum(int... numbers) {
    int summary = 0;
    for (int number : numbers) {
      summary += number;
    }
    System.out.println(summary);
    return summary;
  }

}
