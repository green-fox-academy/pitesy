import java.util.Arrays;

public class PrintAll {
  public static void main(String[] args) {

    int[] numbers = {4, 5, 6, 7};

    print(numbers);
  }

  public static void print (int[] number){
    System.out.print(Arrays.toString(number));
  }
}
