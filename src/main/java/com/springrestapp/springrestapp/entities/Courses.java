package com.springrestapp.springrestapp.entities;

public class Courses {
		private long id;
		private String description;
		private String name ;
		private int price;
		
		public Courses(long id, String description, String name, int price) {
			super();
			this.id = id;
			this.description = description;
			this.name = name;
			this.price = price;
		}
		public Courses() {
			super();
			// TODO Auto-generated constructor stub
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Courses [id=" + id + ", description=" + description + ", name=" + name + ", price=" + price + "]";
		}
		
}
