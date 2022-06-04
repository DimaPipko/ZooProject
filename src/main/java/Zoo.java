import java.util.ArrayList;

public class Zoo {
    private final ArrayList<Animal> zoo = new ArrayList<>();
    public static final String SPACE = " ";
    public static final String SEPARATOR = "===========================================";


    public void addAnimal(Animal animal) {
        zoo.add(animal);
    }

    public void printAllAnimal() {
        int counter = 0;
        for (Animal animal : zoo) {
            counter++;
            System.out.println(counter + SPACE + animal.getAnimalType());
        }
    }

    public Animal getAnimalByIndex(int index) {
        return zoo.get(index - 1);
    }

    public int getArrayLength() {
        return zoo.size();
    }
}
