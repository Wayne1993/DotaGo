package com.fish.dotago.service;

import com.fish.dotago.mapper.Dota2ItemMapper;
import com.fish.dotago.model.Dota2Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wayne
 * @date 2017年12月13日
 * <p>
 * servie for item
 */
@Service
public class Dota2ItemService {

    @Autowired
    private Dota2ItemMapper dota2ItemMapper;

    public Dota2Item getItemById(int id) {
        return dota2ItemMapper.getItemById(id);
    }

    public Dota2Item getItemByName(String name) {
        return dota2ItemMapper.getItemByName(name);
    }

    public List<Dota2Item> getAllItems() {
        return dota2ItemMapper.getAllItems();
    }
}
