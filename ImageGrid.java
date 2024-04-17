import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;

public class ImageGrid extends Application {
    @Override
    public void start(Stage primaryStage) {
        // Create a grid pane to hold the images
        GridPane pane = new GridPane();
        pane.setPadding(new Insets(5, 5, 5, 5));
        
        // Load images
        Image usaImage = new Image("file:image/us.jpg");
        Image chinaImage = new Image("file:image/china.jpg");
        Image ukImage = new Image("file:image/uk.jpg");
        Image canadaImage = new Image("file:image/ca.gif");
        
        ImageView usa = new ImageView(usaImage);
        ImageView china = new ImageView(chinaImage);
        ImageView uk = new ImageView(ukImage);
        ImageView canada = new ImageView(canadaImage);

        pane.setHgap(5);
        pane.setVgap(5);
        pane.add(usa, 0, 0);
        pane.add(china, 1, 0);
        pane.add(uk, 0, 1);
        pane.add(canada, 1, 1);

        Scene scene = new Scene(pane);
        primaryStage.setTitle("Exercise14_01");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
