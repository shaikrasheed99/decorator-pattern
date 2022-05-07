import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorHouseHouseTest {
    @Test
    void shouldBeAbleToCreateBaseHouse() {
        BaseHouse baseHouse = new BaseHouse();

        assertEquals("Base house", baseHouse.description());
    }

    @Test
    void shouldBeAbleToCreateHouseWithParkingArea() {
        ParkingAreaHouse parkingAreaHouse = new ParkingAreaHouse(new BaseHouse());

        assertEquals("Base house with parking area", parkingAreaHouse.description());
    }

    @Test
    void shouldBeAbleToCreateHouseWithGardeningArea() {
        GardeningHouse gardeningHouse = new GardeningHouse(new BaseHouse());

        assertEquals("Base house with gardening area", gardeningHouse.description());
    }

    @Test
    void shouldBeAbleToCreateHouseWithIronGates() {
        IronGatesHouse ironGatesHouse = new IronGatesHouse(new BaseHouse());

        assertEquals("Base house with iron gates", ironGatesHouse.description());
    }

    @Test
    void shouldBeAbleToCreateBaseHouseWithParkingAreaAndGardeningAre() {
        GardeningHouse baseHouseWithParkingAndGardeningArea = new GardeningHouse(new ParkingAreaHouse(new BaseHouse()));

        assertEquals("Base house with parking area with gardening area", baseHouseWithParkingAndGardeningArea.description());
    }
}
