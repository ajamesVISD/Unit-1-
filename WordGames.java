import java.util.Scanner;

class WordGames {
  private Scanner input;

  public static void main(String[] args) {
    WordGames wg = new WordGames();
    String name = wg.readLine("Tell me your name: ");
    String insultedName = wg.insult(name);
    System.out.println(insultedName);

    String first = readLine("Give me a first word: ");
    String second = readLine("Give me a second word: ");
    System.out.println(makeAbba(first, second));
  }

  public WordGames() {
    input = new Scanner(System.in);
  }

  public static String readLine(String prompt) {
    System.out.print(prompt);
    return input.nextLine();
  }

  public static String insult(String n) {
    return n + ", you slimy weasel.";
  }

  public static String makeAbba(String a, String b) {
    return a + b + b + a;
  }
}
