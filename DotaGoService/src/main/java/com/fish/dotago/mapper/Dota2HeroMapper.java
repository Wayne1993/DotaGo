package com.fish.dotago.mapper;

import com.fish.dotago.model.Dota2Hero;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Wayne
 * @date 2017年12月13日
 * <p>
 * hero's mapper
 */
@Repository
public interface Dota2HeroMapper {
    /**
     * fetch hero data by hero id
     *
     * @param id
     * @return Dota2Heroes
     */
    @Select("SELECT * FROM dota2_heroes WHERE id=#{id}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "hero_name", property = "heroName"),
            @Result(column = "hero_chinese_name", property = "heroChineseName")
    })
    Dota2Hero getHeroById(int id);

    /**
     * fetch hero data by hero name
     *
     * @param name
     * @return Dota2Heroes
     */
    @Select("SELECT * FROM dota2_heroes WHERE hero_name=#{name}")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "hero_name", property = "heroName"),
            @Result(column = "hero_chinese_name", property = "heroChineseName")
    })
    Dota2Hero getHeroByName(String name);

    /**
     * fetch all heros data
     *
     * @return List<Dota2Heroes>
     */
    @Select("SELECT * FROM dota2_heroes")
    @Results({
            @Result(column = "id", property = "id"),
            @Result(column = "hero_name", property = "heroName"),
            @Result(column = "hero_chinese_name", property = "heroChineseName")
    })
    List<Dota2Hero> getAllHeroes();
}
