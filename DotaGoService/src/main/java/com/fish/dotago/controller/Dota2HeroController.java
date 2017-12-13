package com.fish.dotago.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fish.dotago.model.Dota2Hero;
import com.fish.dotago.service.Dota2HeroService;
import com.github.pagehelper.PageHelper;

/**
 * @author Wayne
 * @date 2017年12月13日
 * 
 * hero's controller
 *
 */
@RestController
public class Dota2HeroController {

	@Resource
	private Dota2HeroService dota2HerosService;
	
	@RequestMapping("/getHeroById")
	public Dota2Hero getHeroById(int id) {
		return dota2HerosService.getHeroById(id);
	}
	
	@RequestMapping("/getHeroByName")
	public Dota2Hero getHeroByName(String name){
		return dota2HerosService.getHeroByName(name);
	}
	
	@RequestMapping("/getAllHeros")
	public List<Dota2Hero> getAllHeros() {
		/**
		 * 显示第1页2条数据
		 */
		PageHelper.startPage(1,2);
		return dota2HerosService.getAllHeros();
	}
}
