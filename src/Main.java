import java.util.Arrays;
import java.util.Random;

public class Main {
  static Random random = new Random();

  public static void main(String[] args) {
    String[] firstNames = {"Bob", "Anna", "chris", "Michael", "kevin", "emmanuel", "Mercy"};

//  Set all names to uppercase
    Arrays.setAll(firstNames, (element) -> firstNames[element].toUpperCase());
    System.out.println(Arrays.toString(firstNames));

//  Added a random middle name initial to the names with a period
    Arrays.setAll(firstNames, (element) -> {
      String initial = "%c".formatted(random.nextInt(65, 91));
      return "%s %s.".formatted(firstNames[element], initial);
    });
    System.out.println(Arrays.toString(firstNames));


  }
}
