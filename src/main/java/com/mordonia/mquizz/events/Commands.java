package com.mordonia.mquizz.events;

import com.mordonia.mquizz.MQuizz;
import com.mordonia.mquizz.managers.ScoreMapManager;
import com.sun.java.accessibility.util.internal.TextComponentTranslator;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;


import static net.md_5.bungee.api.ChatColor.*;
import static org.bukkit.Sound.*;

public class Commands implements CommandExecutor {
    private JavaPlugin mquizz = MQuizz.getProvidingPlugin(MQuizz.class);
    private ScoreMapManager scoreMapManager;
    public Commands(ScoreMapManager scoreMapManager){
        this.scoreMapManager = scoreMapManager;
    }


    private void clearChat(Player p){
        for(int i=0;  i<150; i++){
            p.sendMessage(" ");
        }
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("quizz")){
            if(args.length < 1){
                return false;
            }
            String subcommand = args[0];
            Player p = (Player) sender;
            int druid = scoreMapManager.scoreMap.get(p).getDruid();
            int aqua = scoreMapManager.scoreMap.get(p).getAquamancer();
            int pyro = scoreMapManager.scoreMap.get(p).getPyromancer();
            int sorc = scoreMapManager.scoreMap.get(p).getSorcerer();
            int arkan = scoreMapManager.scoreMap.get(p).getArkan();
            int temp = scoreMapManager.scoreMap.get(p).getTempestarii();
            switch (subcommand){
                default: break;
                case("drark1"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addDru(p);
                    scoreMapManager.addArk(p);
                    questionSet2(p);
                    break;
                case("temp1"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addTemp(p);
                    questionSet2(p);
                    break;

                case("sorcpyro1"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addSorc(p);
                    scoreMapManager.addPyro(p);
                    questionSet2(p);
                    break;
                case("aqua1"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addAqua(p);
                    questionSet2(p);
                    break;
                case("ark2"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addArk(p);
                    questionSet3(p);
                    break;
                case("dru2"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addDru(p);
                    questionSet3(p);
                    break;
                case("aqua2"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addAqua(p);
                    questionSet3(p);
                    break;
                case("sorc2"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addSorc(p);
                    questionSet3(p);
                    break;
                case("tempyro2"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addTemp(p);
                    scoreMapManager.addPyro(p);
                    questionSet3(p);
                    break;
                case("tempyro3"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addTemp(p);
                    scoreMapManager.addPyro(p);
                    questionSet4(p);
                    break;
                case("aqua3"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addAqua(p);
                    questionSet4(p);
                    break;
                case("dru3"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addDru(p);
                    questionSet4(p);
                    break;
                case("arksorc3"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addSorc(p);
                    scoreMapManager.addArk(p);
                    questionSet4(p);
                    break;
                case("tempyro4"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addTemp(p);
                    scoreMapManager.addPyro(p);
                    questionSet5(p);
                    break;
                case("aqua4"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addAqua(p);
                    questionSet5(p);
                    break;
                case("dru4"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addDru(p);
                    questionSet5(p);
                    break;
                case("arksorc4"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addSorc(p);
                    scoreMapManager.addArk(p);
                    questionSet5(p);
                    break;
                case("pyro5"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addPyro(p);
                    questionSet6(p);
                    break;
                case("aqua5"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addAqua(p);
                    questionSet6(p);
                case("druitemp5"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addDru(p);
                    scoreMapManager.addTemp(p);
                    questionSet6(p);
                    break;
                case("ark5"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addArk(p);
                    questionSet6(p);
                    break;
                case("sorc5"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addSorc(p);
                    questionSet6(p);
                    break;
                case("aqua6"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addAqua(p);
                    questionSet7(p);
                    break;
                case("pyro6"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addPyro(p);
                    questionSet7(p);
                    break;
                case("temp6"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addTemp(p);
                    questionSet7(p);
                    break;
                case("dru6"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addDru(p);
                    questionSet7(p);
                    break;
                case("sorc6"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addSorc(p);
                    questionSet7(p);
                    break;
                case("ark6"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addArk(p);
                    questionSet7(p);
                    break;
                case("tempyro7"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addTemp(p);
                    scoreMapManager.addPyro(p);
                    questionSet8(p);
                    break;
                case("aqua7"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addAqua(p);
                    questionSet8(p);
                    break;
                case("dru7"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addDru(p);
                    questionSet8(p);
                    break;
                case("arksorc7"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addArk(p);
                    scoreMapManager.addSorc(p);
                    questionSet8(p);
                    break;
                case("aqua8"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addAqua(p);
                    questionSet9(p);
                    break;
                case("sorc8"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addSorc(p);
                    questionSet9(p);
                    break;
                case("tempdru8"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addTemp(p);
                    scoreMapManager.addDru(p);
                    questionSet9(p);
                    break;
                case("pyro8"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addPyro(p);
                    questionSet9(p);
                    break;
                case("ark8"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addArk(p);
                    questionSet9(p);
                    break;
                case("pyro9"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addPyro(p);
                    questionSet10(p);
                    break;
                case("tempdru9"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addTemp(p);
                    scoreMapManager.addDru(p);
                    questionSet10(p);
                    break;
                case("sorc9"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addSorc(p);
                    questionSet10(p);
                    break;
                case("aqua9"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addAqua(p);
                    questionSet10(p);
                    break;
                case("ark9"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addArk(p);
                    questionSet10(p);
                    break;
                case("arkpyro10"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addArk(p);
                    scoreMapManager.addPyro(p);
                    questionSet11(p);
                    break;
                case("tempsorc10"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addTemp(p);
                    scoreMapManager.addSorc(p);
                    questionSet11(p);
                    break;
                case("aqua10"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addAqua(p);
                    questionSet11(p);
                    break;
                case("dru10"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addDru(p);
                    questionSet11(p);
                    break;
                case("tempyro11"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addTemp(p);
                    scoreMapManager.addPyro(p);
                    questionSet12(p);
                    break;
                case("dru11"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addDru(p);
                    questionSet12(p);
                    break;
                case("arksorc11"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addArk(p);
                    scoreMapManager.addSorc(p);
                    questionSet12(p);
                    break;
                case("aqua11"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addAqua(p);
                    questionSet12(p);
                    break;
                case("sorcark12"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addSorc(p);
                    scoreMapManager.addArk(p);
                    quizzEnd(p);
                    break;
                case("aquadru12"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addAqua(p);
                    scoreMapManager.addDru(p);
                    quizzEnd(p);
                    break;
                case("temp12"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addTemp(p);
                    quizzEnd(p);
                    break;
                case("pyro12"):
                    p.playSound(p.getLocation(), ENTITY_EXPERIENCE_ORB_PICKUP, 10,29);
                    scoreMapManager.addPyro(p);
                    quizzEnd(p);
                    break;
            }
        }
        return true;
    }

    private void questionSet2(Player p){
        TextComponent quizzHeader = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=======&fMagic Quiz&c======="));
        TextComponent question2 = new TextComponent("You arrive at your appointment and notice that the items are fake. However, you see hunger lines on the merchant’s face and children. What do you do?");
        TextComponent answer21 = new TextComponent("Have the merchant arrested by guards");
        TextComponent answer22 = new TextComponent("Tell the merchant to stop selling fake products or you’ll report them");
        TextComponent answer23 = new TextComponent("Pretend you didn’t notice");
        TextComponent answer24 = new TextComponent("Blackmail the merchant");
        TextComponent answer25 = new TextComponent("Loudly confront the merchant");
        answer21.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer22.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer23.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer24.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer25.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer21.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz ark2"));
        answer22.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz dru2"));
        answer23.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz aqua2"));
        answer24.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz sorc2"));
        answer25.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz tempyro2"));
        question2.setColor(RED);

        clearChat(p);

        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(question2);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(answer21);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer22);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer23);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer24);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer25);

    }

    private void questionSet3(Player p){
        TextComponent quizzHeader = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=======&fMagic Quiz&c======="));
        TextComponent question3 = new TextComponent("After your appointment, you continue your way through the marketplace. You notice a few merchants eyeing you from their stalls and silently whispering to each other. What do you do?");
        question3.setColor(RED);
        TextComponent answer31 = new TextComponent("You walk up to the merchants and confront them, making quite a scene in the town square.");
        TextComponent answer32 = new TextComponent("You take a look at them and act as if it never happened, walking away.");
        TextComponent answer33 = new TextComponent("You begin walking up to the merchants, and quietly threaten for talking trash, turning away with a grin on your face.");
        TextComponent answer34 = new TextComponent("You roll your eyes at the merchants and decide that confronting them isn’t worth your time, and just go on with your day.");

        answer31.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer32.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer33.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer34.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));

        answer31.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz tempyro3"));
        answer32.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz aqua3"));
        answer33.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz dru3"));
        answer34.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz arksorc3"));
        clearChat(p);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(question3);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(answer31);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer32);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer33);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer34);
        p.sendMessage(" ");
    }

    public void questionSet4(Player p){
        TextComponent quizzHeader = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=======&fMagic Quiz&c======="));
        TextComponent question4 = new TextComponent("On your way out of the market, you spot someone trip over a loose stone and plummet to the ground, spilling their bag of goods all over the place. What do you do?");
        question4.setColor(RED);

        TextComponent answer41 = new TextComponent("You help them up and gather their items, but “accidentally” end up with one of their apples");
        TextComponent answer42 = new TextComponent("You quickly rush over to the person and assist them in gathering their belongings and helping them up. You make sure they aren’t injured, and continue on your way.");
        TextComponent answer43 = new TextComponent("You help the person up and assist in gathering their belongings, but end up chatting with the citizen for a while and becoming friends.");
        TextComponent answer44 = new TextComponent("You contemplate whether this person is worth your time or not, but decide helping them would be the right thing to do. You help them up and aid them in gathering a few of their belongings. After they walk off, you fix the loose stone and continue with you day.");

        answer41.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer42.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer43.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer44.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));

        answer41.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz tempyro4"));
        answer42.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz aqua4"));
        answer43.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz dru4"));
        answer44.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz arksorc4"));
        clearChat(p);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(question4);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(answer41);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer42);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer43);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer44);
        p.sendMessage(" ");
    }

    public void questionSet5(Player p){
        TextComponent quizzHeader = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=======&fMagic Quiz&c======="));
        TextComponent question5 = new TextComponent("As you enter the forest and strike a look around you notice a wounded wolf crying for help, an arrow is sticking out of his back. What do you do?");
        question5.setColor(RED);

        TextComponent answer51 = new TextComponent("You decide to put an end to the suffering animals misery. ");
        TextComponent answer52 = new TextComponent("Without thinking about whether or not it might attack you after you helped the poor animal you decide to heal the wolf.");
        TextComponent answer53 = new TextComponent("Seeing the poor animal in pain makes you feel sad and angry for it, you to take action and pull out the arrow out of it and look around to see who did the horrible deed.");
        TextComponent answer54 = new TextComponent("You start thinking whether or not helping the animal would put you in danger and you come to the conclusion that it will and decide not to help it.");
        TextComponent answer55 = new TextComponent("You think about the possibility of training it in your favor, you feel no compassion for it but you still save its life for your own personal gain.");

        answer51.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer52.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer53.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer54.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer55.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));

        answer51.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz pyro5"));
        answer52.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz aqua5"));
        answer53.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz druitemp5"));
        answer54.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz ark5"));
        answer55.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz sorc5"));
        clearChat(p);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(question5);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(answer51);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer52);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer53);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer54);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer55);


    }
    public void questionSet6(Player p){
        TextComponent quizzHeader = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=======&fMagic Quiz&c======="));
        TextComponent question6 = new TextComponent("You proceed through the forest when you start feeling a bit hungry. You check your backpack and see that you have no food left, and look around to see an unusual berry bush that you do not recognize.");
        question6.setColor(RED);

        TextComponent answer61 = new TextComponent("If you can't find any food source, might as well eat the berry even if it might harm your health. ");
        TextComponent answer62 = new TextComponent("You are so hungry you go eating the berries without question.");
        TextComponent answer63 = new TextComponent("You decide to be patient and not risk getting poisoned from the berry and look for another food source.");
        TextComponent answer64 = new TextComponent("You don't get scared by the berries and you go ahead and eat them trusting your instinct.");
        TextComponent answer65 = new TextComponent("You pick up the berries but save them to test them on something else before eating them yourself.");
        TextComponent answer66 = new TextComponent("You look carefully at the berries and you try to remember the species but fail and decide not to risk it.");


        answer61.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer62.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer63.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer64.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer65.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer66.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));


        answer61.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz pyro6"));
        answer62.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz temp6"));
        answer63.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz aqua6"));
        answer64.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz dru6"));
        answer65.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz sorc6"));
        answer66.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz ark6"));
        clearChat(p);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(question6);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(answer61);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer62);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer63);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer64);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer65);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer66);

    }
    public void questionSet7(Player p){
        TextComponent quizzHeader = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=======&fMagic Quiz&c======="));
        TextComponent question7 = new TextComponent("After encountering the berry bush, you continue on your way in the forest. You’re overcome with fatigue and contemplate taking a nap between some dense bushes. What do you do?");
        question7.setColor(RED);

        TextComponent answer71 =  new TextComponent("You try and get comfortable in a large pile of leaves and end up falling asleep for a while, unsure of how you would feel when you wake up.");
        TextComponent answer72 = new TextComponent("You set up a small bed with various bunches of leaves and dried foliage, soon falling asleep.");
        TextComponent answer73 = new TextComponent("You plop down on the pile of leaves and instantly fall asleep without a single care.");
        TextComponent answer74 = new TextComponent("You decide not to risk it and continue on, despite being very tired, as anything could easily attack you when you’re asleep.");

        answer71.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer72.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer73.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer74.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));

        answer71.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz tempyro7"));
        answer72.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz aqua7"));
        answer73.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz dru7"));
        answer74.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz arksorc7"));
        clearChat(p);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(question7);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(answer71);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer72);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer73);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer74);


    }
    public void questionSet8(Player p){
        TextComponent quizzHeader = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=======&fMagic Quiz&c======="));
        TextComponent question8 = new TextComponent(" You find a few exits from the woods, each looking very different. Which do you take?");

        question8.setColor(RED);

        TextComponent answer81 =  new TextComponent("The steep but safe looking path filled with rocks.");
        TextComponent answer82 =  new TextComponent("The medium path filled with bushes you must clear");
        TextComponent answer83 =  new TextComponent("The short path filled with dangerous animals and traps");
        TextComponent answer84 =  new TextComponent("The mysterious path filled with glowing foliage");
        TextComponent answer85 =  new TextComponent("The long and well-worn path");

        answer81.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer82.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer83.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer84.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer85.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));

        answer81.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz aqua8"));
        answer82.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz sorc8"));
        answer83.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz pyro8"));
        answer84.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz tempdru8"));
        answer85.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz ark8"));
        clearChat(p);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(question8);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(answer81);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer82);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer83);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer84);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer85);

    }
    public void questionSet9(Player p){
        TextComponent quizzHeader = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=======&fMagic Quiz&c======="));
        TextComponent question9 = new TextComponent("You finally arrive in the city, tired and starving. You approach the bakery and see the price for a fresh loaf of bread is 5 pieces, but you have only 1. What do you do?");

        question9.setColor(RED);

        TextComponent answer91 =  new TextComponent("Steal one of the older pieces of bread.");
        TextComponent answer92 =  new TextComponent("Look around for other stalls.");
        TextComponent answer93 =  new TextComponent("Barter with the baker.");
        TextComponent answer94 =  new TextComponent("Politely explain your situation and beg for a loaf for your piece.");
        TextComponent answer95 =  new TextComponent("Help the baker barter with other customers in exchange for food.");

        answer91.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer92.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer93.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer94.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer95.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));

        answer91.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz pyro9"));
        answer92.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz tempdru9"));
        answer93.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz sorc9"));
        answer94.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz aqua9"));
        answer95.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz ark9"));
        clearChat(p);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(question9);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(answer91);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer92);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer93);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer94);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer95);


    }
    public void questionSet10(Player p){
        TextComponent quizzHeader = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=======&fMagic Quiz&c======="));
        TextComponent question10 = new TextComponent("You approach the castle to tell the king important news. The line is long and may take you the whole day to wait, but filled with citizens complaining of petty theft. What do you do?");

        question10.setColor(RED);
        TextComponent answer101 =  new TextComponent("Butt the line, your info is too valuable.");
        TextComponent answer102 =  new TextComponent("Tell everyone the king is in a bad mood and will deny all requests, making many civilians leave.");
        TextComponent answer103 =  new TextComponent("Patiently wait in line, knowing you may not see the king today.");
        TextComponent answer104=  new TextComponent("Leave in hopes that the king will see you tomorrow");

        answer101.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer102.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer103.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer104.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));

        answer101.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz arkpyro10"));
        answer102.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz tempsorc10"));
        answer103.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz aqua10"));
        answer104.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz dru10"));
        clearChat(p);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(question10);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(answer101);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer102);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer103);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer104);
    }
    public void questionSet11(Player p){
        TextComponent quizzHeader = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=======&fMagic Quiz&c======="));
        TextComponent question11 = new TextComponent("As you leave the castle you hear a few guards discussing how to murder the king. What do you do?");

        question11.setColor(RED);

        TextComponent answer111 =  new TextComponent("You attack the traitors, making as much noise as possible.");
        TextComponent answer112 =  new TextComponent("You rush back to the king to tell him of this plot immediately, unsure of who you can trust.");
        TextComponent answer113 =  new TextComponent("You watch the men taking note of everything they say and their appearance to report to the king.");
        TextComponent answer114 =  new TextComponent("You pretend you didn’t see anything, telling other guards to check the alley.");

        answer111.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer112.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer113.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer114.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));

        answer111.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz tempyro11"));
        answer112.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz dru11"));
        answer113.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz arksorc11"));
        answer114.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz aqua11"));
        clearChat(p);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(question11);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(answer111);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer112);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer113);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer114);

    }
    public void questionSet12(Player p){
        TextComponent quizzHeader = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=======&fMagic Quiz&c======="));
        TextComponent question12 = new TextComponent("You walk to the gates to find your horse and begin your journey home when you realize your horse has fallen ill. You haven’t seen your family in months. What do you do?");

        question12.setColor(RED);
        TextComponent answer121 =  new TextComponent("Leave the horse with the stable master and rent another horse until you can return.");
        TextComponent answer122 =  new TextComponent("Attempt to heal the horse, resolving to stay until it is healthy again.");
        TextComponent answer123 =  new TextComponent("Rent a wagon to carry you and the horse back home.");
        TextComponent answer124 =  new TextComponent("Travel home on your horse with medical supplies in hopes that the horse will last- you miss your family too much.");

        answer121.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer122.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer123.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));
        answer124.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("Click here to submit your answer").create()));

        answer121.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz sorcark12"));
        answer122.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz aquadru12"));
        answer123.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz temp12"));
        answer124.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/quizz pyro12"));
        clearChat(p);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(question12);
        p.spigot().sendMessage(quizzHeader);
        p.spigot().sendMessage(answer121);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer122);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer123);
        p.sendMessage(" ");
        p.spigot().sendMessage(answer124);


    }

    public void quizzEnd(Player p){
        TextComponent quizzHeader = new TextComponent(ChatColor.translateAlternateColorCodes('&', "&c=======&fMagic Quiz&c======="));
        int druid = scoreMapManager.scoreMap.get(p).getDruid();
        int aqua = scoreMapManager.scoreMap.get(p).getAquamancer();
        int pyro = scoreMapManager.scoreMap.get(p).getPyromancer();
        int sorc = scoreMapManager.scoreMap.get(p).getSorcerer();
        int arkan = scoreMapManager.scoreMap.get(p).getArkan();
        int temp = scoreMapManager.scoreMap.get(p).getTempestarii();

        if(druid > sorc && druid > aqua && druid > pyro && druid >arkan && druid > temp){
            TextComponent druTitle = new TextComponent("You are a Druid");
            TextComponent resultTitleDruid = new TextComponent(ChatColor.translateAlternateColorCodes('&', "Congratulations your result is: &aDruid"));
            TextComponent resultSumDruid = new TextComponent("Druids are a variety of emotions and traits. Instinctual, strong-willed, emotionally driven. They are too trusting, but with that in mind they are also passionate, optimistic and brave. They are a good alignment.");
            resultSumDruid.setColor(GREEN);
            druTitle.setColor(GREEN);
            druTitle.setBold(true);
            druTitle.setUnderlined(true);
            p.playSound(p.getLocation(), ENTITY_WOLF_HOWL, 10,29);

            p.spigot().sendMessage(ChatMessageType.ACTION_BAR, druTitle);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultTitleDruid);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultSumDruid);
            return;
        }
        else if(sorc > arkan && sorc > druid && sorc > aqua && sorc > temp && sorc > pyro){
            TextComponent sorcTitle = new TextComponent("You are a Sorcerer");
            TextComponent resultTitleSorc = new TextComponent(ChatColor.translateAlternateColorCodes('&', "Congratulations your result is: &8Sorcerer"));
            TextComponent resultSumSorc = new TextComponent("Sorcerers embody more of an evil alignment. They are very sly and uncompassionate people. Though when it comes to themselves, they are diligent and hard-working. Of course, they lean more to an evil alignment.");
            resultSumSorc.setColor(DARK_GRAY);
            sorcTitle.setColor(DARK_GRAY);
            sorcTitle.setBold(true);
            sorcTitle.setUnderlined(true);
            p.playSound(p.getLocation(), BLOCK_PORTAL_TRAVEL, 10,29);
            p.spigot().sendMessage(ChatMessageType.ACTION_BAR, sorcTitle);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultTitleSorc);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultSumSorc);
            return;
        }
        else if(pyro > sorc && pyro > arkan && pyro > aqua && pyro > temp && pyro > druid){
            TextComponent pyroTitle = new TextComponent("You are a Pyromancer");
            TextComponent resultTitlePyro = new TextComponent(ChatColor.translateAlternateColorCodes('&', "Congratulations your result is: &cPyromancer"));
            TextComponent resultSumPyro = new TextComponent("Pyromancers may be hot-headed, but they are also very strong willed, passionate, and committed people. When they set their eyes on something, they won't give up until they get where they need to be. They are a neutral alignment.");
            pyroTitle.setColor(RED);
            pyroTitle.setBold(true);
            pyroTitle.setUnderlined(true);
            resultSumPyro.setColor(RED);

            p.playSound(p.getLocation(), ENTITY_GENERIC_EXPLODE, 10,29);
            p.spigot().sendMessage(ChatMessageType.ACTION_BAR, pyroTitle);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultTitlePyro);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultSumPyro);
            return;
        }
        else if(aqua > sorc && aqua > arkan && aqua > pyro && aqua > druid && aqua > temp){
            TextComponent aquaTitle = new TextComponent("You are a Aquamancer");
            TextComponent resultTitleAqua = new TextComponent(ChatColor.translateAlternateColorCodes('&', "Congratulations your result is: &9Aquamancer"));
            TextComponent resultSumAqua = new TextComponent("Aquamancers dislike conflict, and more often than not they are pushovers. But aside from that, they are patient, calm, polite and nurturing people. They are supports and a healing people. They are a good alignment.");
            aquaTitle.setColor(BLUE);
            aquaTitle.setBold(true);
            aquaTitle.setUnderlined(true);
            resultSumAqua.setColor(BLUE);

            p.playSound(p.getLocation(), ENTITY_GENERIC_SPLASH, 10,29);
            p.spigot().sendMessage(ChatMessageType.ACTION_BAR, aquaTitle);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultTitleAqua);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultSumAqua);
            return;
        }
        else if(temp > sorc && temp > arkan && temp > pyro && temp > aqua && temp > druid){
            TextComponent tempTitle = new TextComponent("You are a Tempestarii");
            TextComponent resultTitleTemp = new TextComponent(ChatColor.translateAlternateColorCodes('&', "Congratulations your result is: &fTempestarii"));
            TextComponent resultSumTemp = new TextComponent("Tempestariis are reckless and defiant, but they are also adventurous, free spirited and open to new possibilities. They are easy going people and live to feel the wind in their hair. They are more of a good alignment.");
            tempTitle.setColor(WHITE);
            tempTitle.setBold(true);
            tempTitle.setUnderlined(true);
            resultSumTemp.setColor(WHITE);

            p.playSound(p.getLocation(), ENTITY_LIGHTNING_BOLT_THUNDER, 10,29);
            p.spigot().sendMessage(ChatMessageType.ACTION_BAR, tempTitle);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultTitleTemp);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultSumTemp);
            return;
        }
        else if(arkan > sorc && arkan > pyro && arkan > aqua && arkan > druid && arkan > temp){
            TextComponent arkTitle = new TextComponent("You are a Arkan");
            TextComponent resultTitleArk = new TextComponent(ChatColor.translateAlternateColorCodes('&', "Congratulations your result is: &7Arkan"));
            TextComponent resultSumArk = new TextComponent("Arkans are studious and logical people, but they are also very very aloof. If they feel it is safe enough, they would put their butts on the line, but only if it made sense to. They are a neutral alignment.");
            arkTitle.setColor(GRAY);
            arkTitle.setBold(true);
            arkTitle.setUnderlined(true);
            resultSumArk.setColor(GRAY);

            p.playSound(p.getLocation(), AMBIENT_CAVE, 10,29);
            p.spigot().sendMessage(ChatMessageType.ACTION_BAR, arkTitle);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultTitleArk);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultSumArk);
            return;
        }
        else{
            TextComponent multiTitle = new TextComponent(ChatColor.translateAlternateColorCodes('&', "You are a &k??????"));
            TextComponent resultTitleMulti = new TextComponent(ChatColor.translateAlternateColorCodes('&', "Congratulations your result is: &k????"));
            TextComponent resultSumMulti = new TextComponent("Hmm... It seems you have a strong power... and you have more than one affinity you can relate to... If you wish to take the quizz again to get a different result feel free to do so!");
            TextComponent resultMultiScore = new TextComponent(ChatColor.translateAlternateColorCodes('&', "" +
                    "&dArkan - " + arkan +
                    "\n&5Sorcerer - " + sorc +
                    "\n&2Druid - "+ druid +
                    "\n&bAquamancer - "+ aqua +
                    "\n&cPyromancer - " + pyro+
                    "\n&fTempestarii - " + temp));
            resultSumMulti.setColor(GOLD);
            resultTitleMulti.setColor(GOLD);
            multiTitle.setColor(GOLD);

            p.playSound(p.getLocation(), ENTITY_ENDER_DRAGON_AMBIENT, 10,29);
            p.spigot().sendMessage(ChatMessageType.ACTION_BAR, multiTitle);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultTitleMulti);
            p.spigot().sendMessage(quizzHeader);
            p.spigot().sendMessage(resultSumMulti);
            p.spigot().sendMessage(resultMultiScore);
            p.spigot().sendMessage(quizzHeader);
        }
    }
}
