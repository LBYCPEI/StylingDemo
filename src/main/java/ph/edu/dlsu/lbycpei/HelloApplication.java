package ph.edu.dlsu.lbycpei;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 720);
        scene.getStylesheets().add("stylesheet.css");
        // Reference: https://docs.oracle.com/javase/8/javafx/api/javafx/scene/doc-files/cssref.html
        stage.setTitle("Read CSV into TableView Demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}