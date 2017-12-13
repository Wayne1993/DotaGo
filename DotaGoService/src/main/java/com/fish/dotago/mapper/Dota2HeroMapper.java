package com.fish.dotago.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.fish.dotago.model.Dota2Hero;

/**
 * @author Wayne
 * @date 2017年12月13日
 * 
 * hero's mapper
 *
 */
public interface Dota2HeroMapper {
	/**
	 * fetch hero data by hero id
	 * @param id
	 * @return Dota2Heros
	 */
	@Select("SELECT * FROM dota2_heros WHERE id=#{id}")
	@Results({ 
		@Result(column = "id", property = "id"), 
		@Result(column = "hero_name", property = "heroName"),
		@Result(column = "hero_chinese_name", property = "heroChineseNname")
	})
	public Dota2Hero getHeroById(int id);

	/**
	 * fetch hero data by hero name
	 * 
	 * @param name
	 * @return Dota2Heros
	 */
	@Select("SELECT * FROM dota2_heros WHERE hero_name=#{name}")
	@Results({ 
		@Result(column = "id", property = "id"), 
		@Result(column = "hero_name", property = "heroName"),
		@Result(column = "hero_chinese_name", property = "heroChineseNname")
	})
	public Dota2Hero getHeroByName(String name);

	/**
	 * fetch all heros data
	 * 
	 * @return List<Dota2Heros>
	 */
	@Select("SELECT * FROM dota2_heros")
	@Results({ 
		@Result(column = "id", property = "id"), 
		@Result(column = "hero_name", property = "heroName"),
		@Result(column = "hero_chinese_name", property = "heroChineseNname")
	})
	public List<Dota2Hero> getAllHeros();
}
