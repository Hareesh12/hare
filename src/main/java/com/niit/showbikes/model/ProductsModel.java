
package com.niit.showbikes.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="ProductsModel") 
public class ProductsModel {
	@Id
	private int ProductId;
	@Column
	private String ProductName;
	@Column
	private String ProductDetails;
	@Column
	private int ProductPrice;
	@Column
	private String ProductURL;
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductDetails() {
		return ProductDetails;
	}
	public void setProductDetails(String productDetails) {
		ProductDetails = productDetails;
	}
	public int getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(int productPrice) {
		ProductPrice = productPrice;
	}
	public String getProductURL() {
		return ProductURL;
	}
	public void setProductURL(String productURL) {
		ProductURL = productURL;
	}
	
	

	
}
