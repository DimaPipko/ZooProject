import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.util.NoSuchElementException;

public class ZooTest {

    @Test(groups = "negative", expectedExceptions = NoSuchElementException.class)
    public void menuExceptionTest() {
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        Main.main(null);
    }

    @Test(groups = "positive")
    public void compareTwoDifferentAnimalTest() {
        GoldenFish goldenFish = new GoldenFish("Golden fish");
        Bear bear = new Bear("Golden fish");
        Assert.assertNotEquals(goldenFish, bear);
    }

    @Test(groups = "negative")
    public void compareAnimalTypeTest() {
        GoldenFish goldenFish = new GoldenFish("Golden fish");
        Bear bear = new Bear("Panda");
        Assert.assertNotSame(goldenFish.getAnimalType(), bear.getAnimalType());
    }

    @Test(groups = "positive")
    public void bearNotBreatheWaterTest() {
        Bear bear = new Bear("Panda");
        GoldenFish goldenFish = new GoldenFish("GF");
        Assert.assertEquals(bear.getBreatheSource(), goldenFish.getBreatheSource());
    }

    @Test(groups = "negative", expectedExceptions = IndexOutOfBoundsException.class)
    public void getAnimalfromEmptyZooTest() {
        Zoo zoo = new Zoo();
        zoo.getAnimalByIndex(2);
    }

}
