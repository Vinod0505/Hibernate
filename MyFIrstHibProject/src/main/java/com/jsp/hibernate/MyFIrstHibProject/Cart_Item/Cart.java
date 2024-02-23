package com.jsp.hibernate.MyFIrstHibProject.Cart_Item;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Cart {
	@Id
	private int cId;
	private int cCapacity;
	
	@ManyToMany(mappedBy = "cartList")
	private List<Item> iList = new ArrayList<Item>();
	
	
	public List<Item> getiList() {
		return iList;
	}
	public void setiList(List<Item> iList) {
		this.iList = iList;
	}

	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public int getcCapacity() {
		return cCapacity;
	}
	public void setcCapacity(int cCapacity) {
		this.cCapacity = cCapacity;
	}
	@Override
	public String toString() {
		return "Cart [cId=" + cId + ", cCapacity=" + cCapacity + "]";
	}
}
