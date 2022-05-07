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
        ParkingAreaHouse parkingAreaHouse = new ParkingAreaHouse(new BaseHouse());

        assertEquals("Base house with parking area", parkingAreaHouse.description());
    }

    @Test
    void shouldBeAbleToCreateBaseHouseWithGardeningArea() {
        GardeningHouse gardeningHouse = new GardeningHouse(new BaseHouse());

        assertEquals("Base house with gardening area", gardeningHouse.description());
    }

    @Test
    void shouldBeAbleToCreateBaseHouseWithIronGates() {
        IronGatesHouse ironGatesHouse = new IronGatesHouse(new BaseHouse());

        assertEquals("Base house with iron gates", ironGatesHouse.description());
    }

    @Test
    void shouldBeAbleToCreateBaseHouseWithParkingAreaWithGardeningAre() {
        GardeningHouse baseHouseWithParkingAndGardeningArea = new GardeningHouse(new ParkingAreaHouse(new BaseHouse()));

        assertEquals("Base house with parking area with gardening area", baseHouseWithParkingAndGardeningArea.description());
    }

    @Test
    void shouldBeAbleToCreateBaseHouseWithParkingAreaWithGardeningAreaWithIronGates() {
        IronGatesHouse baseHouse = new IronGatesHouse(new GardeningHouse(new ParkingAreaHouse(new BaseHouse())));

        assertEquals("Base house with parking area with gardening area with iron gates", baseHouse.description());
    }
}
