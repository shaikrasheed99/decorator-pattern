public class IronGatesHouse extends DecoratorHouse {
    IronGatesHouse(House house) {
        super(house);
    }

    @Override
    public String description() {
        return super.description() + " with iron gates";
    }
}
