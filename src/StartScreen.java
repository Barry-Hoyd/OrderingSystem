import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class StartScreen
{
    public Button tableButton;

    public void goToTable(ActionEvent actionEvent) throws IOException
    {
        Parent tableviewParent = FXMLLoader.load(getClass().getResource("TableScreen.fxml"));
        Scene tableViewScene = new Scene(tableviewParent);

        Stage window = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(tableViewScene);
        window.show();

    }
}
