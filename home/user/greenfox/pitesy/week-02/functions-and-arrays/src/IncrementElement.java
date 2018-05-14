public class IncrementElement {

  public static void main(String[] args) {

    int[] t = {1, 2, 3, 4, 5};
    increment(t);
  }

  public static int[] increment(int[] number) {
    number[2] = number[2] + 1;
    System.out.println(number[2]);
    return number;
  }

}
