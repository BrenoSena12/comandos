package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

	// ATRIBUTOS
	private Double width;
	private Double height;
	
	// CONSTRUTORES
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, Double width, Double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	// ENCAPSULAMENTO
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	// METODOS
	@Override
	public double area() {
		return width * height;
	}
}
