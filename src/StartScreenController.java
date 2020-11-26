import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.stage.Window;

import java.io.IOException;

public class StartScreenController {
    public Button tableButton;

    public void goToTable(ActionEvent actionEvent) throws IOException {
        Window mainWindow = tableButton.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("FXML/TableScreen.fxml"));
        Parent root = loader.load();
        mainWindow.getScene().setRoot(root);
        mainWindow.setHeight(200);
        mainWindow.setWidth(350);
    }
}
