package Layouts;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception { // Stage here is the main container
        Parent root = FXMLLoader.load(getClass().getResource("stackpane.fxml")); // load UI from fxml file
        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(new Scene(root, 500, 275)); // add the scene to the stage
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
