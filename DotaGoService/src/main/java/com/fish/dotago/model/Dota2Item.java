package com.fish.dotago.model;

/**
 * @author Wayne
 * @date 2017年12月13日
 * 
 * model of item
 *
 */
public class Dota2Item {
	private int id;
	private String name;
	private String cost;
	private String secretShop;
	private String sideShop;
	private String recipe;
	private String itemChineseName;
	
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
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getSecretShop() {
		return secretShop;
	}
	public void setSecretShop(String secretShop) {
		this.secretShop = secretShop;
	}
	public String getSideShop() {
		return sideShop;
	}
	public void setSideShop(String sideShop) {
		this.sideShop = sideShop;
	}
	public String getRecipe() {
		return recipe;
	}
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	public String getItemChineseName() {
		return itemChineseName;
	}
	public void setItemChineseName(String itemChineseName) {
		this.itemChineseName = itemChineseName;
	}
}
