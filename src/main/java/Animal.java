public abstract class Animal extends Zoo {
    protected String animalType;
    protected String breatheSource;
    protected String movingSurface;
    protected String uniqueAction;

    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public void printAnimalNameBreatheAndMove() {
        printSeparator();
        printAnimalType();
        breathe();
        move();
        doSomething();
        printSeparator();
    }

    public void printAnimalType() {
        System.out.println(getAnimalType());
    }

    public void breathe() {
        System.out.println("breathes " + getBreatheSource());
    }

    public void move() {
        System.out.println("moving surface - " + getMovingSurface());
    }

    public void printSeparator() {
        System.out.println(SEPARATOR);
    }

    public void doSomething() {
        System.out.println(uniqueAction);
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getMovingSurface() {
        return movingSurface;
    }

    public String getBreatheSource() {
        return breatheSource;
    }
}
