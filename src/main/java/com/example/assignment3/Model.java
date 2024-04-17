package com.example.assignment3;

public class Model {
  public static double calculateArea(double radius) {
    return Math.PI * radius * radius;
  }

  public static double calculatePerimeter(double radius) {
    return 2 * Math.PI * radius;
  }

  public static double[] calculateCircleProperties(double radius) {
    double area = calculateArea(radius);
    double perimeter = calculatePerimeter(radius);
    return new double[] { area, perimeter };
  }
}
