import jdk.nashorn.internal.objects.annotations.Function;
import net.dv8tion.jda.core.AccountType;
        import net.dv8tion.jda.core.JDABuilder;
        import net.dv8tion.jda.core.hooks.ListenerAdapter;
        import javax.security.auth.login.LoginException;
        import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.requests.restaction.MessageAction;

public class Main extends ListenerAdapter {
    public static void main(String[] args) throws javax.security.auth.login.LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        builder.setToken("NTI3NDk5MDQwOTU1MzAxOTA5.DwUnwA.ILk6oQwUsQnssMTTu2WRYjxRqzc");
        builder.addEventListener(new Main());
        builder.buildAsync();

    }



    @Override
    public void onMessageReceived(MessageReceivedEvent event) {

        String author = event.getAuthor().getName();
        String message = event.getMessage().getContentRaw();
        //https://discord.gg/vzVmCX
        // members

        switch (message) {
            case "!river":
                event.getChannel().sendMessage("is THE SUPER BESTEST.").queue(); break;
            case "!kalek":
                event.getChannel().sendMessage("... is less gay that Dim, since Dim has 2 less children.").queue();break;
            case "!riot":
                event.getChannel().sendMessage("YOU ARE NOT WELCOME HERE!!!").queue();break;
            case "!gryz":
                event.getChannel().sendMessage("*~-~I'm already Gryz~-~*").queue();break;
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
            case "!neos":
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
