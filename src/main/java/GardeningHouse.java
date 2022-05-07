public class GardeningHouse extends DecoratorHouse {
    GardeningHouse(House house) {
        super(house);
    }

    @Override
    public String description() {
        return super.description() + " with gardening area";
    }
}
