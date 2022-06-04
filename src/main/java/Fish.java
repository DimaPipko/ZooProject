public abstract class Fish extends Animal {
    public Fish(String animalType) {
        super(animalType);
        movingSurface = AnimalMoveAndBreathe.FISH_MOVE;
        breatheSource = AnimalMoveAndBreathe.FISH_BREATHE;
    }
}
