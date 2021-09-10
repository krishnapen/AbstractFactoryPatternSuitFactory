package com.balakrishna.abstractfactory;

public class TommyHilfiger extends Suit{
	
	private String color;
	private String price;
	private String size;
	
	public TommyHilfiger(String color, String price, String size) {
		this.color = color;
		this.price = price;
		this.size = size;
	}

	@Override
	public String getDetails() {
		return "TommyHilfiger suit with color: " + this.color +" and size " + this.size + " has price " + this.price;
	}

	@Override
	public String toString() {
		return "TommyHilfiger [color=" + color + ", price=" + price + ", size=" + size + "]";
	}
	 
}
