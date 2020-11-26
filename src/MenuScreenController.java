import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Menu;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MenuScreenController {

    public Label noOfCourseslbl;
    public TextField noOfCoursestxt;
    public Button submitNoOfCoursesbtn;

    public Button menuGoBackbtn;
    public Label foodTypelbl;
    public Button menuGoForwardbtn;


    public Button addToOrderbtn;
    public Button removeFromOrderbtn;
    public Button luckyDipbtn;
    public Button submitOrderbtn;


    public CheckBox vegetarianCheckBox;
    public CheckBox veganCheckBox;
    public CheckBox glutenFreeCheckBox;
    public CheckBox dairyFreeCheckBox;
    public CheckBox kosherCheckBox;
    public CheckBox halalCheckBox;
    public CheckBox containsAlcoholCheckBox;

    public ListView<FoodItem> displayMenu;

    private Menu1 menu;
    private int menuIndex = 1;

    private Table table;
    private TableScreenController tableScreenController;

    private int numberOfCourses, maxNumberOfCourses, totalNumberOfDiners, numberOfOrdersPlaced, dinerIndex = 1;

    @FXML
    private void initialize() {
        noOfCourseslbl.setText("Diner" + dinerIndex + " please enter the number of courses you want: ");
        menu = new Menu1();

        FoodItem starterItem1 = new FoodItem("Tomato soup", "Homemade tomato soup with crusty bread", 3.25, 60, true, false, true, false, true, true, ItemType.STARTER);
        FoodItem starterItem2 = new FoodItem("Pate", "Duck pate served on rye bread", 3.5, 68, false, false, false, true, true, true, ItemType.STARTER);
        FoodItem starterItem3 = new FoodItem("Prawn Cocktail", "Fresh king prawns served in sauce with salad", 4.5, 100, false, false, true, true, true, true, ItemType.STARTER);
        FoodItem starterItem4 = new FoodItem("Chilli & Ginger Chicken Goujons", "Strips of chicken with a mild chilli and ginger coating", 4.95, 150, false, false, true, true, true, true, ItemType.STARTER);

        FoodItem mainItem1 = new FoodItem("Steak & Chips", "The finest british steak and hand cut chips", 14.95, 327, false, false, true, true, true, true, ItemType.MAIN);
        FoodItem mainItem2 = new FoodItem("Pie & Mash", "Chicken and bacon wrapped in puff pastry with a creamy sauce", 12.35, 312, false, false, false, false, false, false, ItemType.MAIN);
        FoodItem mainItem3 = new FoodItem("Big Haul Scampi", "Whole scampi tails coated in golden crumbs. Served with chunky chips", 8.45, 200, false, false, true, true, true, true, ItemType.MAIN);
        FoodItem mainItem4 = new FoodItem("Grilled Gammon Steak", "3/4lb grilled gammon steak topped with a fried egg", 9, 170, false, false, true, true, false, false, ItemType.MAIN);
        FoodItem mainItem5 = new FoodItem("Mushroom & Brie Hazlenut Wellington", "A medley of hazelnuts and mushrooms with melting Brie encased in puff pastry.", 9, 256, true, false, false, false, true, true, ItemType.MAIN);
        FoodItem mainItem6 = new FoodItem("Farmhouse Cumberland Sausage", "The finest butchers sausage served with mash veg and a boat of gravy", 8.45, 267, false, false, true, true, false, false, ItemType.MAIN);

        FoodItem desertItem1 = new FoodItem("Trio Of Ice-cream", "3 scoops of our house ice-cream", 2.95, 98, true, true, true, false, true, true, ItemType.DESERT);
        FoodItem desertItem2 = new FoodItem("Fresh fruit", "A selection of fresh garden fruit", 1.55, 69, true, true, true, true, true, true, ItemType.DESERT);
        FoodItem desertItem3 = new FoodItem("Sticky Toffee Pudding", "Moist sticky sponge covered in toffee sauce", 4.5, 125, true, false, true, false, true, true, ItemType.DESERT);
        FoodItem desertItem4 = new FoodItem("Traditional Apple Crumble", "Chunks of apple topped with nutty butter crumble", 4.5, 113, true, true, true, true, true, true, ItemType.DESERT);

        DrinkItem drinkItem1 = new DrinkItem("Pint of Carling", "British brewed larger", 3.20, 80, true, true, false, true, false, false, 4.0, 568, ItemType.DRINK);
        DrinkItem drinkItem2 = new DrinkItem("Glass of wine", "A glass of house wine", 3.50, 60, true, true, true, true, false, false, 7.8, 125, ItemType.DRINK);
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
    }

    public void dataReceiver(Table table) {
        this.table = table;
        totalNumberOfDiners = table.getNumberOfDiners();
    }

    public void submitNumberOfCourses() {
        try {
            numberOfCourses = Integer.parseInt(noOfCoursestxt.getText());
            if(numberOfCourses > 3 || numberOfCourses == 0) {
                Alert invalidInput = new Alert(Alert.AlertType.ERROR);
                invalidInput.setTitle("Not Valid");
                invalidInput.setContentText("Please enter up to a maximum of 3 courses, this does not include drinks");
                invalidInput.setHeaderText("Not Valid");
                invalidInput.showAndWait();
            }
            else {
                maxNumberOfCourses = numberOfCourses;
                addToOrderbtn.setDisable(false);
                removeFromOrderbtn.setDisable(false);
                luckyDipbtn.setDisable(false);
                submitNoOfCoursesbtn.setDisable(true);
                noOfCoursestxt.setText("");
                displayMenu();
            }
        }
        catch (Exception e) {
            Alert invalidInput = new Alert(Alert.AlertType.ERROR);
            invalidInput.setTitle("Invalid Input");
            invalidInput.setContentText("Please enter a number");
            invalidInput.setHeaderText("Input Invalid");
            invalidInput.showAndWait();
        }
    }

    public void displayMenu() {
        initialize();
        switch (menuIndex) {
            case 1 -> {
                foodTypelbl.setText("Starters");
                displayMenu.setItems(menu.filterByType(ItemType.STARTER));
            }
            case 2 -> {
                foodTypelbl.setText("Mains");
                displayMenu.setItems(menu.filterByType(ItemType.MAIN));
            }
            case 3 -> {
                foodTypelbl.setText("Deserts");
                displayMenu.setItems(menu.filterByType(ItemType.DESERT));
            }
            case 4 -> {
                foodTypelbl.setText("Drinks");
                displayMenu.setItems(menu.filterByType(ItemType.DRINK));
            }
        }
    }

    public void goBackMenu(ActionEvent actionEvent) {
        menuIndex--;
        if (menuIndex == 0) {
            menuIndex = 4;
        }
        vegetarianCheckBox.setSelected(false);
        veganCheckBox.setSelected(false);
        glutenFreeCheckBox.setSelected(false);
        dairyFreeCheckBox.setSelected(false);
        halalCheckBox.setSelected(false);
        kosherCheckBox.setSelected(false);
        containsAlcoholCheckBox.setSelected(false);
        containsAlcoholCheckBox.setDisable(menuIndex != 4);
        displayMenu();
    }

    public void goForwardMenu(ActionEvent actionEvent) {
        menuIndex++;
        if (menuIndex == 5) {
            menuIndex = 1;
        }
        vegetarianCheckBox.setSelected(false);
        veganCheckBox.setSelected(false);
        glutenFreeCheckBox.setSelected(false);
        dairyFreeCheckBox.setSelected(false);
        halalCheckBox.setSelected(false);
        kosherCheckBox.setSelected(false);
        containsAlcoholCheckBox.setSelected(false);
        containsAlcoholCheckBox.setDisable(menuIndex != 4);
        displayMenu();
    }

    public void addItem(ActionEvent actionEvent) {
        int selectedIndex = displayMenu.getSelectionModel().getSelectedIndex();

        if (selectedIndex == -1) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Select an item from the menu", ButtonType.OK);
            alert.showAndWait();
        }
        else {
            FoodItem selectedItem = displayMenu.getSelectionModel().getSelectedItem();
            if (numberOfCourses > 0 && selectedItem.getItemType() != ItemType.DRINK) {
                numberOfCourses--;
                table.addToOrder(selectedItem);
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "You have added a " + selectedItem.getName() + " to your order", ButtonType.OK);
                alert.showAndWait();
            }
            else if (selectedItem.getItemType() == ItemType.DRINK || selectedItem.getItemType() == ItemType.DRINK && numberOfCourses == 0) {
                table.addToOrder(selectedItem);
                Alert alert = new Alert(Alert.AlertType.INFORMATION, "You have added a " + selectedItem.getName() + " to your order", ButtonType.OK);
                alert.showAndWait();
            }
            else {
                Alert alert = new Alert(Alert.AlertType.WARNING, "You are at the number of courses you wanted excluding drinks. Please either just add drinks or submit your order", ButtonType.OK);
                alert.showAndWait();
            }

        }
        if (numberOfCourses != maxNumberOfCourses) {
            luckyDipbtn.setDisable(true);
        }
        if (numberOfCourses == 0) {
            submitOrderbtn.setDisable(false);
        }
    }

    public void removeItem(ActionEvent actionEvent) {
        int selectedIndex = displayMenu.getSelectionModel().getSelectedIndex();

        if (selectedIndex == -1) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Select an item from the menu that you have already added to your order and wish to remove", ButtonType.OK);
            alert.showAndWait();
        }
        else {
            FoodItem selectedItem = displayMenu.getSelectionModel().getSelectedItem();
            if (table.onOrder(selectedItem) && selectedItem.getItemType() != ItemType.DRINK) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, selectedItem.getName() + " has been removed from your order", ButtonType.OK);
                alert.showAndWait();
                table.removeFromOrder(selectedItem);
                numberOfCourses++;
            }
            else if (table.onOrder(selectedItem) && selectedItem.getItemType() == ItemType.DRINK) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION, selectedItem.getName() + " has been removed from your order", ButtonType.OK);
                alert.showAndWait();
                table.removeFromOrder(selectedItem);
            }
            else {
                Alert alert = new Alert(Alert.AlertType.WARNING, selectedItem.getName() + " is not on your order so can not be removed", ButtonType.OK);
                alert.showAndWait();
            }
        }
        if (numberOfCourses == maxNumberOfCourses) {
            luckyDipbtn.setDisable(false);
        }
        if (numberOfCourses != 0) {
            submitOrderbtn.setDisable(true);
            addToOrderbtn.setDisable(false);
        }
        else {
            submitOrderbtn.setDisable(false);
        }
        System.out.println(numberOfCourses);
    }

    public void submitOrder(ActionEvent actionEvent) throws IOException {
        numberOfOrdersPlaced++;
        if (numberOfOrdersPlaced < totalNumberOfDiners) {
            dinerIndex++;
            noOfCourseslbl.setText("Diner" + dinerIndex + " please enter the number of courses you want: ");
            addToOrderbtn.setDisable(true);
            submitNoOfCoursesbtn.setDisable(false);
            removeFromOrderbtn.setDisable(true);
            submitOrderbtn.setDisable(true);
        }
        else {
            Window tableWindow = submitOrderbtn.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("FXML/OrderReviewScreen.fxml"));
            Parent root = loader.load();
            OrderReviewScreenController orderReviewScreenController = loader.getController();
            orderReviewScreenController.dataReceiver(table);
            tableWindow.getScene().setRoot(root);
            tableWindow.setWidth(475);
            tableWindow.setHeight(425);
        }
    }

    public void addLuckyDip(ActionEvent actionEvent) {
        for (int x = 0; x < numberOfCourses; x++) {
            table.addToOrder(menu.addRandom(numberOfCourses));
        }
        numberOfCourses = 0;
        submitOrderbtn.setDisable(false);
        if (numberOfCourses != maxNumberOfCourses) {
            luckyDipbtn.setDisable(true);
        }
    }

    public void sortVegetarian(ActionEvent actionEvent) {
        if (vegetarianCheckBox.isSelected()) {
            displayMenu.setItems(menu.filterByVegetarian());
        }
        else {
            displayMenu();
        }
    }

    public void sortVegan(ActionEvent actionEvent) {
        if (veganCheckBox.isSelected()) {
            displayMenu.setItems(menu.filterByVegan());
        }
        else {
            displayMenu();
        }
    }

    public void sortGlutenFree(ActionEvent actionEvent) {
        if (glutenFreeCheckBox.isSelected()) {
            displayMenu.setItems(menu.filterByGluten());
        }
        else {
            displayMenu();
        }
    }

    public void sortDairyFree(ActionEvent actionEvent) {
        if (dairyFreeCheckBox.isSelected()) {
            displayMenu.setItems(menu.filterByDairy());
        }
        else {
            displayMenu();
        }
    }

    public void sortKosher(ActionEvent actionEvent) {
        if (kosherCheckBox.isSelected()) {
            displayMenu.setItems(menu.filterByKosher());
        }
        else {
            displayMenu();
        }
    }

    public void sortHalal(ActionEvent actionEvent) {
        if (halalCheckBox.isSelected()) {
            displayMenu.setItems(menu.filterByHalal());
        }
        else {
            displayMenu();
        }
    }

    public void sortAlcohol(ActionEvent actionEvent) {
        if (containsAlcoholCheckBox.isSelected()) {
            displayMenu.setItems(menu.filterByAlcohol());
        }
        else {
            displayMenu();
        }
    }


}
