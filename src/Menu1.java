import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import java.util.ArrayList;
import java.util.Random;

public class Menu1 {
    private final ArrayList<FoodItem> menuItems;
    private final ArrayList<FoodItem> returnList= new ArrayList<>();

    public Menu1() {
        menuItems = new ArrayList<>();
    }

    public void addItems(FoodItem itemToAdd) {
        menuItems.add(itemToAdd);
    }

    public void printMenu() {
        for(FoodItem foodItem: menuItems) {
            System.out.println(foodItem);
        }
    }

    public int getNumberOfItems() {
        int numberOfItems =0;
        for(FoodItem foodItem: menuItems) {
            if(foodItem.getItemType() != ItemType.DRINK) {
                numberOfItems++;
            }
        }
        return  numberOfItems;
    }

    public FoodItem addRandom(int numberOfTimes) {
        int random = new Random().nextInt(getNumberOfItems());
        return menuItems.get(random);
    }

    public ObservableList<FoodItem> getMenu() {
        return FXCollections.observableArrayList(menuItems);
    }

    public ObservableList<FoodItem> filterByType(ItemType type) {
        for(FoodItem foodItem: menuItems) {
            if (foodItem.getItemType().equals(type)) {
                returnList.add(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    public ObservableList<FoodItem> filterByVegetarian() {
        for (FoodItem foodItem: menuItems) {
            if (!foodItem.isVegetarian()) {
                returnList.remove(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    public ObservableList<FoodItem> filterByVegan() {
        for (FoodItem foodItem: menuItems) {
            if (!foodItem.isVegan()) {
                returnList.remove(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    public ObservableList<FoodItem> filterByDairy() {
        for (FoodItem foodItem: menuItems) {
            if (!foodItem.isDairyfree()) {
                returnList.remove(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    public ObservableList<FoodItem> filterByGluten() {
        for (FoodItem foodItem: menuItems) {
            if (!foodItem.isGlutenfree()) {
                returnList.remove(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    public ObservableList<FoodItem> filterByKosher() {
        for (FoodItem foodItem: menuItems) {
            if (!foodItem.isKosher()) {
                returnList.remove(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    public ObservableList<FoodItem> filterByHalal() {
        for (FoodItem foodItem: menuItems) {
            if (!foodItem.isHalal()) {
                returnList.remove(foodItem);
            }
        }
        return FXCollections.observableArrayList(returnList);
    }

    public ObservableList<FoodItem> filterByAlcohol()
    {
        ObservableList<FoodItem> drinksList = FXCollections.observableArrayList();
        for (FoodItem menuItem : menuItems) {
            if(menuItem instanceof DrinkItem) {
                DrinkItem drink = (DrinkItem) menuItem;
                if(drink.getAlcoholContent() > 0) {
                    drinksList.add(drink);
                }
            }
        }
        return drinksList;
    }
}
