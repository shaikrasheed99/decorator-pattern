abstract public class DecoratorHouse implements House {
    House decoratedHouse;

    DecoratorHouse(House house) {
        this.decoratedHouse = house;
    }

    public String description() {
        return "Base house";
    }
}
