package com.niit.shoppingcard.bean;

public class Product {
int id;
String Pname;
double price;
void product(int i,String name,double p)
{
	id=1;
	Pname=name;
	price=12.3d;
}
public String toString()
{
	return id+""+Pname;
}
public static void main(String a[])
{
	Product p1=new Product();
	System.out.println(p1);
}
}
