package org.tnsif.capgemini.c2tc.oops;

class Product
{
	double price;
	Product (double price)
	{
		this.price=price;
	}
	double calculateDiscount()
	{
		return this.price*0.10;
	}
	double calculateFinalprice()
	{
		return this.price-this.calculateDiscount();
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		Product product=new Product(400);
		System.out.println("Final price"+ product.calculateFinalprice());

	}

}
