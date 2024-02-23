package com.jsp.hibernate.MavenProject2.Fruit;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Fruits {
		@Id
		private int fruitId; 
		private String fruitName;
		private int fruitPrice;
		
		
		
		public int getFruitId() {
			return fruitId;
		}
		public void setFruitId(int fruitId) {
			this.fruitId = fruitId;
		}
		public String getFruitName() {
			return fruitName;
		}
		public void setFruitName(String fruitName) {
			this.fruitName = fruitName;
		}
		public int getFruitPrice() {
			return fruitPrice;
		}
		public void setFruitPrice(int fruitPrice) {
			this.fruitPrice = fruitPrice;
		}
		
		@Override
		public String toString() {
			return "Fruits [fruitId=" + fruitId + ", fruitName=" + fruitName + ", fruitPrice=" + fruitPrice + "]";
		}
}
