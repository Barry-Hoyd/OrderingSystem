import java.util.ArrayList;

public class Table
{
    private int tableNumber, numberOfDiners, totalNumberOfCalories;
    private double totalCost;
    private ArrayList<FoodItem> itemsOnOrder;

    public Table(int tableNumber, int numberOfDiners)
    {
        this.tableNumber = tableNumber;
        this.numberOfDiners = numberOfDiners;
        itemsOnOrder = new ArrayList<>();
    }

    public int getTableNumber()
    {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber)
    {
        this.tableNumber = tableNumber;
    }

    public int getNumberOfDiners()
    {
        return numberOfDiners;
    }

    public void setNumberOfDiners(int numberOfDiners)
    {
        this.numberOfDiners = numberOfDiners;
    }

    public void addToOrder(FoodItem item)
    {
        itemsOnOrder.add(item);
    }

    public int calculateTotalCalories()
    {
        for (FoodItem foodItem: itemsOnOrder)
        {
            totalNumberOfCalories += foodItem.getCalories();
        }
        return totalNumberOfCalories;
    }

    public double calculateTotalCost()
    {
        for (FoodItem foodItem: itemsOnOrder)
        {
            totalCost += foodItem.getPrice();
        }
        return totalCost;
    }

    public void printTableOrder()
    {
        for(FoodItem foodItem: itemsOnOrder)
        {
            System.out.println(foodItem);
        }
    }

}
