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
}
