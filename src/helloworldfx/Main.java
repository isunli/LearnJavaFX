package helloworldfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception { // Stage here is the main container
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); // load UI from fxml file
//        GridPane root = new GridPane(); //use java code instead of xml
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//        Label greeting = new Label("Welcome to JavaFX!");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.BOLD, 70));
//        root.getChildren().add(greeting);
        primaryStage.setTitle("Hello JavaFX!");
        primaryStage.setScene(new Scene(root, 700, 275)); // add the scene to the stage
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
