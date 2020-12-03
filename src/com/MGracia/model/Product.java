package com.MGracia.model;

import java.util.Collections;
import java.util.List;

public abstract class Product implements Comparable<Product> {
	private String name;
	private int price;

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public static void addProd(Product prod, List<Product> productList) {
		productList.add(prod);
	}

	/**
	 * Compares products by price
	 */
	@Override
	public int compareTo(Product prod) {
		int resultado = 0;
		if (price < prod.price) {
			resultado = -1;
		} else if (price > prod.price) {
			resultado = 1;
		}
		return resultado;
	}

	/**
	 * Orders list by price
	 * @param productList
	 * @return Names of the cheapest and most expensive products
	 */
	public static String minMax(List<Product> productList) {
		Collections.sort(productList);
		
		StringBuffer sb = new StringBuffer();
		sb.append("=============================\n");
		sb.append("Producto más caro: " + productList.get(productList.size()-1).getName() + "\n");
		sb.append("Producto más barato: " + productList.get(0).getName());
		
		return sb.toString();
	}
}
