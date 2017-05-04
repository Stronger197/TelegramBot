import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.TelegramBotAdapter;
import com.pengrad.telegrambot.request.GetMe;
import commands.Command;
import commands.Constants;
import commands.StartCommand;

import java.util.ArrayList;
import java.util.List;

public class Bot {
    private static TelegramBot telegramBot; // Bot interface

    private static List<Command> commandsList; // Collection contains all commands

    public static List<Command> getCommandsList() {
        return commandsList;
    }

    // Initialization bot interface
    public static TelegramBot get() {
        if (telegramBot != null) return telegramBot;

        // Initialization commands
        commandsList = new ArrayList<Command>();
        commandsList.add(new StartCommand());
        // TODO: More commands


        telegramBot = TelegramBotAdapter.build(Constants.getBotToken());
        System.out.println(telegramBot.execute(new GetMe()));
        return telegramBot;
    }
}
