package ScrumBoardBuilder.client;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * author: Sushan Manandhar
 */

public class App extends Application {
    Stage stage;
    public App(){}

    @Override
    public void start(Stage stage) throws Exception {
        this.stage = stage;
        stage.setTitle("Scrumbags!!!");
        showHome();
        stage.show();
    }

    public void showHome() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setController(new HelloController(this));
        loader.setLocation(getClass().getResource("/mainBoard.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }

    public static void main(String[] args) {
        App.launch();
    }
}