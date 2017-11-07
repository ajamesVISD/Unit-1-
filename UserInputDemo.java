import java.util.Scanner;
import java.io.InputStream;

public class UserInput {
  private Scanner input;

  public UserInput() {
    input = new Scanner(System.in);
  }

  public UserInput(InputStream in) {
    input = new Scanner(in);
  }

  public String readLine(String prompt) {
    System.out.print(prompt);
    return input.nextLine();
  }

  public int readInt(String prompt) {
    System.out.print(prompt);
    return input.nextInt();
  }
}
