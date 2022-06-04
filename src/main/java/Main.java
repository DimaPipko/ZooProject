public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear("Panda");
        Pigeon pigeon = new Pigeon("Woodpigeon");
        Carp carp = new Carp("Carp");
        Fox fox = new Fox("Fox");
        GoldenFish goldenFish = new GoldenFish("Golden Fish");
        Hedgehog hedgehog = new Hedgehog("Hedgehog");
        Peacock peacock = new Peacock("Peacock");
        Zoo zoo = new Zoo();
        zoo.addAnimal(bear);
        zoo.addAnimal(pigeon);
        zoo.addAnimal(carp);
        zoo.addAnimal(fox);
        zoo.addAnimal(goldenFish);
        zoo.addAnimal(hedgehog);
        zoo.addAnimal(peacock);
        Menu menu = new Menu();
        menu.printMenu(zoo);

    }
}