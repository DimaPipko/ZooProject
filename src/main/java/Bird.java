public abstract class Bird extends Beast {
    public Bird(String animalType) {
        super(animalType);
        movingSurface = AnimalMoveAndBreathe.BIRD_MOVE;
    }
}
