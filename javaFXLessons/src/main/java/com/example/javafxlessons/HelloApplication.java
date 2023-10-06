package com.example.javafxlessons;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Circle circle = new Circle(50);
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        Scene scene = new Scene(pane, 400, 400);
        stage.setScene(scene);
        stage.show();
    }

}