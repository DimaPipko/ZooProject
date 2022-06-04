public abstract class LandBeast extends Beast {
    public LandBeast(String animalType) {
        super(animalType);
        movingSurface = AnimalMoveAndBreathe.LAND_BEAST_MOVE;
    }
}
