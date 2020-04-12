package ru.by.bsuir.sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import ru.by.bsuir.*;

import java.awt.*;
import java.util.concurrent.Flow;

public class Main extends Application {

    public static void main() {
    }

    public void start(Stage stage) throws Exception {
        Worker worker = new Worker();
        Billet billet = new Billet();

        stage.setTitle("Работа");
        stage.setHeight(200);
        stage.setWidth(400);

        FlowPane sawLayer = new FlowPane(Orientation.VERTICAL);
        sawLayer.setColumnHalignment(HPos.CENTER);
        sawLayer.setPrefHeight(50);
        Label label1 = new Label("Saw");
        Button useSaw = new Button("Use");
        Container saw = new Container();
        sawLayer.getChildren().addAll(label1, useSaw);
        FlowPane.setMargin(sawLayer, new Insets(5,5,5,5));

        FlowPane jackPlaneLayer = new FlowPane(Orientation.VERTICAL);
        jackPlaneLayer.setColumnHalignment(HPos.CENTER);
        jackPlaneLayer.setPrefHeight(50);
        Label label2 = new Label("Jack-plane");
        Button useJackPlane = new Button("Use");
        jackPlaneLayer.getChildren().addAll(label2, useJackPlane);
        FlowPane.setMargin(jackPlaneLayer, new Insets(5,5,5,5));

        FlowPane screwdriverLayer = new FlowPane(Orientation.VERTICAL);
        screwdriverLayer.setColumnHalignment(HPos.CENTER);
        screwdriverLayer.setPrefHeight(50);
        Label label3 = new Label("Screwdriver");
        Button useScrewdriver = new Button("Use");
        screwdriverLayer.getChildren().addAll(label3, useScrewdriver);
        FlowPane.setMargin(screwdriverLayer, new Insets(5,5,5,5));

        FlowPane textLayer = new FlowPane(10, 10);
        Label productLabel = new Label("Your product");
        productLabel.setPrefWidth(380);
        Label shapeLabel = new Label("Shape:");
        Label shape = new Label("");
        Label readinessLabel = new Label("Readiness:");
        Label readiness = new Label("");
        textLayer.getChildren().addAll(productLabel,shapeLabel, shape, readinessLabel, readiness);
        FlowPane.setMargin(textLayer, new Insets(5,5,5,5));

       FlowPane mainLayer = new FlowPane( 5, 5, sawLayer, jackPlaneLayer,screwdriverLayer, textLayer);
        Scene scene = new Scene(mainLayer);
        stage.setScene(scene);

        // BUTTONS
        useSaw.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Instrument inst = new Saw();
                worker.setCurrentInstrument(inst);
                worker.toDo(billet);
                shape.setText(billet.getShape());
                readiness.setText(String.valueOf(billet.getProduct().getReadinessStatus()));
            }
        });

        useJackPlane.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Instrument inst = new JackPlane();
                worker.setCurrentInstrument(inst);
                worker.toDo(billet);
                shape.setText(billet.getShape());
                readiness.setText(String.valueOf(billet.getProduct().getReadinessStatus()));
            }
        });
        useScrewdriver.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Instrument inst = new Screwdriver();
                worker.setCurrentInstrument(inst);
                worker.toDo(billet);
                shape.setText(billet.getShape());
                readiness.setText(String.valueOf(billet.getProduct().getReadinessStatus()));
            }
        });


        stage.show();
    }
}