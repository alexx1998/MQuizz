package com.mordonia.mquizz.managers;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class ScoreManager {
    private Integer sorcerer, aquamancer, pyromancer, arkan, druid, tempestarii;

    public ScoreManager(Integer sorcerer, Integer aquamancer, Integer pyromancer, Integer arkan, Integer druid, Integer tempestarii){
        this.aquamancer = aquamancer;
        this.arkan = arkan;
        this.druid = druid;
        this.pyromancer = pyromancer;
        this.sorcerer = sorcerer;
        this.tempestarii = tempestarii;
    }

    public Integer getSorcerer() {
        return sorcerer;
    }

    public void setSorcerer(Integer sorcerer) {
        this.sorcerer = sorcerer;
    }

    public Integer getAquamancer() {
        return aquamancer;
    }

    public void setAquamancer(Integer aquamancer) {
        this.aquamancer = aquamancer;
    }

    public Integer getPyromancer() {
        return pyromancer;
    }

    public void setPyromancer(Integer pyromancer) {
        this.pyromancer = pyromancer;
    }

    public Integer getArkan() {
        return arkan;
    }

    public void setArkan(Integer arkan) {
        this.arkan = arkan;
    }

    public Integer getDruid() {
        return druid;
    }

    public void setDruid(Integer druid) {
        this.druid = druid;
    }

    public Integer getTempestarii() {
        return tempestarii;
    }

    public void setTempestarii(Integer tempestarii) {
        this.tempestarii = tempestarii;
    }
}
