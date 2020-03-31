package org.geekmj.java8;

public class App {

	public static void main(String[] args) {

		/* Discount for Cloth is 10% of cost */

		System.out.println("Selling Price of Cloth Prices 200 after discount is " + getSellingPrice(200f, 0f, cost -> (cost * 10) / 100));

		/* Discount for Book is 5% of cost */

		System.out.println("Selling Price of Book Priced 150 after discount is " + getSellingPrice(150f, 10f, cost -> (cost * 5) / 100));

	}

	private static float getSellingPrice(float cost, float couponDiscount, DiscounterFunctionalInterface discounter) {
		return cost - couponDiscount - discounter.discount(cost);
	}

}
