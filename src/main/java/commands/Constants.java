package commands;

public class Constants {

    // BOT TOKEN
    protected static String BOT_TOKEN = "";

    // URL
    public static final String BOT_URL = "https://api.telegram.org/bot" + BOT_TOKEN;

    public static final String COMMAND_START_TEXT = "Привет. Чтобы узнать о возможностях бота воспользуйся командой /help";
    public static final String COMMAND_HELP_TEXT = "/start - приветствие\n/help - получение списка команд";
    public static final String UNKNOWN_COMMAND_TEXT = "Неизвестная команда!\nИпользуй /help для получения списка команд";

    public static String getBotToken() {
        return BOT_TOKEN;
    }
}
