module com.example.hellofxmaven {

  requires javafx.controls;
  requires javafx.fxml;

  requires com.google.common;
  requires com.google.auto.service;
  requires com.google.errorprone.annotations;
  requires dev.failsafe.core;
  requires org.seleniumhq.selenium.chrome_driver;

  opens com.example.hellofxmaven to javafx.fxml;
  exports com.example.hellofxmaven;
  exports com.example.hellofxmaven.hello;
  opens com.example.hellofxmaven.hello to javafx.fxml;
  exports com.example.hellofxmaven.loading;
  opens com.example.hellofxmaven.loading to javafx.fxml;
}