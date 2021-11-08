package com.danozzo.homeshop;

import java.util.Map;

public class Bill {
	private Costomer costomer;
	private Map<String, Integer> products;

	public Bill(Costomer costumer) {
		this.costomer = costumer;
	}

	/**
	 * Add a product with a quantity in the bill
	 * 
	 * @param product  to add
	 * @param quantity of the product
	 */
	public void addProduct(Product product, Integer quantity) {
		this.products.put(product, quantity);
	}

	public costomer getCostomer();

	{
		return costomer;
	}

	public Map<String, Integer> getProduct() {
		return products;
	}

}
