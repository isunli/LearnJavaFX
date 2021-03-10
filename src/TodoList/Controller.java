package TodoList;

import TodoList.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;

    public void initialize() {
        TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John0", LocalDate.of(2016, Month.APRIL, 25));
        TodoItem item2 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John1", LocalDate.of(2016, Month.APRIL, 25));
        TodoItem item3 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John2", LocalDate.of(2016, Month.APRIL, 25));
        TodoItem item4 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John3", LocalDate.of(2016, Month.APRIL, 25));
        TodoItem item5 = new TodoItem("Mail birthday card", "Buy a 30th birthday card for John4", LocalDate.of(2016, Month.APRIL, 25));
        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);
        todoListView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            if(newValue!=null){
                TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                itemDetailsTextArea.setText(item.getDetails());
                DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                deadlineLabel.setText(df.format(item.getDeadline()));
            }
        });
        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();
    }

    @FXML
    public void handleClickListView() {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
//        System.out.println("The selected item is "+item);
//        StringBuilder sb = new StringBuilder(item.getDetails());
//        sb.append("\n\n\n\n");
//        sb.append("Due: ");
//        sb.append(item.getDeadline().toString());
        itemDetailsTextArea.setText(item.getDetails());

    }

}
