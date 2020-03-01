package com.mordonia.mquizz.events;

import com.mordonia.mquizz.managers.ScoreManager;
import com.mordonia.mquizz.managers.ScoreMapManager;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Sign;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.SignChangeEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.scoreboard.Score;

import java.util.List;

import static net.md_5.bungee.api.ChatColor.RED;


public class Listneres implements Listener {
    public ScoreMapManager scoreMapManager;

    public Listneres(ScoreMapManager scoreMapManager){
        this.scoreMapManager = scoreMapManager;
    }

    @EventHandler
    public void createSign(SignChangeEvent event){
            String line = event.getLine(0);
            if(line.equalsIgnoreCase("quizz12")){
            event.setLine(0, ChatColor.translateAlternateColorCodes('§', "§kæ§r §cMagic Quiz §r§kæ§r"));
            event.setLine(1, "Click here to");
            event.setLine(2, "start the Quiz");
            event.setLine(3, ChatColor.translateAlternateColorCodes('§', "§kæ§r §cMagic Quiz §r§kæ§r"));
        }
    }
    @EventHandler
    public void interactSign(PlayerInteractEvent event) {
        Player p = event.getPlayer();
        if (!event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
            return;

        }
        Block b = event.getClickedBlock();

        if (b != null && (b.getType() == Material.WALL_SIGN || b.getType() == Material.SIGN)) {
            Sign sign = (Sign) b.getState();
            String lines[] = sign.getLines();

            if(lines[0].contains("æ")){
                startQuizz(p);
            }


        }
    }

    private void startQuizz(Player player) {
        scoreMapManager.scoreMap.put(player, new ScoreManager(0,0,0,0,0,0));
        TextComponent quizzHeader = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=========&fMagic Quiz&c========="));
        TextComponent warningMsg = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=&fMake sure to click on your answer to move on to the next question!&c=&f"));
        TextComponent question1 = new TextComponent("You’re on your way to an appointment at the market that you do not want to be late for when you see bandits robbing someone. What do you do?");
        TextComponent answer1 = new TextComponent("Go help them; your appointment can wait.");
        TextComponent answer2 = new TextComponent("Shoot arrows at one of the bandits from afar before leaving, hoping to give the victim a chance.");
        TextComponent answer3 = new TextComponent("Don’t help them; this appointment is too important.");
        TextComponent answer4 = new TextComponent("Don’t help them; this appointment is too important.");
        question1.setColor(RED);
        answer1.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND,"/quizz drark1"));
        answer2.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz temp1"));
        answer3.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz sorcpyro1"));
        answer4.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz aqua1"));
        answer1.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click this to submit your answer!").create()));
        answer2.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click this to submit your answer!").create()));
        answer3.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click this to submit your answer!").create()));
        answer4.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click this to submit your answer!").create()));
        player.spigot().sendMessage(quizzHeader);
        player.sendMessage(ChatColor.DARK_RED + "It is highly recommended that you toggle all the chats to begin, so the spam doesn't make the messages get lost!");
        player.spigot().sendMessage(quizzHeader);
        player.spigot().sendMessage(warningMsg);
        player.spigot().sendMessage(question1);
        player.sendMessage(" ");
        player.spigot().sendMessage(answer1);
        player.sendMessage(" ");
        player.spigot().sendMessage(answer2);
        player.sendMessage(" ");
        player.spigot().sendMessage(answer3);
        player.sendMessage(" ");
        player.spigot().sendMessage(answer4);

    }


}
