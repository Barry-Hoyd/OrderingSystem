import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Window;

import java.io.IOException;

public class TableScreenController {
    public Button submitButton;
    public TextField numberOfDinerstxt;
    public TextField tableNumbertxt;
    private int numberOfDiners, tableNumber;

    public void submitInfo(ActionEvent actionEvent) throws IOException {
        try {
            Window tableWindow = submitButton.getScene().getWindow();
            numberOfDiners = Integer.parseInt(numberOfDinerstxt.getText());
            tableNumber = Integer.parseInt(tableNumbertxt.getText());
            Table table = new Table(tableNumber, numberOfDiners);

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("FXML/MenuScreen.fxml"));
            Parent root = loader.load();
            MenuScreenController menuScreenController = loader.getController();
            menuScreenController.dataReceiver(table);
            tableWindow.getScene().setRoot(root);
            tableWindow.setWidth(600);
            tableWindow.setHeight(400);
        }
        catch (Exception e) {
            Alert invalidInput = new Alert(Alert.AlertType.ERROR);
            invalidInput.setTitle("Invalid Input");
            invalidInput.setContentText("Please enter numbers");
            invalidInput.setHeaderText("Input Invalid");
            invalidInput.showAndWait();
            numberOfDinerstxt.setText("");
            tableNumbertxt.setText("");
        }
    }
}
