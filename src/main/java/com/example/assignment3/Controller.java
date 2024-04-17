package com.example.assignment3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
  @FXML
  private TextField radiusField;

  @FXML
  private Button calculateButton;

  @FXML
  private Label areaLabel;

  @FXML
  private Label perimeterLabel;

  @FXML
  void submitAction(ActionEvent event) {
    double radius = Double.parseDouble(radiusField.getText());
    double[] circleProperties = Model.calculateCircleProperties(radius);
    areaLabel.setText(String.format("Area: %.2f", circleProperties[0]));
    perimeterLabel.setText(String.format("Perimeter: %.2f", circleProperties[1]));
  }
}
