package define.ui;

import define.controller.ApiController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UiController {

    @FXML
    TextField host;

    @FXML
    TextField port;

    @FXML
    TextField username;

    @FXML
    TextField password;

    public UiController() {

    }

    @FXML
    public void connect(Event e) {
        // @TODO make request to Transform to connect with database
        ApiController api = new ApiController();
        api.connectRequest(host.getCharacters(), port.getCharacters(), username.getCharacters(), password.getCharacters());
    }
}