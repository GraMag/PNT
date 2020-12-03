package com.MGracia.model;

public class Fruit extends Product {

	private String unit;

	public Fruit(String name, int price, String unit) {
		super(name, price);
		this.unit = unit;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		String div = " /// ";
		sb.append("Nombre: " + super.getName() + div);
		sb.append("Precio: $" + super.getPrice() + div);
		sb.append("Unidad de venta: " + unit);
		return sb.toString();
	}
}
