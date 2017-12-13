package com.fish.dotago.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fish.dotago.mapper.Dota2ItemMapper;
import com.fish.dotago.model.Dota2Item;

/**
 * @author Wayne
 * @date 2017年12月13日
 * 
 * servie for item
 *
 */
@Service
public class Dota2ItemService {

	@Autowired
	private Dota2ItemMapper dota2ItemsMapper;
	
	public Dota2Item getItemById(int id) {
		return dota2ItemsMapper.getItemById(id);
	}
	
	public Dota2Item getItemByName(String name){
		return dota2ItemsMapper.getItemByName(name);
	}

	public List<Dota2Item> getAllItems() {
		return dota2ItemsMapper.getAllItems();
	}
}
