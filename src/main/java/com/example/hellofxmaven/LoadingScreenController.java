package com.example.hellofxmaven;

import javafx.concurrent.Task;
import javafx.fxml.FXML;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

public class LoadingScreenController {

  @FXML
  private ProgressIndicator progressIndicator;

  private Stage stage;

  public void setStage(Stage stage) {
    this.stage = stage;
  }

  public void initialize() {
    // 백그라운드 작업 시작
    startBackgroundTask();
  }

  private void startBackgroundTask() {
    Task<Void> backgroundTask = new Task<Void>() {
      @Override
      protected Void call() throws Exception {
        // 백그라운드 작업 시뮬레이션 (5초 동안 sleep)
        Thread.sleep(5000);
        return null;
      }
    };

    // 백그라운드 작업이 완료되면 로딩 창을 닫음
    backgroundTask.setOnSucceeded(event -> {
      stage.close();
    });

    Thread backgroundThread = new Thread(backgroundTask);
    backgroundThread.setDaemon(true);
    backgroundThread.start();
  }
}