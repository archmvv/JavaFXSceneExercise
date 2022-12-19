package com.example.hellofx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.paint.Color;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.image.ImageView;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Group root = new Group();

        Scene scene = new Scene(root, 640,640, Color.SKYBLUE);

        Image icon = new Image("D:\\Java projects\\bro code\\fx\\hellofx\\src\\icon.png");
        stage.getIcons().add(icon);
        //stage.setWidth(900);
        //stage.setHeight(900);
        stage.setResizable(false);
        //stage.setX(100);
        //stage.setY(100);
        //stage.setFullScreen(true);
        //stage.setFullScreenExitHint("You can only escape by pressing q");
        //stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        Text text = new Text();
        text.setX(25);
        text.setY(50);
        text.setText("Hello");
        text.setFont(Font.font("Verdana",43));
        text.setFill(Color.PURPLE);

        Text text2 = new Text();
        text2.setX(430);
        text2.setY(600);
        text2.setText("Shape game");
        text2.setFont(Font.font("Verdana", FontPosture.ITALIC,20));
        text2.setFill(Color.BLACK);

        Line line = new Line();
        line.setStartX(30);
        line.setStartY(70);
        line.setEndX(50);
        line.setEndY(90);
        Line line2 = new Line();
        line2.setStartX(50);
        line2.setStartY(70);
        line2.setEndX(30);
        line2.setEndY(90);

        Line line3 = new Line();
        line3.setStartX(70);
        line3.setStartY(70);
        line3.setEndX(90);
        line3.setEndY(90);
        Line line4 = new Line();
        line4.setStartX(90);
        line4.setStartY(70);
        line4.setEndX(70);
        line4.setEndY(90);

        Line line5 = new Line();
        line5.setStartX(110);
        line5.setStartY(70);
        line5.setEndX(130);
        line5.setEndY(90);
        Line line6 = new Line();
        line6.setStartX(130);
        line6.setStartY(70);
        line6.setEndX(110);
        line6.setEndY(90);

        line.setStroke(Color.PURPLE);
        line2.setStroke(Color.PURPLE);

        line3.setStroke(Color.BLUEVIOLET);
        line4.setStroke(Color.BLUEVIOLET);

        line5.setStroke(Color.DARKBLUE);
        line6.setStroke(Color.DARKBLUE);

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(100);
        rectangle.setHeight(20);
        rectangle.setX(30);
        rectangle.setY(110);
        rectangle.setFill(Color.BLUEVIOLET);
        rectangle.setStroke(Color.DARKBLUE);

        Circle circle = new Circle();
        circle.setCenterX(150);
        circle.setCenterY(380);
        circle.setRadius(80);
        circle.setFill(Color.DARKBLUE);
        circle.setStroke(Color.BLACK);

        Polygon star = new Polygon();
        star.getPoints().addAll(
                300.0,300.0,
                    400.0,300.0,
                    450.0,200.0,
                    500.0,300.0,
                    600.0,300.0,
                    520.0,380.0,
                    550.0,500.0,
                    450.0,430.0,
                    350.0,500.0,
                    380.0,380.0
        );
        star.setFill(Color.DARKBLUE);
        star.setStroke(Color.BLACK);

        Polygon triangle = new Polygon();
        triangle.getPoints().addAll(
                450.0,30.0,
                    400.0,150.0,
                    500.0,150.0
        );
        triangle.setStroke(Color.BLACK);
        triangle.setFill(Color.DARKBLUE);

        Polygon triangle2 = new Polygon();
        triangle2.getPoints().addAll(
                300.0,30.0,
                400.0,30.0,
                350.0,150.0
        );
        triangle2.setStroke(Color.BLACK);
        triangle2.setFill(Color.DARKBLUE);

        Polygon triangle3 = new Polygon();
        triangle3.getPoints().addAll(
                500.0,30.0,
                600.0,30.0,
                550.0,150.0
        );
        triangle3.setStroke(Color.BLACK);
        triangle3.setFill(Color.DARKBLUE);

        ImageView imageView = new ImageView(icon);
        imageView.setX(570);
        imageView.setY(570);
        imageView.setFitWidth(50);
        imageView.setFitHeight(50);

        Button button = new Button();
        button.setText("Click here!");
        button.setLayoutX(30);
        button.setLayoutY(150);

        root.getChildren().add(button);
        root.getChildren().add(text2);
        root.getChildren().add(imageView);
        root.getChildren().add(triangle3);
        root.getChildren().add(triangle2);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(star);
        root.getChildren().add(rectangle);
        root.getChildren().add(line5);
        root.getChildren().add(line6);
        root.getChildren().add(line4);
        root.getChildren().add(line3);
        root.getChildren().add(line2);
        root.getChildren().add(line);
        root.getChildren().add(text);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }



        public static void main(String[] args) {
        launch();
    }
}