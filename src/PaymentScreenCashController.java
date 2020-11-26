import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

public class PaymentScreenCashController {
    public TextField paymentAmounttxt;
    public Button submitAmountbtn;
    public Label totalPaidlbl;
    public Label changelbl;
    public Label totallbl;

    private double cost;
    private double change;

    private void initialize() {
    }

    public void dataRecevier(double cost) {
        this.cost=cost;
        totallbl.setText("Total: £" + cost);
    }


    public void payByCash(ActionEvent actionEvent) {
        try {
            double amountPaid = Double.parseDouble(paymentAmounttxt.getText());
            if(amountPaid >= cost) {
                totalPaidlbl.setText("Total Paid: £" + amountPaid);
                changelbl.setText("Change: £" + (amountPaid -cost));
            }
            else {
                Alert alert = new Alert(Alert.AlertType.WARNING, "Please enter the cost or more in the payment box");
                alert.showAndWait();
                paymentAmounttxt.setText("");
            }
        }
        catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Please enter numbers in the payment box");
            alert.showAndWait();
            paymentAmounttxt.setText("");
        }
    }
}
