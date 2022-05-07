public class ParkingAreaHouse extends DecoratorHouse {
    ParkingAreaHouse(House house) {
        super(house);
    }

    @Override
    public String description() {
        return super.description() + " with parking area";
    }
}
