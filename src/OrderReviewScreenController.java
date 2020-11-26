import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.stage.Window;

import java.io.IOException;

public class OrderReviewScreenController {

    public Label tableNumberlbl;
    public Label numberOfDiners;
    public Label totalCostlbl;
    public Label totalCalorieslbl;
    public Button payByCardbtn;
    public Button payByCashbtn;
    public ListView<FoodItem> orderDisplayList;
    public Button showOrderbtn;

    private Table table;
    private double cost;

    @FXML
    private void initialize() {
    }

    public void dataReceiver(Table table) {
        this.table = table;
        tableNumberlbl.setText("Table Number: " + table.getTableNumber());
        numberOfDiners.setText("Number Of Diners: " + table.getNumberOfDiners());
        totalCalorieslbl.setText("Total Calories: " + table.calculateTotalCalories());
        cost = Math.round(table.calculateTotalCost());
        totalCostlbl.setText("Total Cost: £" + cost);

    }

    public void displayOrder() {
        orderDisplayList.setItems(table.printTableOrder());
    }

    public void showOrder(ActionEvent actionEvent) {
        displayOrder();
        showOrderbtn.setDisable(true);
    }
    
    public void payByCard(ActionEvent actionEvent) throws IOException {
        Window tableWindow = payByCardbtn.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXML/PaymentScreenCard.fxml"));
        Parent root = loader.load();
        PaymentScreenCardController paymentScreenCardController = loader.getController();
        paymentScreenCardController.dataRecevier(cost);
        tableWindow.getScene().setRoot(root);
        tableWindow.setHeight(280);
        tableWindow.setWidth(280);
    }

    public void payByCash(ActionEvent actionEvent) throws IOException {
        Window tableWindow = payByCardbtn.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXML/PaymentScreenCash.fxml"));
        Parent root = loader.load();
        PaymentScreenCashController paymentScreenCashController = loader.getController();
        paymentScreenCashController.dataRecevier(cost);
        tableWindow.getScene().setRoot(root);
        tableWindow.setHeight(185);
        tableWindow.setWidth(280);
    }
}
