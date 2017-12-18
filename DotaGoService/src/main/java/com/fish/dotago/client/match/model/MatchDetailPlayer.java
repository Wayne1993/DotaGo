package com.fish.dotago.client.match.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

@Data
public class MatchDetailPlayer {
    /**
     * 账户Id
     */
    @JSONField(name = "account_id")
    private String accountId;
    /**
     *
     */
    @JSONField(name = "player_slot")
    private String playerSlot;
    /**
     * 英雄Id
     */
    @JSONField(name = "hero_id")
    private String heroId;
    /**
     * 物品栏0
     */
    @JSONField(name = "item_0")
    private String item0;
    /**
     * 物品栏1
     */
    @JSONField(name = "item_1")
    private String item1;
    /**
     * 物品栏2
     */
    @JSONField(name = "item_2")
    private String item2;
    /**
     * 物品栏3
     */
    @JSONField(name = "item_3")
    private String item3;
    /**
     * 物品栏4
     */
    @JSONField(name = "item_4")
    private String item4;
    /**
     * 物品栏5
     */
    @JSONField(name = "item_5")
    private String item5;
    /**
     * 背包0
     */
    @JSONField(name = "backpack_0")
    private String backpack0;
    /**
     * 背包1
     */
    @JSONField(name = "backpack_1")
    private String backpack1;
    /**
     * 背包2
     */
    @JSONField(name = "backpack_2")
    private String backpack2;
    /**
     * 杀敌数
     */
    @JSONField(name = "kills")
    private String kills;
    /**
     * 死亡数
     */
    @JSONField(name = "deaths")
    private String deaths;
    /**
     * 助攻数
     */
    @JSONField(name = "assists")
    private String assists;
    /**
     *
     */
    @JSONField(name = "leaver_status")
    private String leaverStatus;
    /**
     *
     */
    @JSONField(name = "last_hits")
    private String lastHits;
    /**
     *
     */
    @JSONField(name = "denies")
    private String denies;
    /**
     * 每分钟金钱数
     */
    @JSONField(name = "gold_per_min")
    private String goldPerMin;
    /**
     * 每分钟经验数
     */
    @JSONField(name = "xp_per_min")
    private String xpPerMin;
    /**
     * 等级
     */
    @JSONField(name = "level")
    private String level;
    /**
     *对英雄造成伤害
     */
    @JSONField(name = "hero_damage")
    private String heroDamage;
    /**
     *对防御塔造成伤害
     */
    @JSONField(name = "tower_damage")
    private String towerDamage;
    /**
     *对英雄治疗数
     */
    @JSONField(name = "hero_healing")
    private String heroHealing;
    /**
     *
     */
    @JSONField(name = "gold")
    private String gold;
    /**
     *
     */
    @JSONField(name = "gold_spent")
    private String goldSpent;
    /**
     *
     */
    @JSONField(name = "scaled_hero_damage")
    private String scaledHeroDamage;
    /**
     *
     */
    @JSONField(name = "scaled_tower_damage")
    private String scaledTowerDamage;
    /**
     *
     */
    @JSONField(name = "scaled_hero_healing")
    private String scaledHeroHealing;
    /**
     *
     */
    @JSONField(name = "ability_upgrades")
    private List<MatchDetailAbilityUpgrades> abilityUpgrades;

}
