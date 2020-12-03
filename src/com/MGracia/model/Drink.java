package com.MGracia.model;

public class Drink extends Product{

	private double liters;


	public Drink(String name, int price, double liters) {
		super(name, price);
		this.liters = liters;
	}

	public double getLiters() {
		return liters;
	}

	public void setLiters(double liters) {
		this.liters = liters;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		String div = " /// ";
		sb.append("Nombre: " + super.getName() + div);
		sb.append("Litros: " + liters + div);
		sb.append("Precio: $" + super.getPrice());
		return sb.toString();
	}
	
}
