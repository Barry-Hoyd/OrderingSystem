import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class PaymentScreenCardController {
    public TextField cardNumbertxt;
    public TextField expDatetxt;
    public TextField ccvtxt;
    public Button submitDetails;
    public ListView<FoodItem> displayOrder;
    public Label totallbl;
    public Label totalPaidlbl;
    public Label cardDetailslbl;
    Table table;

    private double cost;
    @FXML
    private void initialize() {
    }

    public void dataRecevier(double cost) {
        this.cost=cost;
    }

    public void submitDetails(ActionEvent actionEvent) {
            try {
                String cardNumber = cardNumbertxt.getText();
                String encryptedCardNumber = cardNumber.substring(11, 15);
                String expDate = expDatetxt.getText();
                String CCV = ccvtxt.getText();
                if(cardNumber.length() == 16 && expDate.length() == 5 && CCV.length() == 3) {
                    totallbl.setText("Total: £" + cost);
                    totalPaidlbl.setText("Total Paid: £" + cost);
                    cardDetailslbl.setText("Card Details: \n" +
                            "Card Number: ************" + encryptedCardNumber + "\n" +
                            "Merchant ID: **18571" + "\n" +
                            "Terminal ID: ****4074");
                }
                else {
                    Alert alert = new Alert(Alert.AlertType.WARNING, "Please enter the card details correctly", ButtonType.OK);
                    alert.showAndWait();
                    cardNumbertxt.setText("");
                    expDatetxt.setText("");
                    ccvtxt.setText("");
                }
            }
            catch (Exception e) {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Please enter numbers into the fields", ButtonType.OK);
                alert.showAndWait();
                cardNumbertxt.setText("");
                expDatetxt.setText("");
                ccvtxt.setText("");
            }
    }
}
