package shop.product;

import shop.utils.Logger;

public class Runner {

	public static void main(String[] args) {
		
		Shop shop = new Shop();
		shop.setName("evroopt");
		
		Product bread = new Product();
		bread.setName("Raubichi");
		shop.addProduct(bread);
		
		Product milk = new Product();
		milk.setName("Prostocvashino");
		shop.addProduct(milk);
		
		
		Logger.logger(shop.amountOfProduct());
		Logger.name(bread.getName());
		Logger.name(milk.getName());
		

	}

}
