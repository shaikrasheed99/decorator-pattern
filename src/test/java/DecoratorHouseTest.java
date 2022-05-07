import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorHouseTest {
    @Test
    void shouldBeAbleToCreateBaseHouse() {
        BaseHouse baseHouse = new BaseHouse();

        assertEquals("Base house", baseHouse.description());
    }

    @Test
    void shouldBeAbleToCreateBaseHouseWithParkingArea() {
        ParkingAreaHouse baseHouseWithParkingArea = new ParkingAreaHouse(new BaseHouse());

        assertEquals("Base house with parking area", baseHouseWithParkingArea.description());
    }

    @Test
    void shouldBeAbleToCreateBaseHouseWithGardeningArea() {
        GardeningHouse baseHouseWithGardeningArea = new GardeningHouse(new BaseHouse());

        assertEquals("Base house with gardening area", baseHouseWithGardeningArea.description());
    }

    @Test
    void shouldBeAbleToCreateBaseHouseWithIronGates() {
        IronGatesHouse baseHouseWithIronGates = new IronGatesHouse(new BaseHouse());

        assertEquals("Base house with iron gates", baseHouseWithIronGates.description());
    }

    @Test
    void shouldBeAbleToCreateBaseHouseWithParkingAreaWithGardeningAre() {
        GardeningHouse baseHouseWithParkingAreaAndGardeningArea = new GardeningHouse(new ParkingAreaHouse(new BaseHouse()));

        assertEquals("Base house with parking area with gardening area", baseHouseWithParkingAreaAndGardeningArea.description());
    }

    @Test
    void shouldBeAbleToCreateBaseHouseWithParkingAreaWithGardeningAreaWithIronGates() {
        IronGatesHouse baseHouseWithParkingAndGardeningAreaAndIronGates = new IronGatesHouse(new GardeningHouse(new ParkingAreaHouse(new BaseHouse())));

        assertEquals("Base house with parking area with gardening area with iron gates", baseHouseWithParkingAndGardeningAreaAndIronGates.description());
    }
}
