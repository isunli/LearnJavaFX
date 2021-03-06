package NewApp;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.FileChooser;

import java.io.File;

public class Controller {
    @FXML
    private Label label;
    @FXML
    private Button button4;

    @FXML
    private GridPane gridPane;
    @FXML
    private WebView webView;
    public void initialize() {
        button4.setEffect(new DropShadow());

    }

    @FXML
    public void handleMouseEnter() {
        label.setScaleX(2);
        label.setScaleY(2);
    }

    @FXML
    public void handleMouseExit() {
        label.setScaleY(1);
        label.setScaleX(1);
    }

    @FXML
    public void handleClick() {

        FileChooser chooser = new FileChooser();
        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("Text", "*.txt"), new FileChooser.ExtensionFilter("PDF", "*.pdf"));
//        File file = chooser.showOpenDialog(gridPane.getScene().getWindow());
        File file = chooser.showSaveDialog(gridPane.getScene().getWindow());
//        DirectoryChooser chooser = new DirectoryChooser();
//        File file = chooser.showDialog(gridPane.getScene().getWindow());
        if (file != null) {
            System.out.println(file.getPath());
        } else {
            System.out.println("Cancelled");
        }
    }
    @FXML
    public void handleLinkCLick(){
        System.out.println("Clicked");
//        try{
//            Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
//        }catch (IOException e){
//            e.printStackTrace();
//        } catch (URISyntaxException e){
//            e.printStackTrace();
//        }
        WebEngine engine = webView.getEngine();
        engine.load("http://www.javafx.com");
    }


}
