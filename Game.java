package com.example.final_project;


import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class Game implements Initializable {
    @FXML
    private ImageView hero;

    @FXML
    private ImageView playButton;
    public static TranslateTransition moveObjInScreen(Node node , double x, double y, double duration){
        TranslateTransition t = new TranslateTransition();

        t.setByX(x);
        t.setByY(y);
        t.setNode(node);
        t.setDuration(Duration.millis(duration));
        t.setCycleCount(TranslateTransition.INDEFINITE);
        t.setAutoReverse(true);
        return t;
    }
    public void runTrans(double out){
        moveObjInScreen(hero,0,-250,1000).play();
//


    }


    public static Timeline setDelay(double time){
        return new Timeline(new KeyFrame(Duration.millis(time), e->{}));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Timeline intro = new Timeline(new KeyFrame(Duration.millis(1),e ->{runTrans(1);}));
        intro.play();
//        new SequentialTransition(setDelay(1000),intro);


    }
    @FXML
    public void pressPauseButton(MouseEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("PauseMenu.fxml"));
        Parent root1 = fxmlLoader.load();
//        controller c = fxmlLoader.getController();
        Scene scene2 = new Scene(root1,1280,720);
        Stage stage1 = (Stage) ((Node )event.getSource()).getScene().getWindow();
        stage1.setScene(scene2);
        stage1.show();

    }


}
