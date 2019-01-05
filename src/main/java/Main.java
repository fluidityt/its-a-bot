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

public class Main extends ListenerAdapter {

    private static JDABuilder builder;

    public static void main(String[] args) throws javax.security.auth.login.LoginException {

        builder = new JDABuilder(AccountType.BOT);
        builder.setToken("NTI3NDk5MDQwOTU1MzAxOTA5.DwUnwA.ILk6oQwUsQnssMTTu2WRYjxRqzc");
        builder.addEventListener(new Main());
        builder.buildAsync();
        //  builder.setGame(Game.playing("God"));
        Cat kitty = new Cat();
    }



    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        Guild guild = event.getGuild();
        MessageChannel channel = event.getChannel();
        GuildController gController = event.getTextChannel().getGuild().getController();
        String author = event.getAuthor().getName();
        String message = event.getMessage().getContentRaw();
        List<Member> members = guild.getMembers();

        //https://discord.gg/vzVmCX

        switch (message) {
/*            case "!playing":
                //getPresence.setGame(Game.playing("God")); break;
            case "!stopplaying":
                builder.setGame(Game.playing("nothing")); break;*/

            case "!gryzify":

                for (Member mem : members) {
                    String oldName = mem.getUser().getName();
                    if (oldName.contains("fluidityZ")) {}
                    else { gController.setNickname(mem, "Gryz").complete(); }
                }
                event.getChannel().sendMessage("Gryz'd!").queue();
                break;

            case "!degryz":

                for (Member mem : members) {
                    String oldName = mem.getUser().getName();
                    if (oldName.contains("fluidityZ")) {}
                    else { gController.setNickname(mem, oldName).complete(); }
                }
                event.getChannel().sendMessage("DeGryz'd").queue();
                break;

            case "!game":
                break;
// members

            case "!river":
                event.getChannel().sendMessage("is THE SUPER BESTEST.").queue(); break;
            case "!kalek":
                event.getChannel().sendMessage("... is less gay that Dim, since Dim has 2 less children.").queue();break;
            case "!riot":
                event.getChannel().sendMessage("YOU ARE NOT WELCOME HERE!!!").queue();break;
            case "!gryz":
                event.getChannel().sendMessage("*~-~I'm already Gryz~-~*").queue();break;
            case "!neos":
                event.getChannel().sendMessage("What's a D1?").queue();break;
            case "!cuck":
                event.getChannel().sendMessage("<this message has been censored>").queue();break;
            case "!emblem":
                event.getChannel().sendMessage("*Hey I just Q'd up, and this is crazy, but now I'm Master! So YoLo BaBy!*").queue();break;
            case "!ant":
                event.getChannel().sendMessage("... tf outta' here we already have a dragon").queue();break;
            case "!owen":
                event.getChannel().sendMessage("guys\nlisten\nwe\ndon't\ntalk\nto\nowen").queue();break;
            case "!fluid":
                event.getChannel().sendMessage("*~-~ Ur Supp Main ~-~*").queue(); break;
            case "!nerple":
                event.getChannel().sendMessage("..*Wants his, baby-back, baby-back~~*").queue(); break;
            case "!skrub":
                event.getChannel().sendMessage("...*He's gone... (until Jan 11)*").queue(); break;
            case "!xeno":
                event.getChannel().sendMessage("acetoacetatedeoxyribonucelicpyruvatepyrimdineoxidativephosphorylation\nsaying that is as hard as playing Vivian!").queue(); break;
            case "!furia":
                event.getChannel().sendMessage("Doesn't need a bot to speak for her ;]").queue(); break;
            case "!suicidols":
                event.getChannel().sendMessage("Essence rip META!").queue(); break;
            case "!neos2":
                event.getChannel().sendMessage("**Down with the resistance!**").queue(); break;




// RPS:
            case "!scissors":
                event.getChannel().sendMessage("Rock!! I win again, " + author).queue();break;
            case "!rock":
                event.getChannel().sendMessage("Paper!! I win again, " + author).queue();break;
            case "!paper":
                event.getChannel().sendMessage("Scissors!! I win again, " + author).queue();break;
        }
        // random

        if(message.contains("willow") || message.contains("Willow") )  {
            event.getChannel().sendMessage("Willo*").queue();
        } else

        if(message.equals("!gword")) {
            event.getChannel().sendMessage("shut up, breeder... You're the big straight, " + author + ", not fabulous at all").queue();
        } else

        if(message.equals("!riversucks")) {
            event.getChannel().sendMessage("HOW DARE YOU SAY THAT ABOUT HIM!!! " + author).queue();
        } else

        if(message.equals("!randomchamp")) {
            event.getChannel().sendMessage("Furia!! Again? Whatter the odds?").queue();
        }


    } // end




}