package exercicios.introducaoPOO.shape.entities;

import exercicios.introducaoPOO.shape.enums.Color;

public class Rectangle extends Shape {

    private final Double width;
    private final Double height;

    public Rectangle(Color color, Double width, Double height) {
        super();
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area() {
        return width * height;
    }
}
