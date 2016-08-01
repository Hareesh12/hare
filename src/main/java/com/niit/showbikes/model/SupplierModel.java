package com.niit.showbikes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="SupplierModel")
public class SupplierModel {
	
	@Id
	@Column
	private int Supplierid;
	@Column
	private String Suppliername;
	@Column
	private String Supplieraddress;
	@Column
	private String Supplierphn;
	public int getSupplierid() {
		return Supplierid;
	}
	public void setSupplierid(int supplierid) {
		Supplierid = supplierid;
	}
	public String getSuppliername() {
		return Suppliername;
	}
	public void setSuppliername(String suppliername) {
		Suppliername = suppliername;
	}
	public String getSupplieraddress() {
		return Supplieraddress;
	}
	public void setSupplieraddress(String supplieraddress) {
		Supplieraddress = supplieraddress;
	}
	public String getSupplierphn() {
		return Supplierphn;
	}
	public void setSupplierphn(String supplierphn) {
		Supplierphn = supplierphn;
	}
	
}
	