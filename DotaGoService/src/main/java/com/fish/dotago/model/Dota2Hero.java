package com.fish.dotago.model;

/**
 * @author Wayne
 * @date 2017年12月13日
 * <p>
 * model of hero
 */
public class Dota2Hero {

    private int id;
    private String heroName;
    private String heroChineseName;

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

    public String getHeroChineseName() {
        return heroChineseName;
    }

    public void setHeroChineseName(String heroChineseName) {
        this.heroChineseName = heroChineseName;
    }


}
