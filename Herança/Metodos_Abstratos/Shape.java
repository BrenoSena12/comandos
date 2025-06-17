package entities;

import entities.enums.Color;

public abstract class Shape {

	// ATRIBUTOS
	private Color color;

	// CONSTRUTORES
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}
	
	// ENCAPSULAMENTO
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// METODOS
	public abstract double area();
}
