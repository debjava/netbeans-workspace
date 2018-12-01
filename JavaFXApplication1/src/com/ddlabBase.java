package com;

import java.lang.*;
import java.util.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;

public abstract class ddlabBase extends AnchorPane {

    protected final Pane pane;
    protected final Label label;
    protected final Label label0;
    protected final Pane pane0;
    protected final Button button;
    protected final Hyperlink hyperlink;
    protected final Hyperlink hyperlink0;
    protected final ScrollPane scrollPane;
    protected final Label label1;

    public ddlabBase() {

        pane = new Pane();
        label = new Label();
        label0 = new Label();
        pane0 = new Pane();
        button = new Button();
        hyperlink = new Hyperlink();
        hyperlink0 = new Hyperlink();
        scrollPane = new ScrollPane();
        label1 = new Label();

        setId("AnchorPane");
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(452.0);
        setPrefWidth(723.0);

        pane.setId("headerPane1");
        pane.setLayoutX(14.0);
        pane.setLayoutY(14.0);
        pane.setPrefHeight(63.0);
        pane.setPrefWidth(695.0);

        label.setLayoutX(579.0);
        label.setLayoutY(12.0);
        label.setPrefHeight(26.9609375);
        label.setPrefWidth(102.0);
        label.setText("Download");

        label0.setLayoutX(160.0);
        label0.setLayoutY(15.0);
        label0.setPrefHeight(26.9609375);
        label0.setPrefWidth(289.0);
        label0.setText("Welcome to To the world of Java FX");

        pane0.setId("leftNavPane1");
        pane0.setLayoutX(14.0);
        pane0.setLayoutY(86.0);
        pane0.setPrefHeight(352.0);
        pane0.setPrefWidth(174.0);

        button.setLayoutX(21.0);
        button.setLayoutY(15.0);
        button.setMnemonicParsing(false);
        button.setPrefWidth(51.0);
        button.setText("B1");

        hyperlink.setLayoutX(15.0);
        hyperlink.setLayoutY(52.0);
        hyperlink.setText("Link-1");

        hyperlink0.setLayoutX(14.0);
        hyperlink0.setLayoutY(94.0);
        hyperlink0.setText("Link-2");

        scrollPane.setBlendMode(javafx.scene.effect.BlendMode.SCREEN);
        scrollPane.setId("contentPane1");
        scrollPane.setLayoutX(188.0);
        scrollPane.setLayoutY(86.0);
        scrollPane.setPannable(false);
        scrollPane.setPrefHeight(338.0);
        scrollPane.setPrefWidth(521.0);

        label1.setPrefHeight(40.9609375);
        label1.setPrefWidth(155.0);
        label1.setText("Welcome Boss");
        scrollPane.setContent(label1);

        pane.getChildren().add(label);
        pane.getChildren().add(label0);
        getChildren().add(pane);
        pane0.getChildren().add(button);
        pane0.getChildren().add(hyperlink);
        pane0.getChildren().add(hyperlink0);
        getChildren().add(pane0);
        getChildren().add(scrollPane);

    }
}
