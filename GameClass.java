package com.example.final_project;

import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class GameClass {
    private ArrayList<ImageView> orcRecord = new ArrayList<>();
    private ArrayList<ImageView> platForm = new ArrayList<>();
    private ArrayList<ImageView> chest = new ArrayList<>();
    private ArrayList<ImageView> coin = new ArrayList<>();

    public GameClass(Scene s){
        GreenOrc greenorc= new GreenOrc(370,500,50,50);
        orcRecord.add(greenorc.getImageView());

        RedOrc redorc= new RedOrc(500,500,50,50);
        orcRecord.add(redorc.getImageView());

        PlatformClass platform= new PlatformClass(270,545,300,50);
        platForm.add(platform.getPlatform());

        platform= new PlatformClass(700,520,50,70);
        platForm.add(platform.getPlatform());

        platform= new PlatformClass(900,490,200,150);
        platForm.add(platform.getPlatform());

        CoinChestClass coinChest=new CoinChestClass(1000,445,75,50);
        chest.add(coinChest.getImageView());

        platform = new PlatformClass(1300,500,250,100);
        platForm.add(platform.getPlatform());

        greenorc=new GreenOrc(1500,455,50,50);
        orcRecord.add(greenorc.getImageView());

        platform = new PlatformClass(1700,485,200,150);
        platForm.add(platform.getPlatform());

        CoinClass Coin=new CoinClass(1570, 400, 25,25);
        coin.add(Coin.getImageView());

        Coin=new CoinClass(1650, 400, 25,25);
        coin.add(Coin.getImageView());

        Coin=new CoinClass(1750, 400, 25,25);
        coin.add(Coin.getImageView());

        redorc= new RedOrc(1800,390,100,100);
        orcRecord.add(redorc.getImageView());


//        greenorc= new GreenOrc(150,50,50,50);
//        orcRecord.add(greenorc.getImageView());

        ((AnchorPane)s.getRoot()).getChildren().addAll(orcRecord);
        ((AnchorPane)s.getRoot()).getChildren().addAll(platForm);
        ((AnchorPane)s.getRoot()).getChildren().addAll(chest);
    }

}
