package exercicios.introducaoPOO.shape.entities;

import exercicios.introducaoPOO.shape.enums.Color;

public class Circle extends Shape {

    private final Double radius;

    public Circle(Color color, Double radius) {
        super();
        this.radius = radius;
    }

    @Override
    public Double area() {
        return Math.pow(radius,2) * Math.PI;
    }
}
