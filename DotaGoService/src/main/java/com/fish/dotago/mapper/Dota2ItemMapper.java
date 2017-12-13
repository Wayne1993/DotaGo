package com.fish.dotago.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.fish.dotago.model.Dota2Item;

/**
 * @author Wayne
 * @date 2017年12月13日
 * 
 * item's mapper
 *
 */
public interface Dota2ItemMapper {
	/**
	 * fetch item data by item id
	 * @param id
	 * @return Dota2Item
	 */
	@Select("SELECT * FROM dota2_items WHERE id=#{id}")
	@Results({ 
		@Result(column = "id", property = "id"), 
		@Result(column = "name", property = "name"), 
		@Result(column = "cost", property = "cost"), 
		@Result(column = "secret_shop", property = "secretShop"), 
		@Result(column = "side_shop", property = "sideShop"), 
		@Result(column = "recipe", property = "recipe"),
		@Result(column = "item_chinese_name", property = "itemChineseName")
	})
	public Dota2Item getItemById(int id);

	/**
	 * fetch item data by item name
	 * 
	 * @param name
	 * @return Dota2Item
	 */
	@Select("SELECT * FROM dota2_items WHERE name=#{name}")
	@Results({ 
		@Result(column = "id", property = "id"), 
		@Result(column = "name", property = "name"), 
		@Result(column = "cost", property = "cost"), 
		@Result(column = "secret_shop", property = "secretShop"), 
		@Result(column = "side_shop", property = "sideShop"), 
		@Result(column = "recipe", property = "recipe"),
		@Result(column = "item_chinese_name", property = "itemChineseName")
	})
	public Dota2Item getItemByName(String name);

	/**
	 * fetch all heros data
	 * 
	 * @return List<Dota2Item>
	 */
	@Select("SELECT * FROM dota2_items")
	@Results({ 
		@Result(column = "id", property = "id"), 
		@Result(column = "name", property = "name"), 
		@Result(column = "cost", property = "cost"), 
		@Result(column = "secret_shop", property = "secretShop"), 
		@Result(column = "side_shop", property = "sideShop"), 
		@Result(column = "recipe", property = "recipe"),
		@Result(column = "item_chinese_name", property = "itemChineseName")
	})
	public List<Dota2Item> getAllItems();
}
