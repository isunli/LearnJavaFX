package TodoList;


import TodoList.datamodel.TodoData;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception { // Stage here is the main container
        Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml")); // load UI from fxml file
        primaryStage.setTitle("Todo List");
        primaryStage.setScene(new Scene(root, 900, 500)); // add the scene to the stage
        primaryStage.show();
    }

    @Override
    public void stop() throws Exception {
        try{
            TodoData.getInstance().storeTodoItem();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        super.stop();
    }

    @Override
    public void init() throws Exception {
        super.init();
        try{
            TodoData.getInstance().loadTodoItems();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
