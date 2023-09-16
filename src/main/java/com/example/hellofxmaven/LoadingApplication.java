package com.example.hellofxmaven;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoadingApplication extends Application {
  @Override
  public void start(Stage primaryStage) throws Exception {
    FXMLLoader loader = new FXMLLoader(getClass().getResource("LoadingScreen.fxml"));
    Parent root = loader.load();
    primaryStage.setTitle("Loading Screen Example");
    primaryStage.setScene(new Scene(root, 300, 200));

    // 컨트롤러 클래스에 현재 스테이지를 전달
    LoadingScreenController controller = loader.getController();
    controller.setStage(primaryStage);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }}