package com.balakrishna.abstractfactory;

public class Nautica extends Suit{
	
	private String color;
	private String price;
	private String size;
	
	public Nautica(String color, String price, String size) {
		this.color = color;
		this.price = price;
		this.size = size;
	}

	@Override
	public String getDetails() {
		return "Nautica suit with color: " + this.color +" and size " + this.size + " has price " + this.price;
	}

	@Override
	public String toString() {
		return "Nautica [color=" + color + ", price=" + price + ", size=" + size + "]";
	}
	 
}
