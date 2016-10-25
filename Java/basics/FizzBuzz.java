public class FizzBuzz {

  public static void main (String[] args) {

    int x = 1;

    while (x <= 100) {

      if (x % 15 == 0) {

        System.out.println("FizzBuzz");

      } else if (x % 5 == 0) {

        System.out.println("Buzz");

      } else if (x % 3 == 0) {

        System.out.println("Fizz");

      } else {

        System.out.println(x);

      }

      x += 1;

    }
  }

}
