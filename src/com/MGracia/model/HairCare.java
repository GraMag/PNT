package com.MGracia.model;

public class HairCare extends Product {
	private int content;

	public HairCare(String name, int price, int content) {
		super(name, price);
		this.content = content;
	}

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		String div = " /// ";
		sb.append("Nombre: " + super.getName() + div);
		sb.append("Contenido: " + content + "ml" + div);
		sb.append("Precio: $" + super.getPrice());
		return sb.toString();
	}
}
