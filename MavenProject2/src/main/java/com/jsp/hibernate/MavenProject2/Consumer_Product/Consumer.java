package com.jsp.hibernate.MavenProject2.Consumer_Product;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Consumer {
	
	@Id
	private int consumerId;
	private String consumerName;
	
	
	public int getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}
	public String getConsumerName() {
		return consumerName;
	}
	public void setConsumerName(String consumerName) {
		this.consumerName = consumerName;
	}
	
	
	
	
	
	
	
}
