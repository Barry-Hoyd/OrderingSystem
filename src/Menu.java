import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.ArrayList;

public class Menu
{
    private ArrayList<FoodItem> menuItems;
    private ArrayList<FoodItem> returnList= new ArrayList<>();

    public Menu()
    {
        menuItems = new ArrayList<>();
    }

    public void addItems(FoodItem itemToAdd)
    {
        menuItems.add(itemToAdd);
    }

    public void printMenu()
    {
        for(FoodItem foodItem: menuItems)
        {
            System.out.println(foodItem);
        }
    }

    public ObservableList<FoodItem> filterByType(ItemType type)
    {
        for(FoodItem foodItem: menuItems)
        {
            if (foodItem.getItemType().equals(type))
            {
                returnList.add(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    public ObservableList<FoodItem> filterByVegetarian()
    {
        for (FoodItem foodItem: menuItems)
        {
            if (!foodItem.isVegetarian())
            {
                returnList.remove(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    public ObservableList<FoodItem> filterByVegan()
    {
        for (FoodItem foodItem: menuItems)
        {
            if (!foodItem.isVegan())
            {
                returnList.remove(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    public ObservableList<FoodItem> filterByDairy()
    {
        for (FoodItem foodItem: menuItems)
        {
            if (!foodItem.isDairyfree())
            {
                returnList.remove(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    public ObservableList<FoodItem> filterByGluten()
    {
        for (FoodItem foodItem: menuItems)
        {
            if (!foodItem.isGlutenfree())
            {
                returnList.remove(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    public ObservableList<FoodItem> filterByKosher()
    {
        for (FoodItem foodItem: menuItems)
        {
            if (!foodItem.isKosher())
            {
                returnList.remove(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    public ObservableList<FoodItem> filterByHalal()
    {
        for (FoodItem foodItem: menuItems)
        {
            if (!foodItem.isHalal())
            {
                returnList.remove(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    /*public ObservableList<FoodItem> filterByAlcohol()
    {

    }*/
}

