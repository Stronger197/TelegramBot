package commands;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.request.SendMessage;

// Response on /start command
public class StartCommand extends Command {
    public String name = "/start"; // <- command

    // logic
    @Override
    public void execute(Message message, TelegramBot telegramBot) {
        Long chatID = message.chat().id();

        // TODO: Something logic

        SendMessage sendMessage = new SendMessage(chatID, Constants.COMMAND_START_TEXT);
        telegramBot.execute(sendMessage);
    }

    @Override
    public String getName() {
        return this.name;
    }
}
