//7. Write a JavaFX program to compute sum of two Integer number.

package Lab7;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
public class Q7  extends Application{
    Label l1, l2,l3;
    TextField t1,t2;
    Button b1;
    @Override
    public void start(Stage primaryStage) throws Exception{
        l1 = new Label("Enter First Number");
        l2 = new Label("Enter Second Number");
        l3 = new Label();
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("Sum");
        
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               int n1 = Integer.parseInt(t1.getText());
               int n2 = Integer.parseInt(t2.getText());
               int sum = n1+n2;
               l3.setText("Sum = "+sum);
            }
        });
        
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));
        root.getChildren().addAll(l1,t1,l2,t2,b1,l3);
        
        Scene scene = new Scene(root,300,300);
        primaryStage.setTitle("Calculator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
    
}
