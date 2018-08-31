package lt.baltictalents.pizzeria.Food;


public abstract class MenuItem {
    private final String index;
    private final String name;
    private final double price;

    MenuItem(String index, String name, double price) {
        this.index = index;
        this.name = name;
        this.price = price;
    }

    public String getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {

        return "\n" +
                index + "->" +
                name +
                " ||" + " price : " + price
                ;
    }
}
