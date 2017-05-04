import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.*;
import com.pengrad.telegrambot.model.Update;
import commands.Command;

import java.util.List;

//Used for getting new requests to bot
public class InputController {

    private static List<Command> commandsList;
    private static TelegramBot telegramBot;
    private static Message message;


    // start application
    public InputController() {
        telegramBot = Bot.get();
        telegramBot.setUpdatesListener(updatesListener);
        commandsList = Bot.getCommandsList();
    }


    private static final UpdatesListener updatesListener = new UpdatesListener() {
        public int process(List<Update> updates) {
            message = updates.get(updates.size() - 1).message();

            for (Command command : commandsList) {
                if (command.contains(message.text())) {
                    command.execute(message, telegramBot);
                    break;
                }
            }
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        }
    };


}
