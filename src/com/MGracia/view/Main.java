package com.MGracia.view;

import java.util.ArrayList;
import java.util.List;

import com.MGracia.model.Drink;
import com.MGracia.model.Fruit;
import com.MGracia.model.HairCare;
import com.MGracia.model.Product;

public class Main {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		
		Product.addProd(new Drink("Coca-Cola Zero", 20, 1.5), productList);
		Product.addProd(new Drink("Coca-Cola", 18, 1.5), productList);
		Product.addProd(new HairCare("Sampoo Sedal", 19, 500), productList);
		Product.addProd(new Fruit("Frutilla", 64, "kilo"), productList);
		
		for (Product product : productList) {
			System.out.println(product.toString());
		}
		
		System.out.println(Product.minMax(productList));
	}
}
