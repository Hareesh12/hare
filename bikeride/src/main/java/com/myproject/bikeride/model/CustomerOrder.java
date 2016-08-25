package com.myproject.bikeride.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CustomerOrder implements Serializable{


    private static final long serialVersionUID = -1546649310334411202L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int customerOrderId;

    @OneToOne
    @JoinColumn(name = "cartId")
    private Cart cart;

    @OneToOne
    @JoinColumn(name = "customerId")
    private Customer customer;

    @OneToOne
    @JoinColumn(name = "invoiceAddressId")
    private InvoiceAddress invoiceAddress;

    @OneToOne
    @JoinColumn(name="deliveryAddressId")
    private DeliveryAddress deliveryAddress;

    public int getCustomerOrderId() {
        return customerOrderId;
    }

    public void setCustomerOrderId(int customerOrderId) {
        this.customerOrderId = customerOrderId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

	public InvoiceAddress getInvoiceAddress() {
		return invoiceAddress;
	}

	public void setInvoiceAddress(InvoiceAddress invoiceAddress) {
		this.invoiceAddress = invoiceAddress;
	}

	public DeliveryAddress getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

   
} // The End of Class;
