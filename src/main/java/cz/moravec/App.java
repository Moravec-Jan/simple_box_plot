package cz.moravec;

import java.net.URL;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {

        createPrimaryStage(primaryStage);
    }

    private void createPrimaryStage(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getLayoutResource("main.fxml"));
        primaryStage.setTitle("Box plot - data input");
        primaryStage.setMinHeight(360);
        primaryStage.setMinWidth(640);
        primaryStage.setOnCloseRequest(event -> Platform.exit());
        primaryStage.setScene(new Scene(root, 1280, 720));
        primaryStage.show();
    }

    public static URL getLayoutResource(String fileName) {
        return App.class.getClassLoader().getResource("layout/" + fileName);
    }


}
