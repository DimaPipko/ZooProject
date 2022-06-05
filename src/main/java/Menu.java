import java.util.Scanner;

public class Menu {


    public void printMenu(Zoo zoo) {
        Scanner scanner = new Scanner(System.in);
        int menuItem = -1;
        while (menuItem != 0) {
            zoo.printAllAnimal();
            String input = scanner.next();
            try {
                menuItem = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(Zoo.SEPARATOR);
                System.out.println("Only numbers from 0 to " + zoo.getArrayLength() + " are allowed.");
                System.out.println(Zoo.SEPARATOR);
                continue;
            }

            if (menuItem == 0) {
                System.out.println(Zoo.SEPARATOR);
                System.out.println("Bye!");
                System.out.println(Zoo.SEPARATOR);
            } else {
                try {
                    zoo.getAnimalByIndex(menuItem).printAnimalNameBreatheAndMove();
                } catch (IndexOutOfBoundsException e) {
                    System.out.println(Zoo.SEPARATOR);
                    System.out.println("Only numbers from 0 to " + zoo.getArrayLength() + " are allowed.");
                    System.out.println(Zoo.SEPARATOR);
                }
            }
        }
    }
}
