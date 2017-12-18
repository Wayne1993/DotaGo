package com.fish.dotago.controller;

import com.fish.dotago.model.Dota2Item;
import com.fish.dotago.service.Dota2ItemService;
import com.github.pagehelper.PageHelper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Wayne
 * @date 2017年12月13日
 * <p>
 * item's controller
 */
@RestController
@RequestMapping("/item")
public class Dota2ItemController {

    @Resource
    private Dota2ItemService dota2ItemService;

    @RequestMapping("/getItemById")
    public Dota2Item getItemById(int id) {
        return dota2ItemService.getItemById(id);
    }

    @RequestMapping("/getItemByName")
    public Dota2Item getItemByName(String name) {
        return dota2ItemService.getItemByName(name);
    }

    @RequestMapping("/getAllItems")
    public List<Dota2Item> getAllItems() {
        /**
         * 显示第1页2条数据
         */
        PageHelper.startPage(1, 2);
        return dota2ItemService.getAllItems();
    }
}
