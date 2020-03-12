public class FoodItem
{
    private String name, description;
    private double price;
    private int calories;
    private boolean vegetarian, vegan, glutenfree, dairyfree, kosher, halal;
    private ItemType itemType;

    public FoodItem(String name, String description, double price, int calories, boolean vegetarian, boolean vegan, boolean glutenfree, boolean dairyfree, boolean kosher, boolean halal, ItemType itemType)
    {
        this.name = name;
        this.description = description;
        this.price = price;
        this.calories = calories;
        this.vegetarian = vegetarian;
        this.vegan = vegan;
        this.glutenfree = glutenfree;
        this.dairyfree = dairyfree;
        this.kosher = kosher;
        this.halal = halal;
        this.itemType = itemType;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public int getCalories()
    {
        return calories;
    }

    public void setCalories(int calories)
    {
        this.calories = calories;
    }

    public boolean isVegetarian()
    {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian)
    {
        this.vegetarian = vegetarian;
    }

    public boolean isVegan()
    {
        return vegan;
    }

    public void setVegan(boolean vegan)
    {
        this.vegan = vegan;
    }

    public boolean isGlutenfree()
    {
        return glutenfree;
    }

    public void setGlutenfree(boolean glutenfree)
    {
        this.glutenfree = glutenfree;
    }

    public boolean isDairyfree()
    {
        return dairyfree;
    }

    public void setDairyfree(boolean dairyfree)
    {
        this.dairyfree = dairyfree;
    }

    public boolean isKosher()
    {
        return kosher;
    }

    public void setKosher(boolean kosher)
    {
        this.kosher = kosher;
    }

    public boolean isHalal()
    {
        return halal;
    }

    public void setHalal(boolean halal)
    {
        this.halal = halal;
    }

    public ItemType getItemType()
    {
        return itemType;
    }

    @Override
    public String toString()
    {
        return itemType + " " + description;
    }
}
