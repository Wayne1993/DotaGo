package com.fish.dotago.model;

/**
 * @author Wayne
 * @date 2017年12月13日
 * 
 * model of hero
 *
 */
public class Dota2Hero {

	private int id;
	private String heroName;
	private String heroChineseNname;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeroName() {
		return heroName;
	}
	public void setHeroName(String heroName) {
		this.heroName = heroName;
	}
	public String getHeroChineseNname() {
		return heroChineseNname;
	}
	public void setHeroChineseNname(String heroChineseNname) {
		this.heroChineseNname = heroChineseNname;
	}
	
	
}
