package com.fish.dotago.controller;

import com.fish.dotago.model.Dota2Hero;
import com.fish.dotago.service.Dota2HeroService;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Wayne
 * @date 2017年12月13日
 * <p>
 * hero's controller
 */
@RestController
@RequestMapping("/hero")
public class Dota2HeroController {

    @Resource
    private Dota2HeroService dota2HeroService;

    @RequestMapping("/getHeroById")
    public Dota2Hero getHeroById(int id) {
        return dota2HeroService.getHeroById(id);
    }

    @RequestMapping("/getHeroByName")
    public Dota2Hero getHeroByName(String name) {
        return dota2HeroService.getHeroByName(name);
    }

    @RequestMapping("/getAllHeroes")
    public List<Dota2Hero> getAllHeroes() {
        /**
         * 显示第1页2条数据
         */
        PageHelper.startPage(1, 2);
        return dota2HeroService.getAllHeroes();
    }
}
