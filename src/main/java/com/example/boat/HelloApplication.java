package com.example.boat;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.io.IOException;
public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 1200, 800);

        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("超级无敌租船系统");

        stage.setScene(scene);
        stage.getIcons().add(new Image("file:src/main/resources/img/boatLogo.png"));

        stage.show();
    }

    public static void main(String[] args) {

        launch();
    }
}
