public class DrinkItem extends FoodItem {
    private double alcoholContent;
    private int volume;

    public DrinkItem(String name, String description, double price, int calories, boolean vegetarian, boolean vegan, boolean glutenfree, boolean dairyfree, boolean kosher, boolean halal, double alcoholContent, int volume, ItemType itemType) {
        super(name, description, price, calories, vegetarian, vegan, glutenfree, dairyfree, kosher, halal, itemType);
        this.alcoholContent = alcoholContent;
        this.volume = volume;
    }

    public double getAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(double alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
