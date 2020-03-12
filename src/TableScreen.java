import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TableScreen
{
    public Button submitButton;
    public TextField numberOfDinerstxt;
    public TextField tableNumbertxt;
    private int numberOfDiners, tableNumber;


    public void submitInfo(ActionEvent actionEvent)
    {
        numberOfDiners = Integer.parseInt(numberOfDinerstxt.getText());
        tableNumber = Integer.parseInt(tableNumbertxt.getText());
        Table table = new Table(tableNumber,numberOfDiners);
        System.out.println("Table number= " + tableNumber);
        System.out.println("Number of diners= " + numberOfDiners);
    }

    public int getNumberOfDiners()
    {
        return numberOfDiners;
    }

    public int getTableNumber()
    {
        return tableNumber;
    }
}
