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
}