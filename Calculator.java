import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please type a number and I will tell you if it is even: ");
    int userNum = input.nextInt();
    System.out.println(userNum + " is even: " + isEven(userNum));
    System.out.println("8 is divisible by 5: " + isDivisibleBy(8,5));
  }

  /**
   * Returns true is a given number is even, false if it is not.
   **/
  public static boolean isEven(int n) {
    return (n % 2 == 0);
  }

  /**
   * Given two numbers, returns true if the first is divisible by the second.
   * @param num The number to be divided.
   * @param divisor The number to divide by.
   * @return True if num is divisible by divisor, false otherwise.
   **/
  public static boolean isDivisibleBy(int num, int divisor) {
    return (num % divisor == 0);
  }
}
