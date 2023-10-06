package com.example.javafxlessons.lesson3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstApplication extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(50);
        circle.setCenterX(100);
        circle.setCenterY(100);
        Text text = new Text("ABC");
        text.setX(200);
        text.setY(200);
//        text.setFill(Color.BROWN);
//        Font font = Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22);
//        text.setFont(font);
        text.setStyle("-fx-fill: red; -fx-font-weight: bold; -fx-font-size: 22");
        Pane pane = new Pane();
        pane.getChildren().add(circle);
        pane.getChildren().add(text);
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
