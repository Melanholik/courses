package com.example.javafxlessons.lesson10;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ApplicationWithButton extends Application {
    Circle circle;


    @Override
    public void start(Stage primaryStage) throws Exception {
        circle = new Circle(50);
        circle.setFill(Color.BLUE);
        StackPane stackPaneCircle = new StackPane();
        stackPaneCircle.getChildren().add(circle);
        Button button = new Button("Change");
        button.setOnAction(new ButtonListener());
        StackPane stackPaneButton = new StackPane();
        stackPaneButton.getChildren().add(button);
        BorderPane pane = new BorderPane();
        pane.setCenter(stackPaneCircle);
        pane.setBottom(stackPaneButton);
        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private class ButtonListener implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            if (circle.getRadius() < 1) {
                circle.setRadius(100);
            } else {
                circle.setRadius(circle.getRadius() - 10);
            }
        }
    }
}
