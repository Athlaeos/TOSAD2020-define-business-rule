package define;

import define.application.serviceinterfaces.Controller;
import define.ui.UiController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;

public class App extends Application {
    
	public static void main( String[] args ) {
	    launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
	    UiController controller = new UiController();
        FXMLLoader loader = new FXMLLoader();
        loader.setController(controller);
        loader.setLocation(new URL("file:///c:/laragon/www/TOSAD2020-define-business-rule/gui.fxml"));
        VBox vbox = loader.<VBox>load();
        Scene scene = new Scene(vbox);
        primaryStage.setScene(scene);
        primaryStage.show();

        System.out.println(controller);
    }
}