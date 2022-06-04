public abstract class Beast extends Animal {
    public Beast(String animalType) {
        super(animalType);
        breatheSource = AnimalMoveAndBreathe.BEAST_BREATHE;
    }
}
