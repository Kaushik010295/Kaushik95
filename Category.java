package com.niit.ShoppingCartCore;

import org.springframework.stereotype.Component;

@Component
public class Category {
private int id;
private String name;
private int catnum;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getCatnum() {
	return catnum;
}
public void setCatnum(int catnum) {
	this.catnum = catnum;
}
}
