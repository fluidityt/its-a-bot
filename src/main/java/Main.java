import jdk.nashorn.internal.objects.annotations.Function;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import javax.security.auth.login.LoginException;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.managers.GuildController;
import net.dv8tion.jda.core.requests.restaction.MessageAction;

import java.util.List;

// .....
// here is the test channel
// https://discord.gg/vzVmCX
// ......

public class Main extends ListenerAdapter {

    private static JDABuilder builder;

    public static void main(String[] args) throws javax.security.auth.login.LoginException {

        builder = new JDABuilder(AccountType.BOT);
        builder.setToken("NTI3NDk5MDQwOTU1MzAxOTA5.DwUnwA.ILk6oQwUsQnssMTTu2WRYjxRqzc");
        builder.addEventListener(new Main());
        builder.buildAsync();
        //  builder.setGame(Game.playing("God"));
        // Cat kitty = new Cat();
    }



    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

// some stuff:
        Guild guild = event.getGuild();
        GuildController gController = guild.getController();
        List<Member> members = guild.getMembers();

        JDA jda = event.getJDA();

        MessageChannel channel = event.getChannel();

        String author = event.getAuthor().getName();
        String message = event.getMessage().getContentRaw();
        Member member = event.getMember();

// playing:
        switch (message) {
         /*
            case "!playing":
                //getPresence.setGame(Game.playing("God")); break;
            case "!stopplaying":
                builder.setGame(Game.playing("nothing")); break;
        */


// grizzifier:
            case "!gryzify":
                for (Member mem : members) {
                    String oldName = mem.getUser().getName();
                    if (oldName.contains("fluidityZ")) {}
                    else { gController.setNickname(mem, "Gryz").complete(); }
                }
                channel.sendMessage("Gryz'd!").queue();
                break;

            case "!degryz":
                for (Member mem : members) {
                    String oldName = mem.getUser().getName();
                    if (oldName.contains("fluidityZ")) {}
                    else { gController.setNickname(mem, oldName).complete(); }
                }
               channel.sendMessage("DeGryz'd").queue();
                break;

// roles:
            case "!roled":

                String desiredName = "rolespam";

                if (channel.getName().equals(desiredName)) {
                   gController.addRolesToMember(member, jda.getRolesByName("Roll", true)).queue();
                   channel.sendMessage("Roll'd").queue();
                } else {
                    channel.sendMessage("not in > " + desiredName + " < channel!").queue();
                   // channel.sendMessage("DEBUG: currently in channel: " + channel.getName()).queue();
                }

                break;


// members:

            case "!river":
                channel.sendMessage("is THE SUPER BESTEST.").queue(); break;
            case "!kalek":
                channel.sendMessage("... is less gay that Dim, since Dim has 2 less children.").queue();break;
            case "!riot":
                channel.sendMessage("YOU ARE NOT WELCOME HERE!!!").queue();break;
            case "!gryz":
                channel.sendMessage("*~-~I'm already Gryz~-~*").queue();break;
            case "!neos":
                channel.sendMessage("What's a D1?").queue();break;
            case "!cuck":
                channel.sendMessage("<this message has been censored>").queue();break;
            case "!emblem":
                channel.sendMessage("*Hey I just Q'd up, and this is crazy, but now I'm Master! So YoLo BaBy!*").queue();break;
            case "!ant":
                channel.sendMessage("... tf outta' here we already have a dragon").queue();break;
            case "!owen":
                channel.sendMessage("guys\nlisten\nwe\ndon't\ntalk\nto\nowen").queue();break;
            case "!fluid":
                channel.sendMessage("*~-~ Ur Supp Main ~-~*").queue(); break;
            case "!nerple":
                channel.sendMessage("..*Wants his, baby-back, baby-back~~*").queue(); break;
            case "!skrub":
                channel.sendMessage("...*He's gone... (until Jan 11)*").queue(); break;
            case "!xeno":
                channel.sendMessage("acetoacetatedeoxyribonucelicpyruvatepyrimdineoxidativephosphorylation\nsaying that is as hard as playing Vivian!").queue(); break;
            case "!furia":
                channel.sendMessage("Doesn't need a bot to speak for her ;]").queue(); break;
            case "!suicidols":
                channel.sendMessage("Essence rip META!").queue(); break;
            case "!neos2":
                channel.sendMessage("**Down with the resistance!**").queue(); break;



// RPS:
            case "!scissors":
                channel.sendMessage("Rock!! I win again, " + author).queue();break;
            case "!rock":
                channel.sendMessage("Paper!! I win again, " + author).queue();break;
            case "!paper":
                channel.sendMessage("Scissors!! I win again, " + author).queue();break;

        } // /switch

// random

        if(message.contains("willow") || message.contains("Willow") )  {
            channel.sendMessage("Willo*").queue();
        } else

        if(message.equals("!gword")) {
            channel.sendMessage("shut up, breeder... You're the big straight, " + author + ", not fabulous at all").queue();
        } else

        if(message.equals("!riversucks")) {
            channel.sendMessage("HOW DARE YOU SAY THAT ABOUT HIM!!! " + author).queue();
        } else

        if(message.equals("!randomchamp")) {
            channel.sendMessage("Furia!! Again? Whatter the odds?").queue();
        }


    } // /onMessageReceived
}