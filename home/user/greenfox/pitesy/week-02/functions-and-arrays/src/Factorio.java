public class Factorio {

  public static void main(String[] args) {

    int input = 5;
    System.out.println(factorio(input));
  }

  public static int factorio(int number) {
    int sum = 1;
    for (int i = 1; i <= number; i++) {
      sum = sum * i;
    }
    return sum;
  }
}