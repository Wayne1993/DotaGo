package com.fish.dotago.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fish.dotago.model.Dota2Item;
import com.fish.dotago.service.Dota2ItemService;
import com.github.pagehelper.PageHelper;

/**
 * @author Wayne
 * @date 2017年12月13日
 * 
 * item's controller
 *
 */
@RestController
public class Dota2ItemController {

	@Resource
	private Dota2ItemService dota2ItemsService;
	
	@RequestMapping("/getItemById")
	public Dota2Item getItemById(int id) {
		return dota2ItemsService.getItemById(id);
	}
	
	@RequestMapping("/getItemByName")
	public Dota2Item getItemByName(String name){
		return dota2ItemsService.getItemByName(name);
	}
	
	@RequestMapping("/getAllItems")
	public List<Dota2Item> getAllItems() {
		/**
		 * 显示第1页2条数据
		 */
		PageHelper.startPage(1,2);
		return dota2ItemsService.getAllItems();
	}
}
