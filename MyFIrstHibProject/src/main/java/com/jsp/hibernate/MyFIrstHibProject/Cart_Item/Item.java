package com.jsp.hibernate.MyFIrstHibProject.Cart_Item;

import java.util.ArrayList; 
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Item {
	@Id
	private int iId;
	private String iname;
	private  int iprice;

	@ManyToMany
	private List<Cart> cartList = new ArrayList<Cart>();


	public List<Cart> getCartList() {
		return cartList;
	}
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}
	
	public int getiId() {
		return iId;
	}
	public void setiId(int iId) {
		this.iId = iId;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public int getIprice() {
		return iprice;
	}
	public void setIprice(int iprice) {
		this.iprice = iprice;
	}
	@Override
	public String toString() {
		return "Item [iId=" + iId + ", iname=" + iname + ", iprice=" + iprice + ", cartList=" + cartList + "]";
	}

}
