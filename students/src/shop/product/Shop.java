package shop.product;

import java.util.ArrayList;
import java.util.List;

public class Shop {

	private  String name;
	
	private List<Product> productList = new ArrayList<>();
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void addProduct(Product newProduct){
		productList.add(newProduct);
	}
	
	public List<Product> getproductList(){	
		return productList;
	}
	
	public int amountOfProduct(){
		int pAmount = 0;
		for( int i = 0; i < productList.size(); ){	
			i++;
			pAmount = i;
		} return pAmount;
		
	}
	
	
		
}

