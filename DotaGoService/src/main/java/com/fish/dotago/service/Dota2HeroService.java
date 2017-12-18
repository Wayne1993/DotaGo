package com.fish.dotago.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fish.dotago.mapper.Dota2HeroMapper;
import com.fish.dotago.model.Dota2Hero;

/**
 * @author Wayne
 * @date 2017年12月13日
 * 
 * servie for hero
 *
 */
@Service
public class Dota2HeroService {

	@Autowired
	private Dota2HeroMapper dota2HeroMapper;
	
	public Dota2Hero getHeroById(int id) {
		return dota2HeroMapper.getHeroById(id);
	}
	
	public Dota2Hero getHeroByName(String name){
		return dota2HeroMapper.getHeroByName(name);
	}

	public List<Dota2Hero> getAllHeroes() {
		return dota2HeroMapper.getAllHeroes();
	}
}
