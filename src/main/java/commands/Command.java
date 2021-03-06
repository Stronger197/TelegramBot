package commands;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Message;


public abstract class Command {
    public String name;

    public abstract String getName();

    public abstract void execute(Message message, TelegramBot telegramBot);

    public boolean contains(String command) {
        return command.equals(getName());
    }
}
