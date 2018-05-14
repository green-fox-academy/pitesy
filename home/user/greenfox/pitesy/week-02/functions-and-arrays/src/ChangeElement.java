public class ChangeElement {

  public static void main(String[] args) {

    int[] s = {1, 2, 3, 8, 5, 6};
    swap(s);
  }

  public static int[] swap(int[] number) {
    number[3] = 4;
    System.out.println(number[3]);
    return number;
  }
}
