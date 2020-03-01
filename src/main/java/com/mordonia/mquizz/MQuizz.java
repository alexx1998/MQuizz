package com.mordonia.mquizz;

import com.mordonia.mquizz.events.Commands;
import com.mordonia.mquizz.events.Listneres;
import com.mordonia.mquizz.managers.ScoreMapManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scoreboard.Score;

import java.util.Objects;

public final class MQuizz extends JavaPlugin {

    @Override
    public void onEnable() {
        ScoreMapManager scoreMapManager = new ScoreMapManager();
        this.getServer().getPluginManager().registerEvents(new Listneres(scoreMapManager), this);
        Objects.requireNonNull(this.getCommand("quizz")).setExecutor(new Commands(scoreMapManager));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
