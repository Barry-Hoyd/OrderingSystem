import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Table {
    private int tableNumber, numberOfDiners, totalNumberOfCalories;
    private double totalCost;
    private final ArrayList<FoodItem> itemsOnOrder;
    private final ArrayList<FoodItem> returnList= new ArrayList<>();

    public Table(int tableNumber, int numberOfDiners) {
        this.tableNumber = tableNumber;
        this.numberOfDiners = numberOfDiners;
        itemsOnOrder = new ArrayList<>();
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public int getNumberOfDiners() {
        return numberOfDiners;
    }

    public void setNumberOfDiners(int numberOfDiners) {
        this.numberOfDiners = numberOfDiners;
    }

    public void addToOrder(FoodItem item) {
        itemsOnOrder.add(item);
    }

    public void removeFromOrder(FoodItem item) {
        itemsOnOrder.remove(item);
    }

    public boolean onOrder(FoodItem item) {
        boolean onOrder = false;
        for(FoodItem foodItem: itemsOnOrder) {
            if (foodItem.getName().equals(item.getName())) {
                onOrder = true;
                break;
            }
        }
        return onOrder;
    }

    public int calculateTotalCalories() {
        for (FoodItem foodItem: itemsOnOrder) {
            totalNumberOfCalories += foodItem.getCalories();
        }
        return totalNumberOfCalories;
    }

    public double calculateTotalCost() {
        for (FoodItem foodItem: itemsOnOrder) {
            totalCost += foodItem.getPrice();
        }
        return totalCost;
    }

    public ObservableList<FoodItem> printTableOrder() {
        returnList.addAll(itemsOnOrder);
        return FXCollections.observableArrayList(returnList);
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableNumber=" + tableNumber +
                ", numberOfDiners=" + numberOfDiners +
                '}';
    }
}
