import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecoratorHouseTest {
    @Test
    void shouldBeAbleToCreateBaseHouse() {
        BaseHouse baseHouse = new BaseHouse();

        assertEquals("Base house", baseHouse.description());
    }
}
