package com.mordonia.mquizz.managers;

import org.bukkit.entity.Player;

import java.util.HashMap;

public class ScoreMapManager {

    public HashMap<Player, ScoreManager> scoreMap = new HashMap<>();


    public HashMap getMap() {
        return scoreMap;
    }


    public void addPyro(Player p) {
        int pyroScore = scoreMap.get(p).getPyromancer();
        int pyroNext = pyroScore + 1;
        scoreMap.get(p).setPyromancer(pyroNext);
    }

    public void addAqua(Player p) {
        int aquaScore = scoreMap.get(p).getAquamancer();
        int aquaNext = aquaScore + 1;
        scoreMap.get(p).setAquamancer(aquaNext);
    }

    public void addTemp(Player p){
        int tempscore = scoreMap.get(p).getTempestarii();
        int tempNext = tempscore + 1;
        scoreMap.get(p).setTempestarii(tempNext);
    }
    public void addDru(Player p){
        int druscore = scoreMap.get(p).getDruid();
        int druNext = druscore + 1 ;
        scoreMap.get(p).setDruid(druNext);
    }
    public void addArk(Player p){
        int arkScore = scoreMap.get(p).getArkan();
        int arkNext = arkScore + 1 ;
        scoreMap.get(p).setArkan(arkNext);
    }
    public void addSorc(Player p){
        int sorcScore = scoreMap.get(p).getSorcerer();
        int sorcNext = sorcScore + 1;
        scoreMap.get(p).setSorcerer(sorcNext);

    }

}
