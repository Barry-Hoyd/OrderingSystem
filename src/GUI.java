import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GUI extends Application
{
    @Override
    public void start(Stage primaryStage) throws Exception
    {
        Parent root = FXMLLoader.load(getClass().getResource("StartScreen.fxml"));
        primaryStage.setScene(new Scene(root, 330, 275));
        primaryStage.show();
    }

    public static void main(String[] args)
    {
        launch(args);
        Menu menu = new Menu();

        FoodItem starterItem1 = new FoodItem("Tomato soup", "Homemade tomato soup with crusty bread",3.25,60,true, false, true, false, true, true, ItemType.STARTER);
        FoodItem starterItem2 = new FoodItem("Pate", "Duck pate served on rye bread", 3.5, 68, false, false, false, true, true, true, ItemType.STARTER);
        FoodItem starterItem3 = new FoodItem("Prawn Cocktail", "Fresh king prawns served in sauce with salad", 4.5,100, false, false, true, true, true, true, ItemType.STARTER);
        FoodItem starterItem4 = new FoodItem("Chilli & Ginger Chicken Goujons","Strips of chicken with a mild chilli and ginger coating", 4.95, 150,false, false, true, true, true, true, ItemType.STARTER);

        FoodItem mainItem1 = new FoodItem("Steak & Chips", "The finest british steak and hand cut chips",14.95,327, false, false, true, true, true, true, ItemType.MAIN);
        FoodItem mainItem2 = new FoodItem("Pie & Mash","Chicken and bacon wrapped in puff pastry with a creamy sauce",12.35, 312, false, false, false, false, false, false, ItemType.MAIN);
        FoodItem mainItem3 = new FoodItem("Big Haul Scampi","Whole scampi tails coated in golden crumbs. Served with chunky chips", 8.45, 200, false, false, true, true, true, true, ItemType.MAIN);
        FoodItem mainItem4 = new FoodItem("Grilled Gammon Steak","3/4lb grilled gammon steak topped with a fried egg", 9, 170, false, false, true, true, false, false, ItemType.MAIN);
        FoodItem mainItem5 = new FoodItem("Mushroom & Brie Hazlenut Wellington","A medley of hazelnuts and mushrooms with melting Brie encased in puff pastry.", 9, 256, true, false, false, false, true, true, ItemType.MAIN);
        FoodItem mainItem6 = new FoodItem("Farmhouse Cumberland Sausage","The finest butchers sausage served with mash veg and a boat of gravy",8.45, 267, false, false, true, true, false, false, ItemType.MAIN);

        FoodItem desertItem1 = new FoodItem("Trio Of Ice-cream", "3 scoops of our house ice-cream",2.95,98, true, true, true, false, true, true, ItemType.DESERT);
        FoodItem desertItem2 = new FoodItem("Fresh fruit", "A selection of fresh garden fruit", 1.55, 69, true, true, true, true, true, true, ItemType.DESERT);
        FoodItem desertItem3 = new FoodItem("Sticky Toffee Pudding","Moist sticky sponge covered in toffee sauce",4.5,125, true, false, true, false, true, true, ItemType.DESERT);
        FoodItem desertItem4 = new FoodItem("Traditional Apple Crumble","Chunks of apple topped with nutty butter crumble",4.5, 113, true, true, true, true,true, true, ItemType.DESERT);

        DrinkItem drinkItem1 = new DrinkItem("Pint of Carling", "British brewed larger", 3.20, 80, true, true, false, true, false, false,4.0, 568, ItemType.DRINK);
        DrinkItem drinkItem2 = new DrinkItem("Glass of wine", "A glass of house wine", 3.50, 60, true, true, true, true, false, false,7.8, 125, ItemType.DRINK);
        DrinkItem drinkItem3 = new DrinkItem("Glass of coke", "A half pint glass of coke", 2.10, 100, true, false, true, true, true, true, 0, 330, ItemType.DRINK);
        DrinkItem drinkItem4 = new DrinkItem("Glass of Orange juice", "A glass of freshly squeezed orange juice", 2.50, 120, true, true, true, true, true, true, 0, 250, ItemType.DRINK);

        menu.addItems(starterItem1);
        menu.addItems(starterItem2);
        menu.addItems(starterItem3);
        menu.addItems(starterItem4);

        menu.addItems(mainItem1);
        menu.addItems(mainItem2);
        menu.addItems(mainItem3);
        menu.addItems(mainItem4);
        menu.addItems(mainItem5);
        menu.addItems(mainItem6);

        menu.addItems(desertItem1);
        menu.addItems(desertItem2);
        menu.addItems(desertItem3);
        menu.addItems(desertItem4);

        menu.addItems(drinkItem1);
        menu.addItems(drinkItem2);
        menu.addItems(drinkItem3);
        menu.addItems(drinkItem4);

        menu.printMenu();

        /*System.out.println("Starters");
        System.out.println(menu.filterByType(ItemType.STARTER));
        System.out.println();
        System.out.println("Mains");
        System.out.println(menu.filterByType(ItemType.MAIN));
        System.out.println();
        System.out.println("Deserts");
        System.out.println(menu.filterByType(ItemType.DESERT));
        System.out.println();
        System.out.println("Drinks");
        System.out.println(menu.filterByType(ItemType.DRINK));*/

        /*menu.filterByType(ItemType.DESERT);
        menu.filterByVegetarian();
        menu.filterByDairy();
        System.out.println(menu.filterByVegan());*/

        /*table.addToOrder(starterItem1);
        table.addToOrder(starterItem1);
        table.addToOrder(mainItem1);
        table.addToOrder(mainItem4);
        table.addToOrder(desertItem2);
        table.addToOrder(desertItem4);
        table.addToOrder(drinkItem3);

        table.printTableOrder();
        System.out.println();
        System.out.println("Total cost= £" + table.calculateTotalCost());
        System.out.println("Total number of calories= " + table.calculateTotalCalories());*/
    }
}


